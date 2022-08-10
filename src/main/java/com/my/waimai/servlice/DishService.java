package com.my.waimai.servlice;

import com.baomidou.mybatisplus.extension.service.IService;
import com.my.waimai.entity.Dish;
import com.my.waimai.mytype.DishAndDishFlavor;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DishService extends IService<Dish> {

    public void updata(DishAndDishFlavor dish);

    public void removedish(List<Long> dis);

}
