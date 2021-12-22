package com.jxy.blog.controller;

import com.jxy.blog.service.LoginService;
import com.jxy.blog.vo.Result;
import com.jxy.blog.vo.params.LoginParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Comparator;

@RestController
@RequestMapping("/register")
public class RegisterController {
    @Autowired
    private LoginService loginService;

    @PostMapping("")
    public Result register(@RequestBody LoginParams loginParams) {
        //sso 单点登录
        return loginService.register(loginParams);

    }
}
