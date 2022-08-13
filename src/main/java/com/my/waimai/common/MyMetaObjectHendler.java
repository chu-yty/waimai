package com.my.waimai.common;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Slf4j

public class MyMetaObjectHendler implements MetaObjectHandler {
    /*
            插入操作自动更新公共字段
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("公共字段自动填充[insert]...");
        log.info(metaObject.toString());

        metaObject.setValue("createTime", LocalDateTime.now());
        metaObject.setValue("updateTime",LocalDateTime.now());
        metaObject.setValue("createUser", MyBaseContext.getMyThreadLocal());
        metaObject.setValue("updateUser", MyBaseContext.getMyThreadLocal());

    }
    /*
               修改操作自动更新公共字段
        */
    @Override
    public void updateFill(MetaObject metaObject) {

        metaObject.setValue("updateTime",LocalDateTime.now());
        metaObject.setValue("updateUser", MyBaseContext.getMyThreadLocal());

    }
}
