package com.jxy.blog.controller;

import com.jxy.blog.service.LoginService;
import com.jxy.blog.vo.Result;
import com.jxy.blog.vo.params.LoginParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    LoginService loginService;

    @PostMapping("")
    public Result Login(@RequestBody LoginParams loginParams) {
        return loginService.login(loginParams);
    }
}
