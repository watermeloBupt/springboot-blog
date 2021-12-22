package com.jxy.blog.service;

import com.jxy.blog.pojo.SysUser;
import com.jxy.blog.vo.Result;
import com.jxy.blog.vo.UserVo;

public interface SysUserService {
    SysUser findUser(String account, String password);

    SysUser findUserById(Long id);

    Result findUserByToken(String token);

    SysUser findUserByAccount(String account);

    void save(SysUser sysUser);

    UserVo findUserVoById(Long id);
}
