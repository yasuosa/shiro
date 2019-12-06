package cn.rpy.handler;


import cn.rpy.utils.ResultObj;
import org.apache.shiro.authz.UnauthenticatedException;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * 全局异常监控
 */
@RestControllerAdvice
public class GlobalExceptionHandlerAdvise {

    /**
     * 未授权
     * 只要当前项目的代码 抛出未授权的异常
     */
    @ExceptionHandler(value = {UnauthorizedException.class})
    public ResultObj unauthorized(){
        return ResultObj.UNAUTHORIZED;
    }




}
