package com.my.waimai.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.my.waimai.common.R;
import com.my.waimai.entity.Setmeal;
import com.my.waimai.entity.SetmealDish;
import com.my.waimai.mapper.SetmealDtoMapper;
import com.my.waimai.mapper.SetmealMapper;
import com.my.waimai.mytype.ReturnType;
import com.my.waimai.mytype.SetmealDto;
import com.my.waimai.servlice.SetmealDishService;
import com.my.waimai.servlice.SetmealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * 套餐管理
 */

/**请求数据
     *
  1   * categoryId   : "1413342269393674242" 套餐分类ID
  1   * code             : ""  无用
  1   * description  : "4565646"  描述
     * dishList     : []   无用
     * idType       : "1413342269393674242"
  1   * image       : "6fac3415-feae-40b6-b256-6fe8ad2b7a242022-08-11-15-04-30.jpeg"  图片
  1   * name        : "684"   套餐名
  1   * price       : 78900  价格
 1 * status: 1  状态  1启用 0 禁用
 * 套餐信息             份数          菜品ID                            菜品名         价格
 * setmealDishes: [{copies: 2, dishId: "1397852391150759938", name: "辣子鸡丁", price: "8800.00"},…]
 * 0: {copies: 2, dishId: "1397852391150759938", name: "辣子鸡丁", price: "8800.00"}
 * 1: {copies: 2, dishId: "1397854652581064706", name: "麻辣水煮鱼", price: "14800.00"}

 */
@RestController
@RequestMapping("/setmeal")
public class SetmealController {

    @Autowired
    private SetmealService setmealService;
    @Autowired
    private SetmealDishService setmealDishService;
    @Autowired
    private SetmealDtoMapper setmealDtoMapper;
    @Autowired
    private SetmealMapper setmealMapper;


    /**
     * 添加套餐
     * @param sd
     * @return
     */
    @PostMapping
    public R<String > add(@RequestBody SetmealDto sd)
    {
        List<SetmealDish> setmealDishes = sd.getSetmealDishes();
        setmealService.save(sd);
        Long id = sd.getId();
        for (SetmealDish s:setmealDishes)
        {
            s.setSetmealId(id);
        }
        setmealDishService.saveBatch(setmealDishes);

        return R.success("添加成功");
    }

    /**
     * 套餐分页查询
     *
     */
    @GetMapping("/page")
    public R<ReturnType> getList( int page,int pageSize ,String name)
    {
        if(name!=null) name="%"+name+"%";

        page = (page-1)*pageSize;
        LambdaQueryWrapper <Setmeal> lambdaQueryWrapper =new LambdaQueryWrapper<>();
        lambdaQueryWrapper.like(name!=null,Setmeal::getName,name);

        int count = setmealService.count();
        List<SetmealDto> select = setmealDtoMapper.select(page, pageSize, name);
        ReturnType returnType =new ReturnType(count,select);
        return R.success(returnType);
    }

    /**
     * 删除套餐
     * @param ids
     * @return
     */
    @DeleteMapping
    public R<String> delete (@RequestParam List<Long> ids)
    {
        setmealService.delete(ids);
        return R.success("删除成功");
    }

    /**
     * 仅售套餐
     * @return
     */
    @PostMapping("/status/0")
    public R<String > updata0(@RequestParam List<Long> ids)
    {
        for ( Long id:ids)
        {
            setmealMapper.updateStatus0(id);
        }
        return  R.success("操作成功");
    }
    /**
     * 启售套餐
     * @return
     */
    @PostMapping("/status/1")
    public R<String > updata1(@RequestParam List<Long> ids)
    {
        for ( Long id:ids)
        {
            setmealMapper.updateStatus0(id);
        }
        return  R.success("操作成功");
    }




}
