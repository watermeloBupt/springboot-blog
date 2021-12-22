package com.jxy.blog.controller;

import com.jxy.blog.service.LoginService;
import com.jxy.blog.vo.Result;
import com.jxy.blog.vo.params.LoginParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("logout")
public class LogoutController {
    @Autowired
    LoginService loginService;

    @GetMapping("")
    public Result Login(@RequestHeader("Authorization") String token) {
        return loginService.logout(token);
    }
}
