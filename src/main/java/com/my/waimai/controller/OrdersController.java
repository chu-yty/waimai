package com.my.waimai.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.my.waimai.common.R;

import com.my.waimai.entity.Orders;
import com.my.waimai.servlice.OrdersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;


/**
 * 订单
 */
@Slf4j
@RestController
@RequestMapping("/order")
public class OrdersController {

    @Autowired
    private OrdersService ordersService;
    @GetMapping("/page")
    public R<Page> getList(int page, int pageSize , String number ,LocalDateTime beginTime ,LocalDateTime endTime)
    {
        Page<Orders> page1=new Page<>(page,pageSize);
        LambdaQueryWrapper<Orders> lambda=new LambdaQueryWrapper<>();
        lambda.like(number!=null,Orders::getNumber ,number);
        lambda.ge(beginTime!=null,Orders::getOrderTime,beginTime);
        lambda.le(endTime!=null,Orders::getOrderTime,endTime);
        lambda.like(endTime!=null,Orders::getNumber ,number);
        ordersService.page(page1,lambda);

        return R.success(page1);
    }
}
