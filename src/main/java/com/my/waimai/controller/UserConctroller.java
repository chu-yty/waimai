package com.my.waimai.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.my.waimai.common.R;
import com.my.waimai.entity.MyUser;
import com.my.waimai.entity.User;
import com.my.waimai.servlice.EmailService;
import com.my.waimai.servlice.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Slf4j
@RestController
@RequestMapping("/user")
public class UserConctroller {

    @Autowired
    public EmailService emailService; //邮箱服务
    @Autowired
    public UserService userService;

    /**
     * 要储存申请验证码的手机号   用于登录验证是否是同一人
     * @param email
     * @param session
     * @return
     */

    @PostMapping("/email")
    public R<String> createAuthCode(String email , HttpSession session){
        if(email!=null) {
            int code = emailService.Get(email);
            session.setAttribute("code", code);//验证码存到session中
        }
        return R.success("成功");
    }
    @PostMapping("/login")
    public R<User> login(@RequestBody MyUser user1, HttpSession session)
    {
        LambdaQueryWrapper<User> userlambda=new LambdaQueryWrapper<>();
        userlambda.eq(User::getPhone,user1.getPhone());

        User user = userService.getOne(userlambda);
        int code1= (int) session.getAttribute("code");
        int code2=Integer.valueOf(user1.code.trim());
        if ( code2 == code1) {
            if(user==null)
            {
                user=new User();
                user.setPhone(user1.phone.trim());
                user.setStatus(1);
                userService.save(user);
            }
            session.setAttribute("user",user.getId());
            return  R.success(user);
        }
        return  R.error("登陆失败");
    }

    @PostMapping("/loginout")
    public R loginout(HttpServletRequest req)
    {
        req.getSession().removeAttribute("employee");
        return R.error("退出成功");
    }


}
