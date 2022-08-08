package com.my.waimai.common;

import com.my.waimai.common.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLInvalidAuthorizationSpecException;

@ResponseBody
@ControllerAdvice(annotations = {RestController.class , Controller.class})
@Slf4j
public class MyControllerAdrive {
    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    public R<String> myEcception(SQLIntegrityConstraintViolationException ex)
    {
        //
        String message = ex.getMessage();
        if(message.contains("Duplicate entry")) {
            String[] split = message.split(" ");
            return R.success(split[3] + "已存在");
        }
        return R.success("操作失败");

    }
}
