package cn.rpy.controller;

import cn.rpy.utils.ResultObj;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("common")
/**
 * 不需要了
 */

public class CommonController {

    @RequestMapping("unLogin")
    public ResultObj unLogin(){
        return ResultObj.LOGIN_EMPTY;
    }
}
