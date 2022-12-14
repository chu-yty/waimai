package com.my.waimai.mapper;

import com.my.waimai.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
public interface yonghuMapper {

    //查询用户（因用户名不能重复所以返回一条数据
    @Select("select * from employee where username = #{name}")
    Employee selectlogin (@Param("name") String name);
    int select(@Param("name") String name);

    List<Employee> selectAll(int start, int pageSize , String name);
    int addstaff(Employee employee);

    int update(Employee employee);

    int updaterow(Employee employee);

    @Select("select * from employee where id=#{id} ;")
    Employee selectone(Long id);

}
