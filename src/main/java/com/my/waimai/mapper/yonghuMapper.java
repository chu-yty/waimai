package com.my.waimai.mapper;

import com.my.waimai.entity.Employee;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;


public interface yonghuMapper {

    //查询用户（因用户名不能重复所以返回一条数据
    @Select("select * from employee where username = #{name}")
    Employee select(@Param("name") String name);
    int addstaff(Employee employee);


}
