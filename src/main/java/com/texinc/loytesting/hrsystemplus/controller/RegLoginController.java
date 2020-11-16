package com.texinc.loytesting.hrsystemplus.controller;

import com.texinc.loytesting.hrsystemplus.bean.RespBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author i@loyio.me
 * @date 2020/11/13 4:11 PM
 */
@RestController
public class RegLoginController {
    @RequestMapping("/login_p")
    public RespBean login() {
        return RespBean.error("尚未登录，请登录!");
    }
    @GetMapping("/employee/advanced/hello")
    public String hello() {
        return "hello";
    }
    @GetMapping("/employee/basic/hello")
    public String basicHello() {
        return "basicHello";
    }
}