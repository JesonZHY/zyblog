package com.wxnutrition.admin.service;

import com.wxnutrition.admin.pojo.PageResult;
import com.wxnutrition.admin.pojo.User;

public interface LoginService {

    User login(String username, String password);

    PageResult findAll(int page, int rows);

    User findOne(String userId);

    User findByUsername(String userName);

    int save(User user);
}
