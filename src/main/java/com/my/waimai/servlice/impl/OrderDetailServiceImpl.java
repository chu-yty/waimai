package com.my.waimai.servlice.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.my.waimai.entity.OrderDetail;
import com.my.waimai.mapper.OrderDetailMapper;
import com.my.waimai.servlice.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {
}
