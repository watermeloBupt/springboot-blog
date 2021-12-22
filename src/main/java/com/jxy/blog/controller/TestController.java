package com.jxy.blog.controller;

import com.jxy.blog.pojo.SysUser;
import com.jxy.blog.util.UserThreadLocal;
import com.jxy.blog.vo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping
    public Result test(){
        SysUser sysUser = UserThreadLocal.get();
        System.out.println(sysUser);
        return Result.success(null);
    }
}


