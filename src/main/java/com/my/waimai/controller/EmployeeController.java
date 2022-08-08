package com.my.waimai.controller;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.my.waimai.Factory.MySession;
import com.my.waimai.common.R;
import com.my.waimai.entity.Employee;
import com.my.waimai.mapper.yonghuMapper;
import com.my.waimai.returntype.ReturnType;
import com.my.waimai.servlice.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;
import java.util.UUID;


@Slf4j
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    //登录处理
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
    //退出处理
    @PostMapping("/logout")
    public R<String > logout(HttpServletRequest req) {
        req.getSession().removeAttribute("employee");
        return R.success("退出成功");
    }
    //添加员工处理
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
        //生成19位数字做ID
        String idstr=Long.valueOf(UUID.randomUUID().getLeastSignificantBits()).toString().substring(6,12);
        StringBuffer stringBuffer=new StringBuffer(System.currentTimeMillis()+idstr);
        employee.setId(Long.valueOf(stringBuffer.toString()));


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

    /**
     * 查询员工处理
     * 请求数据
     * page: 1
     * pageSize: 10
     * name: 4564
     */
    @GetMapping("/page")
    public R<ReturnType> selectall(int page, int pageSize, String name)
    {
        int start=(page-1)*pageSize;
        int end=start+pageSize;
        if(name!=null) {
            if (name.trim().isEmpty()) {
                name = "%"+name+"%";
            }
        }
        List<Employee> employees  = MySession.getMapper(yonghuMapper.class).selectAll(start, end,name);
        int coun=employees.size();
        return R.success(new ReturnType(coun,employees));
    }
    /*
    修改员工信息
    请求信息
    //    emp.setUsername("忆童颜");
//        emp.setPhone("12345678944");
//        emp.setSex("1");
//        emp.setIdNumber("411445646546545461");
//        emp.setName("Mr.liang");
     */
    @PutMapping
    public R<String > update (HttpServletRequest req,
            @RequestBody Employee employee)
    {

        Long setID = (Long) req.getSession().getAttribute("employee");
        employee.setUpdateTime(new Date(System.currentTimeMillis()));
        employee.setUpdateUser(setID);
        Employee emp=MySession.getMapper(yonghuMapper.class).selectone(setID);
        employee.setUsername(emp.getName());
        int coun=0;
        if(employee.getName()==null)
            coun = MySession.getMapper(yonghuMapper.class).update(employee);
        else
            coun = MySession.getMapper(yonghuMapper.class).updaterow(employee);

        MySession.commit();
        if(coun!=0)
            return R.success("修改成功");
        else
            return R.success("修改失败");
    }
    /*
            根据ID查员工信息
     */
    @GetMapping("/{id}")
    public R<Employee> getID(@PathVariable Long id)
    {
        Employee selectone = MySession.getMapper(yonghuMapper.class).selectone(id);
        return R.success(selectone);

    }

}











