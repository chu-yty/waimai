package com.my.waimai.mytype;

import com.my.waimai.entity.Dish;
import com.my.waimai.entity.DishFlavor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
//
//categoryId: "1397844303408574465" 菜品ID
//        code: "" 商品码
//        description: "757527" 描述
//        flavors: [] 口味
//        image: "3fb1b589-af71-4ee3-8c50-51eae16bde782022-08-10-01-52-20.jpg" 图片名
//        name: "45242" 菜名
//        price: 88800   价格
//        status: 1  状态

@Data
public class DishAndDishFlavor extends Dish {
    private List<DishFlavor> flavors;



}
