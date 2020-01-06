package com.wxnutrition.admin.mapper;

import com.wxnutrition.admin.pojo.Articles;
import com.wxnutrition.admin.pojo.ArticlesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArticlesMapper {
    int countByExample(ArticlesExample example);

    int deleteByExample(ArticlesExample example);

    int deleteByPrimaryKey(String articleId);

    int insert(Articles record);

    int insertSelective(Articles record);

    List<Articles> selectByExample(ArticlesExample example);

    Articles selectByPrimaryKey(String articleId);

    int updateByExampleSelective(@Param("record") Articles record, @Param("example") ArticlesExample example);

    int updateByExample(@Param("record") Articles record, @Param("example") ArticlesExample example);

    int updateByPrimaryKeySelective(Articles record);

    int updateByPrimaryKey(Articles record);

    List<Articles> findAll();
}