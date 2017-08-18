package com.zhiboer.mall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by yao on 2017/7/25.
 */
@Controller
@RequestMapping(value = "/auth")
public class AuthController {

    @RequestMapping(value = "/toStatistics", method = RequestMethod.GET)
    public String toUser() {
        return "statistics";
    }

    @RequestMapping(value = "/toGather", method = RequestMethod.GET)
    public String toGather() {
        return "gather";
    }

    @RequestMapping(value = "/toPayment", method = RequestMethod.GET)
    public String toPayment() {
        return "payment";
    }
}
