package com.my.waimai.mapper;

import com.my.waimai.mytype.DishAndDishFlavor;


import java.util.List;

public interface ManyTable {

    List<DishAndDishFlavor> select (int start,int pageSize ,String name);
    int getcoun(String name);
}
