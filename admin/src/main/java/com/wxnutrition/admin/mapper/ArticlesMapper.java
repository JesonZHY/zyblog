package com.wxnutrition.admin.mapper;

import com.wxnutrition.admin.pojo.Articles;
import com.wxnutrition.admin.pojo.ArticlesExample;
import com.wxnutrition.admin.pojo.ArticlesWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticlesMapper {
    int countByExample(ArticlesExample example);

    int deleteByExample(ArticlesExample example);

    int deleteByPrimaryKey(String articleId);

    int insert(ArticlesWithBLOBs record);

    int insertSelective(ArticlesWithBLOBs record);

    List<ArticlesWithBLOBs> selectByExampleWithBLOBs(ArticlesExample example);

    List<Articles> selectByExample(ArticlesExample example);

    ArticlesWithBLOBs selectByPrimaryKey(String articleId);

    int updateByExampleSelective(@Param("record") ArticlesWithBLOBs record, @Param("example") ArticlesExample example);

    int updateByExampleWithBLOBs(@Param("record") ArticlesWithBLOBs record, @Param("example") ArticlesExample example);

    int updateByExample(@Param("record") Articles record, @Param("example") ArticlesExample example);

    int updateByPrimaryKeySelective(ArticlesWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ArticlesWithBLOBs record);

    int updateByPrimaryKey(Articles record);
}