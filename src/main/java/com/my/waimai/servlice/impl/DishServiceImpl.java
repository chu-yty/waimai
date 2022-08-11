package com.my.waimai.servlice.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.my.waimai.entity.Dish;
import com.my.waimai.entity.DishFlavor;
import com.my.waimai.mapper.DishMapper;
import com.my.waimai.myexception.DelException;
import com.my.waimai.mytype.DishAndDishFlavor;
import com.my.waimai.servlice.DishFlavorService;
import com.my.waimai.servlice.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class DishServiceImpl extends ServiceImpl<DishMapper, Dish> implements DishService {
    @Autowired
    private  DishFlavorService dishFlavorService;
    @Autowired
    private  DishService dishService;
    @Value("${waimai.Path}")
    private  String BasePath;
    /**
     * 添加菜品
     * @param dish
     */

    @Transactional
    public void updata(DishAndDishFlavor dish) {

        //储存菜品基本信息
        super.save(dish);
        Long id=dish.getId();
        List<DishFlavor> flavors = dish.getFlavors();
        flavors = flavors.stream().map((item) -> {
            item.setDishId(id);

            return item;
        }).collect(Collectors.toList());
//        for( DishFlavor df:flavors)
//        {
//            df.setDishId(id);
//            df.setIsDeleted(0);
//        }
        dishFlavorService.saveBatch(flavors);
    }

    @Transactional
    public void removedish(List<Long> dis) {

        LambdaQueryWrapper<Dish> lambdaQueryWrapper=new LambdaQueryWrapper<>();
        lambdaQueryWrapper.in(Dish::getId,dis);
        lambdaQueryWrapper.eq(Dish::getStatus,1);
        int count = this.count(lambdaQueryWrapper);


        LambdaQueryWrapper<DishFlavor> lambdaQueryWrapper1=new LambdaQueryWrapper<>();
        lambdaQueryWrapper1.in(DishFlavor::getDishId,dis);

        if(count>0)
            throw new DelException("包含在售菜品不能删除");
        else
        {
            for (Long l:dis)
            {
                LambdaQueryWrapper<Dish> lambdaQueryWrapper3=new LambdaQueryWrapper<>();
                lambdaQueryWrapper3.eq(Dish::getId,l);
                Dish dish = this.getOne(lambdaQueryWrapper3);
                deletimage(dish.getImage());
            }
            this.removeByIds(dis);
            dishFlavorService.remove(lambdaQueryWrapper1);

        }

    }

    private void deletimage(String path)
    {
        try {
            File file = new File(BasePath+path);
            if (file.isFile())
            {
                file.delete();
            }
        } catch (Exception e) {

        }
    }
}
