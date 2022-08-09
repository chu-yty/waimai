package com.my.waimai.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.my.waimai.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}
