package com.wxnutrition.admin.service.impl;

import com.wxnutrition.admin.mapper.LoginMapper;
import com.wxnutrition.admin.pojo.User;
import com.wxnutrition.admin.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public User login(String username, String password) {
        return loginMapper.login(username);
    }
}
