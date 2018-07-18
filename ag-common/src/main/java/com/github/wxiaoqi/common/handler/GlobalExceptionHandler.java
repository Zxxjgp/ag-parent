package com.github.wxiaoqi.common.handler;

import com.github.wxiaoqi.common.constant.RestCodeConstants;
import com.github.wxiaoqi.common.exception.BaseException;
import com.github.wxiaoqi.common.msg.BaseResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@ControllerAdvice("com.github.wxiaoqi.learning.uc")
@ResponseBody
public class GlobalExceptionHandler {
    @ExceptionHandler(BaseException.class)
    public BaseResponse baseExceptionHandler(HttpServletResponse response, BaseException ex){
        return new BaseResponse(ex.getStates(),ex.getMessage());

    }

    @ExceptionHandler(Exception.class)
    public BaseResponse otherExceptionHandler(HttpServletResponse response, Exception ex){
        return new BaseResponse(RestCodeConstants.EX_OTHER_CODE,ex.getMessage());

    }
}
