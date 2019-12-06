package cn.rpy.filter;

import cn.rpy.utils.ResultObj;
import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSON;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class ShiroLoginFilter extends FormAuthenticationFilter {


    /**
     * 如果用户未登录就回调 这个方法
     * @param request
     * @param response
     * @param mappedValue
     * @return
     * @throws Exception
     */
    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception {

        HttpServletResponse resp= (HttpServletResponse) response;
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        PrintWriter writer = resp.getWriter();
        writer.write(JSON.toJSONString(ResultObj.LOGIN_EMPTY));
        writer.flush();
        return false;
    }
}
