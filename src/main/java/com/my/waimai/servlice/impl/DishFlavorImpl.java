package com.my.waimai.servlice.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.my.waimai.entity.DishFlavor;
import com.my.waimai.mapper.DishFlavorMapper;
import com.my.waimai.mapper.DishMapper;
import com.my.waimai.servlice.DishFlavorService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorImpl extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {
}
