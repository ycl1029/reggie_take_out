package com.itheima.reggie_take_out.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLIntegrityConstraintViolationException;

/**
 * Class Name: GlobalExceptionHandler
 * Description: 利用拦截器统一抛出异常
 *
 * @Author 原常乐
 * @Create 2023/12/28 17:43
 * @Version 1.0
 */
@ControllerAdvice(annotations = {RestController.class, Controller.class})
@ResponseBody
public class GlobalExceptionHandler {
    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    public R<String> execeptionHandler(SQLIntegrityConstraintViolationException e){

        if (e.getMessage().contains("Duplicate entry")){
            String[] split = e.getMessage().split(" ");
            String msg = split[2] + "已存在";
            return R.error(msg);
        }
        return R.error("未知错误");
    }
    //处理自定义的业务异常

    @ExceptionHandler(CustomException.class)
    public R<String> execeptionHandler(CustomException e){

        return R.error(e.getMessage());
    }

}
