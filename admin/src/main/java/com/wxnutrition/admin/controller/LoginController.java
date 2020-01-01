package com.wxnutrition.admin.controller;

import com.wxnutrition.admin.pojo.Result;
import com.wxnutrition.admin.pojo.User;
import com.wxnutrition.admin.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/login")
    @ResponseBody
    public Result login(String username, String password){
        // System.out.println(username + "....." + password);
        User user = loginService.login(username, password);
        if (user != null) {
            if (!user.getPassword().equals(password)) {
                return new Result(false, "密码错误！");
            }
        } else {
            return new Result(false, "用户名不存在！");
        }
        return new Result(true, "登录成功！");
    }
}
