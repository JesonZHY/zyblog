package com.wxnutrition.admin.mapper;

import com.wxnutrition.admin.pojo.User;
import com.wxnutrition.admin.pojo.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(String userId);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

    User findbyUsername(@Param("username") String userName);

    List<User> findByName(@Param("username") String userName);

    List<User> findByNickName(@Param("userNickName") String userNickName);
}