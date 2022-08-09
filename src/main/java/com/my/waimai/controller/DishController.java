package com.my.waimai.controller;




import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.my.waimai.common.R;
import com.my.waimai.entity.Dish;
import com.my.waimai.mytype.DishAndDishFlavor;
import com.my.waimai.servlice.DishService;
import com.my.waimai.servlice.SetmealService;
import lombok.extern.slf4j.Slf4j;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/dish")
public class DishController {
    @Autowired
    private SetmealService setmealService;
    @Autowired
    private DishService dishService;

    /**
     * 查询列表
     * 请求数据page=1&pageSize=10
     * @return
     */
    @GetMapping("/page")
    public R<Page> getSetmealList(int page, int pageSize,String name)
    {
        if(name!=null)
            name="%"+name+"%";
        //创建分页构造器
        Page page1=new Page<>(page,pageSize);
        //创建条件构造器
        LambdaQueryWrapper<Dish> SetmeallambdeaQueryapper = new LambdaQueryWrapper<>();
        //执行条件查询
        SetmeallambdeaQueryapper.like(StringUtils.isNotEmpty(name),Dish::getName,name);
        //执行升序排序
        SetmeallambdeaQueryapper.orderByDesc(Dish::getStatus);

        dishService.page(page1,SetmeallambdeaQueryapper);
        return  R.success(page1);
    }

    @PostMapping
    public R<String > addDish(@RequestBody DishAndDishFlavor dish)
    {
        dishService.updata(dish);

        return R.success("添加成功");
    }





}
