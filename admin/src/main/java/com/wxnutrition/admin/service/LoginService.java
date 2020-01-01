package com.wxnutrition.admin.service;

import com.wxnutrition.admin.pojo.User;

public interface LoginService {

    User login(String username, String password);
}
