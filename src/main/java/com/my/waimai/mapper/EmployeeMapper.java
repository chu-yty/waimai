package com.my.waimai.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.my.waimai.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
//    查询全部员工
//    @Select(select id,name,username,password,phone,sex,idNumber,status,createTime,updateTime,createUser
//            from employee);
    Employee SelectAll();

}
