package com.my.waimai.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.my.waimai.common.MyBaseContext;
import com.my.waimai.common.R;
import com.my.waimai.entity.Dish;
import com.my.waimai.entity.Setmeal;
import com.my.waimai.entity.ShoppingCart;
import com.my.waimai.servlice.ShoppingCartService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/shoppingCart")
public class ShoppingCartConctroller {

    @Autowired
    private ShoppingCartService shoppingCartService;

    /**
     *
     * 获取购物车信息
     * @return
     */

    @GetMapping("/list")
    public R<List<ShoppingCart>> getlist()
    {
        LambdaQueryWrapper<ShoppingCart> lambda=new LambdaQueryWrapper<>();
        lambda.eq(ShoppingCart::getUserId,MyBaseContext.getMyThreadLocal());
        List<ShoppingCart> list = shoppingCartService.list();
        return R.success(list);
    }

    /**
     * 添加购物车
     * @param shoppingCart
     * @return
     */
    @PostMapping("/add")
    public R<ShoppingCart> add(@RequestBody ShoppingCart shoppingCart )
    {
        LambdaQueryWrapper<ShoppingCart> lambda = new LambdaQueryWrapper<>();
        lambda.eq(ShoppingCart::getUserId,shoppingCart.getUserId());
        lambda.eq(shoppingCart.getDishId()!=null,ShoppingCart::getDishId,shoppingCart.getDishId());
        lambda.eq(shoppingCart.getDishFlavor()!=null,ShoppingCart::getDishFlavor,shoppingCart.getDishId());
        lambda.eq(shoppingCart.getSetmealId()!=null,ShoppingCart::getSetmealId,shoppingCart.getSetmealId());
        ShoppingCart one = shoppingCartService.getOne(lambda);
        if(one!=null)
        {
            one.setNumber(one.getNumber()+1);
            shoppingCartService.save(one);
        }else
        {
            Long userid = (Long) MyBaseContext.getMyThreadLocal();
            shoppingCart.setUserId(userid);
            shoppingCart.setCreateTime(LocalDateTime.now());
            shoppingCartService.save(shoppingCart);
            one = shoppingCart;
        }

        return R.success(one);
    }

    /**
     * 清空购物车
     *
     * delete
     */

    @DeleteMapping("/clean")
    public R<String > delectAll()
    {
        LambdaQueryWrapper<ShoppingCart> lambda=new LambdaQueryWrapper<>();
        lambda.eq(ShoppingCart::getUserId,MyBaseContext.getMyThreadLocal());
        shoppingCartService.remove(lambda);
        return R.success("已清空");

    }

}
