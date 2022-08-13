package com.my.waimai.servlice;

import com.baomidou.mybatisplus.extension.service.IService;
import com.my.waimai.entity.Orders;
import com.my.waimai.mapper.OrdersMapper;

public interface OrdersService extends IService< Orders> {
    public void submit(Orders orders);
}
