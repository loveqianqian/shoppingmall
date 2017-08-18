package com.zhiboer.mall.controller;

import com.zhiboer.mall.model.Role;
import com.zhiboer.mall.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.print.attribute.standard.MediaSize;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by yao on 2017/8/2.
 */
@Controller
@RequestMapping(value = "/page")
public class PageController {

    @Autowired
    private RoleService roleService;

    @RequestMapping(value = "/to/{pageName}")
    public String toPage(@PathVariable String pageName, HttpServletRequest request) {
        if ("user".equals(pageName)) {
            List<Role> roles = roleService.findAll();
            request.setAttribute("roles", roles);
        }
        return pageName;
    }
}
