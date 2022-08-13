package com.my.waimai.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.my.waimai.common.MyBaseContext;
import com.my.waimai.common.R;
import com.my.waimai.entity.AddressBook;
import com.my.waimai.servlice.AddressBookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/addressBook")
public class AddressBookController {

    @Autowired
    private AddressBookService addressBookService;


    /**
     *    添加收货地址
     * @param addressBook
     * @return
     */
    @PostMapping
    public R<AddressBook > add(@RequestBody AddressBook addressBook)
    {
        addressBook.setUserId((Long) MyBaseContext.getMyThreadLocal());
        addressBookService.save(addressBook);
        return R.success(addressBook);
    }

    /**
     * 默认地址  get请求  /default
     */
    @GetMapping("/default")
    public R<AddressBook> get()
    {
        LambdaQueryWrapper<AddressBook> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(AddressBook::getUserId, MyBaseContext.getMyThreadLocal());
        queryWrapper.eq(AddressBook::getIsDefault, 1);
        AddressBook addressBook = addressBookService.getOne(queryWrapper);
        if(addressBook != null)
        {
            return R.success(addressBook);
        }else
        {
            return R.error("没有找到");
        }
    }

    /**
     * list  地址  get请求  /list
     */

    @GetMapping("/list")
    public R<List<AddressBook>> getList(AddressBook addressBook)
    {
        addressBook.setUserId((Long)MyBaseContext.getMyThreadLocal());

        LambdaQueryWrapper <AddressBook> lambda = new LambdaQueryWrapper<>();
        lambda.eq(null !=addressBook.getUserId(),AddressBook::getUserId,addressBook.getUserId());
        lambda.orderByDesc(AddressBook::getUpdateTime);

        return R.success(addressBookService.list(lambda));

    }
    /**
     * 设置默认地址
     */
    @PutMapping("/default")
    public R<AddressBook > updata (@RequestBody AddressBook addressBook)
    {
        LambdaUpdateWrapper <AddressBook> lambda = new LambdaUpdateWrapper<>();
        lambda.eq(AddressBook::getUserId,MyBaseContext.getMyThreadLocal());
        lambda.set(AddressBook::getIsDefault,0);
        addressBookService.update(lambda);
        addressBook.setIsDefault(1);
        addressBookService.updateById(addressBook);
        return R.success(addressBook);

    }



}
