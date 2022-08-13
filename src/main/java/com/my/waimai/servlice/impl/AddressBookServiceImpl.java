package com.my.waimai.servlice.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.my.waimai.entity.AddressBook;
import com.my.waimai.mapper.AddressBookMapper;
import com.my.waimai.servlice.AddressBookService;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook>implements AddressBookService {
}
