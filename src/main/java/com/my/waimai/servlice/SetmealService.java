package com.my.waimai.servlice;

import com.baomidou.mybatisplus.extension.service.IService;
import com.my.waimai.entity.Setmeal;

import org.springframework.stereotype.Service;

import java.util.List;


public interface SetmealService extends IService<Setmeal> {

    public void delete(List<Long> ids);
}
