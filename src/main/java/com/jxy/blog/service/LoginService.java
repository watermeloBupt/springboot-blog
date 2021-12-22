package com.jxy.blog.service;

import com.jxy.blog.pojo.SysUser;
import com.jxy.blog.vo.Result;
import com.jxy.blog.vo.params.LoginParams;

public interface LoginService {

    Result login(LoginParams loginParams);

    SysUser checkToken(String token);

    Result logout(String token);

    Result register(LoginParams loginParams);
}
