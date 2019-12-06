package cn.rpy.utils;

public class   ResultObj {

    public static  ResultObj LOGOUT_SUCCESS =new ResultObj("200","退出成功") ; ;
    public static  ResultObj UNAUTHORIZED =new ResultObj("405","未授权") ;
    public static  ResultObj LOGIN_EMPTY =new ResultObj("403","未登录") ;
    public static ResultObj LOGIN_SUCCESS=new ResultObj("200","登陆成功");
    public static ResultObj LOGIN_ERROR=new ResultObj("-1","登陆失败");





    private String code;
    private String msg;
    private ResultObj(String code,String msg){
        this.code=code;
        this.msg=msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
