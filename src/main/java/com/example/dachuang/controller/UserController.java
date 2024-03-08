package com.example.dachuang.controller;

import cn.hutool.http.HttpStatus;
import com.example.dachuang.common.Result;
import com.example.dachuang.entity.User;
import com.example.dachuang.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping("/login")
    public Result login(@RequestBody User user)
    {
        String username = user.getUsername();
        String password = user.getPassword();
        User login = userService.login(username, password);
        if(login == null)
        {
            return Result.msg(HttpStatus.HTTP_NOT_FOUND,"用户名或密码错误");
        }
        return Result.success("登录成功",login);
    }
    @PutMapping
    public Result updateById(@RequestBody User user)
    {
        return Result.success("用户信息更新成功",userService.updateById(user));
    }
    @PostMapping("register")
    public Result register(@RequestBody User user)
    {
        user.setAccount(0);
        user.setIsVip(0);
        return Result.success("注册成功",userService.save(user));
    }
}
