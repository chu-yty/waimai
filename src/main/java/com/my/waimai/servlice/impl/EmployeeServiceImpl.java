package com.my.waimai.servlice.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.my.waimai.entity.Employee;
import com.my.waimai.mapper.EmployeeMapper;
import com.my.waimai.servlice.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
