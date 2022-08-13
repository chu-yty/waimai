package com.my.waimai.servlice.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.my.waimai.servlice.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public int Get(String email) {
//        SimpleMailMessage message = new SimpleMailMessage();
//        message.setFrom("1689724409@qq.com");  //发送验证码的qq邮箱，模拟作为公司的服务端
//        message.setTo(email);  //就是传过来的emil，正在注册的QQ邮箱账号
//        message.setSubject("注册验证码");
//        String code = createCode();   //创建验证码
//        message.setText(code);        //把创建的验证码set进message中
//        javaMailSender.send(message); //发送邮件


        SimpleMailMessage message = new SimpleMailMessage();    //邮件消息构造器
        message.setFrom("1448020222@qq.com");    //发件人
        message.setTo(email);    //收件人
        message.setSubject("验证码");    //主题
        String code = createCode();
        message.setText("您本次的验证码是："+code);    //邮件正文内容
        javaMailSender.send(message);



        return Integer.valueOf(code);
    }
    public String createCode(){
        //随机生成6位数字验证码
        Random random = new Random();
        int randomNum = random.nextInt(1000000);//0-999999  000023  456 99898
        String randomCode = String.format("%06d", randomNum);//格式化
        return randomCode;
    }

}
