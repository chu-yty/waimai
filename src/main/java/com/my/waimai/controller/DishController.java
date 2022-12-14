package com.my.waimai.controller;




import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.my.waimai.Factory.MySession;
import com.my.waimai.common.R;
import com.my.waimai.entity.Category;
import com.my.waimai.entity.Dish;
import com.my.waimai.entity.DishFlavor;
import com.my.waimai.mapper.DishMapper;
import com.my.waimai.mapper.ManyTable;
import com.my.waimai.mytype.DishAndDishFlavor;
import com.my.waimai.mytype.ReturnType;
import com.my.waimai.servlice.CategoryService;
import com.my.waimai.servlice.DishFlavorService;
import com.my.waimai.servlice.DishService;

import com.my.waimai.servlice.SetmealService;
import lombok.extern.slf4j.Slf4j;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j

@RestController
@RequestMapping("/dish")
public class DishController {
    @Autowired
    private ManyTable manyTable;
    @Autowired
    private SetmealService setmealService;
    @Autowired
    private DishService dishService;

    @Autowired
    private DishFlavorService dishFlavorService;
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private DishMapper dishMapper;

    @Value("${waimai.Path}")
    private String Basepath;

    /**
     * 查询列表
     * 请求数据page=1&pageSize=10
     * @return
     */
    @GetMapping("/page")
    public R<ReturnType> getSetmealList(int page, int pageSize,String name)
    {
        page=(page-1)*pageSize;
        if(name!=null)
            name="%"+name+"%";

//      简化的连接查询
        List<DishAndDishFlavor> select = manyTable.select(page, pageSize, name);
        int coun = manyTable.getcoun(name);
        ReturnType returnType=new ReturnType(coun,select);

        /**
         * 代码臃肿 改写为连接查询
         */
        //创建分页构造器
//        Page<Dish> page1=new Page<>(page,pageSize);
//        Page<DishAndDishFlavor> page2=new Page<>();
//        //创建条件构造器
//        LambdaQueryWrapper<Dish> SetmeallambdeaQueryapper = new LambdaQueryWrapper<>();
//        //执行条件查询
//        SetmeallambdeaQueryapper.like(StringUtils.isNotEmpty(name),Dish::getName,name);
//        //执行升序排序
//        SetmeallambdeaQueryapper.orderByDesc(Dish::getStatus);
//        //查询dish数据
//        dishService.page(page1,SetmeallambdeaQueryapper);
//        //数据拷贝 去除page1中的records属性 因为里边是基础属性，后边会单独取出赋值给每一个DishAndDishFlavor
//        BeanUtils.copyProperties(page1,page2,"records");
//        //取出page1的Dish
//        List<Dish> dishList=page1.getRecords();
//        List<DishAndDishFlavor> DtoList = dishList.stream().map((item)->{
//            DishAndDishFlavor dishAndDishFlavor=new DishAndDishFlavor();
//            //把item的值赋给dishAndDishFlavor
//            BeanUtils.copyProperties(item,dishAndDishFlavor);
//            Long categoryId = item.getCategoryId();
//            Category byId = categoryService.getById(categoryId);
//            if(byId !=null)
//            {
//                dishAndDishFlavor.setCategoryName(byId.getName());
//            }
//            return dishAndDishFlavor;
//        }).collect(Collectors.toList());
//        page2.setRecords(DtoList);
//
        return  R.success(returnType);
    }

    /**
     * 菜品添加操作
     * @param dish
     * @return
     */
    @PostMapping
    public R<String > addDish(@RequestBody DishAndDishFlavor dish)
    {
        dishService.updata(dish);

        return R.success("添加成功");
    }
    /**
     * 菜品删除操作
     */

    @DeleteMapping
    public R<String> RemoveDish(@RequestParam List<Long> ids)
    {
        dishService.removedish(ids);
        return R.success("删除成功");
    }



//    @DeleteMapping
//    public R<String> RemoveDish(String ids)
//    {
//        String[] IDs = ids.split(",");
//
//        for (String id :IDs)
//        {
//            Dish dish = dishService.getById(Long.valueOf(id));
//            String path = dish.getImage();
//            dishService.removeById(Long.valueOf(id));
//            //删除关联图片
//            File file = new File(Basepath+path);
//            if (file.isFile())
//            {
//                file.delete();
//            }
//        }
//
//        return R.success("删除成功");
//    }

    /**
     * 禁售菜品
     * @return
     */
    @PostMapping("/status/0")
    public R<String >jinshou( String ids)
    {
        String[] IDs = ids.split(",");
        for (String id :IDs)
        {
            dishMapper.updateStatus0(Long.valueOf(id));
        }
        return R.success("操作完成");
    }

    /**
     * 起售菜品
     * @return
     */
    @PostMapping("/status/1")
    public R<String > qishou(String ids)
    {
        String[] IDs = ids.split(",");
        for (String id :IDs)
        {
            dishMapper.updateStatus1(Long.valueOf(id));
        }

        return R.success("操作完成");
    }

    /**
     * 获取菜品列表
     * @param categoryId
     * @param name
     * @return
     */
    @GetMapping("/list")
    public R<List<DishAndDishFlavor>> getDishList(Long categoryId ,String name)
    {
        LambdaQueryWrapper<Dish> lambdaQueryWrapper=new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(categoryId !=null,Dish::getCategoryId, categoryId);
        lambdaQueryWrapper.like(name!=null,Dish::getName,name);
        lambdaQueryWrapper.eq(Dish::getStatus,1);

        List<Dish> list = dishService.list(lambdaQueryWrapper);
        List<DishAndDishFlavor> list1 = list.stream().map((dish)->{
            DishAndDishFlavor dishAndDishFlavor=new DishAndDishFlavor();
            LambdaQueryWrapper<DishFlavor> lambda=new LambdaQueryWrapper<>();
            lambda.eq(DishFlavor::getDishId,dish.getId());
            List<DishFlavor> one = dishFlavorService.list(lambda);
            BeanUtils.copyProperties(dish,dishAndDishFlavor);
            dishAndDishFlavor.setFlavors(one);
            return dishAndDishFlavor;
        }).collect(Collectors.toList());


        return R.success(list1);
    }



}
