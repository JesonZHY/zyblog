package com.wxnutrition.admin.service;

import com.wxnutrition.admin.pojo.PageResult;
import com.wxnutrition.admin.pojo.User;

import java.util.List;

public interface LoginService {

    User login(String username, String password);

    PageResult findAll(int page, int rows);

    User findOne(String userId);

    User findByUsername(String userName);

    int save(User user);

    int insert(User user);

    List<User> findByName(String userName);

    List<User> findByNickName(String userNickName);

    int delete(String userId);

    int updateUserStatus(String userId, String userStatus);
}
