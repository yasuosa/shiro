package cn.rpy.controller;


import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("user")
public class UserController {

    /**
     * 用户页面
     */
//    @RequestMapping("toUserManager")
//    public String toUserManager(){
//        return "userManager";
//    }


    @RequiresPermissions(value = "user:add")
    @RequestMapping("add")
    public Map<String,Object> add(){
        return new HashMap<String, Object>(){
            {put("msg","add");}
        };
    }

    @RequiresPermissions(value = "user:query")
    @RequestMapping("query")
    public Map<String,Object> query(){
        return new HashMap<String, Object>(){
            {put("msg","query");}
        };
    }

    @RequiresPermissions(value = "user:delete")
    @RequestMapping("delete")
    public Map<String,Object> delete(){
        return new HashMap<String, Object>(){
            {put("msg","delete");}
        };
    }

    @RequiresPermissions(value = "user:modify")
    @RequestMapping("modify")
    public Map<String,Object> modify(){
        return new HashMap<String, Object>(){  {put("msg","modify");}};
    }

    @RequiresPermissions(value = "user:export")
    @RequestMapping("export")
    public Map<String,Object> export(){
        return new HashMap<String, Object>(){
            {put("msg","export");}
        };
    }





}
