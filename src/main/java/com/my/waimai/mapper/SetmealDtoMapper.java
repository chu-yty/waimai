package com.my.waimai.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.my.waimai.mytype.DishAndDishFlavor;
import com.my.waimai.mytype.SetmealDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.sql.Wrapper;
import java.util.List;
@Mapper
public interface SetmealDtoMapper extends BaseMapper<SetmealDto> {

//    public String querysql ="SELECT a.*,b.name AS categoryName FROM setmeal AS a LEFT JOIN category AS b ON a.category_id = b.id";
//    public String wrappersql = "SELECT * FROM ("+querysql+") AS Q ${e.CustomSqlSegment}";
//
//    @Select(wrappersql)
//    Page<SetmealDto> page(Page page,@Param("e")Wrapper queryWrapper);

    List<SetmealDto> select (int start, int pageSize , String name);





}
