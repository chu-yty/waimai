package com.my.waimai.servlice.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.my.waimai.entity.Dish;
import com.my.waimai.entity.DishFlavor;
import com.my.waimai.mapper.DishMapper;
import com.my.waimai.mytype.DishAndDishFlavor;
import com.my.waimai.servlice.DishFlavorService;
import com.my.waimai.servlice.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DishServiceImpl extends ServiceImpl<DishMapper, Dish> implements DishService {
    @Autowired
    private  DishFlavorService dishFlavorService;

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

    @Override
    public void removedish(List<Long> dis) {




        dishFlavorService.removeByIds(dis);

    }
}
