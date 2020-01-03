package com.wxnutrition.admin.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wxnutrition.admin.mapper.UserMapper;
import com.wxnutrition.admin.pojo.PageResult;
import com.wxnutrition.admin.pojo.User;
import com.wxnutrition.admin.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String username, String password) {
        return userMapper.findByUsernameAndPassword(username, password);
    }

    @Override
    public PageResult findAll(int page, int rows) {
        PageHelper.startPage(page, rows);
        Page<User> pages = (Page<User>) userMapper.selectByExample(null);
        return new PageResult(pages.getTotal(), pages.getResult());
    }

    @Override
    public User findOne(String userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public User findByUsername(String userName) {
        return userMapper.findbyUsername(userName);
    }

    @Override
    public int save(User user) {
        int saveResult = userMapper.updateByPrimaryKey(user);
        return saveResult;
    }

    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }

    @Override
    public List<User> findByName(String userName) {
        return userMapper.findByName(userName);
    }

    @Override
    public List<User> findByNickName(String userNickName) {
        return userMapper.findByNickName(userNickName);
    }

    @Override
    public int delete(String userId) {
        return userMapper.deleteByPrimaryKey(userId);
    }
}
