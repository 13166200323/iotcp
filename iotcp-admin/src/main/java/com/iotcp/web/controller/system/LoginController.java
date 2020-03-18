package com.iotcp.web.controller.system;

import com.iotcp.common.base.AjaxResult;
import com.iotcp.common.utils.StringUtils;
import com.iotcp.framework.util.ServletUtils;
import com.iotcp.web.core.base.BaseController;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登录验证
 * 
 * @author iotcp
 */
@Controller
public class LoginController extends BaseController
{

    /**
     * 用户如果没有登录就请求系统资源，就提示他，需要进行登录，而不是直接使用shior默认的跳转至登录页面login.jsp
     * @return
     */
    @GetMapping("/unLogin")
    @ResponseBody
    public AjaxResult unLogin()  {
        System.out.println("+++++++++++++++++please log in first++++++++++++++++++");
        return error("未登录或登录超时。请重新登录");
    }


    @GetMapping("/login")
    public String login(HttpServletRequest request, HttpServletResponse response)
    {
        // 如果是Ajax请求，返回Json字符串。
        if (ServletUtils.isAjaxRequest(request))
        {
            return ServletUtils.renderString(response, "{\"code\":\"1\",\"msg\":\"未登录或登录超时。请重新登录\"}");
        }

        return "login";
    }

    @PostMapping("/login")
    @ResponseBody
    public AjaxResult ajaxLogin(String username, String password, Boolean rememberMe)
    {
        UsernamePasswordToken token = new UsernamePasswordToken(username, password, rememberMe);
        Subject subject = SecurityUtils.getSubject();
        try
        {
            subject.login(token);
            return success();
        }
        catch (AuthenticationException e)
        {
            String msg = "用户或密码错误";
            if (StringUtils.isNotEmpty(e.getMessage()))
            {
                msg = e.getMessage();
            }
            return error(msg);
        }
    }
    /**
     * 用户退出登录 清除会话
     *
     * @return
     */
    @GetMapping("/signOut")
    @ResponseBody
    public AjaxResult logout() {
        try {
            // 获取subject
            Subject currentUser = SecurityUtils.getSubject();
            // 清除当前会话信息
            currentUser.logout();
            return success("成功");
        } catch (Exception e) {
            return error("失败");
        }
    }
    @GetMapping("/unauth")
    public String unauth()
    {
        return "/error/unauth";
    }
}
