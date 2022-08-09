package com.my.waimai.common;

import com.my.waimai.common.R;
import com.my.waimai.myexception.DelException;
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
        log.error(message);
        if(message.contains("Duplicate entry")) {
            String[] split = message.split(" ");
            return R.error(split[2] + "已存在");
        }
        return R.error("操作失败");

    }

    /**
     * 自定义异常
     * @param ex
     * @return
     */
        @ExceptionHandler(DelException.class)
        public R<String> DelException(DelException ex)
        {
            //
            String message = ex.getMessage();
            log.info(message);
            return R.error(message);

        }

}
