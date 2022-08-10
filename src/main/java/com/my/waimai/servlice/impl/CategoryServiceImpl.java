package com.my.waimai.servlice.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.my.waimai.entity.Category;
import com.my.waimai.entity.Dish;

import com.my.waimai.entity.Setmeal;
import com.my.waimai.mapper.CategoryMapper;
import com.my.waimai.myexception.DelException;
import com.my.waimai.servlice.CategoryService;
import com.my.waimai.servlice.DishFlavorService;
import com.my.waimai.servlice.DishService;
import com.my.waimai.servlice.SetmealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {
    @Autowired
    private DishService dishService;
    @Autowired
    private SetmealService setmealService;
    /**
     * 自定义删除分类
     * @param id
     */


    public void Remove(Long id) {
        //创建构造器
        LambdaQueryWrapper<Dish> lambdaQueryWrapper =new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(Dish::getId,id);
        int count1 = dishService.count(lambdaQueryWrapper);
        //判断该分类是否关联菜品
        if(count1>0)
        {   //抛出自定义异常
            throw new DelException("关联的有菜品不能删除");
        }
        LambdaQueryWrapper<Setmeal> setameallambdaQueryWrapper =new LambdaQueryWrapper<>();
        setameallambdaQueryWrapper.eq(Setmeal::getCategoryId,id);
        int count2 = setmealService.count(setameallambdaQueryWrapper);
        //判断该分类是否关联套餐
        if(count2>0)
        {   //抛出自定义异常
            throw new DelException("关联的有套餐不能删除");
        }
        super.removeById(id);

    }
}
