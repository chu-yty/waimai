package com.my.waimai.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.my.waimai.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
