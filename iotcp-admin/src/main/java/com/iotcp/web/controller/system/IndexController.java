package com.iotcp.web.controller.system;


import com.iotcp.common.config.Global;
import com.iotcp.system.domain.SysMenu;
import com.iotcp.system.domain.SysUser;
import com.iotcp.system.service.ISysMenuService;
import com.iotcp.web.core.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 首页 业务处理
 * 
 * @author iotcp
 */
@Controller
public class IndexController extends BaseController
{
    @Autowired
    private ISysMenuService menuService;

    // 系统首页
    @GetMapping("/index")
    @ResponseBody
    public  Map<Object,Object> index()
    {
        Map<Object,Object> map = new HashMap<>();
        // 取身份信息
        SysUser user = getUser();
        // 根据用户id取出菜单
        List<SysMenu> menus = menuService.selectMenusByUser(user);
        map.put("limits",menus);
        map.put("userInfo",user);
        return map;
    }

    // 系统介绍
    @GetMapping("/system/main")
    public String main(ModelMap mmap)
    {
        mmap.put("version", Global.getVersion());
        return "main";
    }
}
