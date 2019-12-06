package cn.rpy.controller;

import cn.rpy.service.UserService;
import cn.rpy.utils.ActivierUser;
import cn.rpy.utils.ResultObj;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * 登陆控制器
 */
@RestController
@RequestMapping("login")
public class LoginController {


    @RequestMapping("login")
    public ResultObj login(String username, String password, HttpSession session) {
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        try {
            subject.login(token);
            return ResultObj.LOGIN_SUCCESS;
        } catch (AuthenticationException e) {
            e.printStackTrace();
            return ResultObj.LOGIN_ERROR;
        }
    }


    @RequestMapping("logout")
    public ResultObj logout(){
        Subject subject=SecurityUtils.getSubject();
        subject.logout();
        return ResultObj.LOGOUT_SUCCESS;
    }


//    /**
//     * 跳转登陆页面
//     */
//
//    @RequestMapping("toLogin")
//    public String toLogin(){
//        return "login";
//    }
//
//    /**
//     * 做登录
//     */
//    @RequestMapping("login")
//    public String login(String username, String password, HttpSession session){
//        //得到主体
//        Subject subject = SecurityUtils.getSubject();
//        UsernamePasswordToken token=new UsernamePasswordToken(username,password);
//        try {
//            subject.login(token);
//            System.out.println("登陆成功");
//            ActivierUser user = (ActivierUser) subject.getPrincipal();
//            session.setAttribute("user",user.getUser());
//            return "redirect:/user/toUserManager.action";
//        } catch (AuthenticationException e) {
//            e.printStackTrace();
//            return "redirect:/index.jsp";
//        }
//    }
}
