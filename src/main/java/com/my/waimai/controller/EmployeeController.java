package com.my.waimai.controller;

import com.my.waimai.common.R;
import com.my.waimai.entity.Employee;
import com.my.waimai.servlice.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/login")
    public R<Employee> login(HttpRequest req, @RequestBody Employee employee){
        return null;
    };

}











