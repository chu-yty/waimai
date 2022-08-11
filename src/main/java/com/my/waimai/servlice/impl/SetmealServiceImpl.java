package com.my.waimai.servlice.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.my.waimai.entity.Dish;
import com.my.waimai.entity.Setmeal;
import com.my.waimai.entity.SetmealDish;
import com.my.waimai.mapper.SetmealMapper;
import com.my.waimai.myexception.DelException;
import com.my.waimai.servlice.SetmealDishService;
import com.my.waimai.servlice.SetmealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class SetmealServiceImpl extends ServiceImpl<SetmealMapper, Setmeal> implements SetmealService {
    @Autowired
    public SetmealDishService setmealDishService;
    @Value("${waimai.Path}")
    public String BasePath;

    @Transactional
    public void delete(List<Long> ids) {
        LambdaQueryWrapper<Setmeal> lambda1 = new LambdaQueryWrapper<>();
        lambda1.in(Setmeal::getId, ids);
        lambda1.eq(Setmeal::getStatus, 1);



        LambdaQueryWrapper<SetmealDish> lambda2 = new LambdaQueryWrapper<>();
        lambda2.in(SetmealDish::getSetmealId, ids);

        int count = this.count(lambda1);
        if (count > 0) throw new DelException("有在售套餐，不能删除");
        else {
                for (Long d:ids)
                {
                    LambdaQueryWrapper<Setmeal> lambda3 = new LambdaQueryWrapper<>();
                    lambda3.eq(Setmeal::getId, d);
                    Setmeal dish = this.getOne(lambda3);
                    deletimage(dish.getImage());
                }
                this.removeByIds(ids);//根据id
                setmealDishService.remove(lambda2);//根据表达式

            this.removeByIds(ids);
            setmealDishService.removeByIds(ids);

        }
    }
    private void deletimage(String path)
    {
        try {
            File file = new File(BasePath+path);
            if (file.isFile())
            {
                file.delete();
            }
        } catch (Exception e) {

        }
    }
}