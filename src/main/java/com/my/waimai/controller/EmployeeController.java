package com.my.waimai.controller;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.my.waimai.Factory.MySession;
import com.my.waimai.common.R;
import com.my.waimai.entity.Employee;
import com.my.waimai.mapper.yonghuMapper;
import com.my.waimai.servlice.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;


@Slf4j
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/login")
    public R<Employee> login(HttpServletRequest req, @RequestBody Employee employee){

        String password=employee.getPassword();
        password = DigestUtils.md5DigestAsHex(password.getBytes());
        String name=employee.getUsername();
        Employee emp = MySession.mysession.getMapper(yonghuMapper.class).select(employee.getUsername());



//        LambdaQueryWrapper<Employee> queryWrapper = new LambdaQueryWrapper<>();
//        queryWrapper.eq(Employee::getUsername,employee.getUsername());
//        Employee emp = employeeService.getOne(queryWrapper);
        System.out.println(emp);
        if(emp==null)
        {
            return R.error("登陆失败");
        }
        if(!emp.getPassword().equals(password))
        {
            return R.error("密码错误");
        }
        if(emp.getStatus()==0)
        {
            return R.error("账号禁用");
        }

        req.getSession().setAttribute("employee",emp.getId());
        return R.success(emp);
    };
    @PostMapping("/logout")
    public R<String > logout(HttpServletRequest req) {
        req.getSession().removeAttribute("employee");
        return R.success("退出成功");
    }
    @PostMapping
    public R<String > addstaff(HttpServletRequest req,@RequestBody Employee employee)
    {
//        默认密码为123456
        String password=DigestUtils.md5DigestAsHex("123456".getBytes());

        employee.setPassword(password);
//        emp.setUsername("忆童颜");
//        emp.setPhone("12345678944");
//        emp.setSex("1");
//        emp.setIdNumber("411445646546545461");
//        emp.setName("Mr.liang");


        employee.setCreateTime(new Date(System.currentTimeMillis()));
        employee.setUpdateTime(new Date(System.currentTimeMillis()));
        //当前登陆者id
        long id = (long) req.getSession().getAttribute("employee");
        employee.setCreateUser(id);
        employee.setUpdateUser(id);
        SqlSession session=MySession.mysession;
        int coun = session.getMapper(yonghuMapper.class).addstaff(employee);
        session.commit();
        if(coun>0)
            return R.success("添加成功");
        else
            return R.success("添加失败");
    }

}











