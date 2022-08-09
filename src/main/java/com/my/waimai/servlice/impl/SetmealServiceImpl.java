package com.my.waimai.servlice.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.my.waimai.entity.Setmeal;
import com.my.waimai.mapper.SetmealMapper;
import com.my.waimai.servlice.SetmealService;
import org.springframework.stereotype.Service;

@Service
public class SetmealServiceImpl extends ServiceImpl<SetmealMapper, Setmeal> implements SetmealService {
}
