package com.my.waimai.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.my.waimai.mytype.DishAndDishFlavor;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;
@Mapper
public interface ManyTable extends BaseMapper<DishAndDishFlavor> {

    List<DishAndDishFlavor> select (int start,int pageSize ,String name);
    int getcoun(String name);
}
