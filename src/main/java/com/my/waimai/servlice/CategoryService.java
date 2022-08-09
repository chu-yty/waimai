package com.my.waimai.servlice;

import com.baomidou.mybatisplus.extension.service.IService;
import com.my.waimai.entity.Category;

public interface CategoryService extends IService <Category> {

    public void Remove(Long id);
}
