package com.wxnutrition.admin.mapper;

import com.wxnutrition.admin.pojo.ArticleLabel;
import com.wxnutrition.admin.pojo.ArticleLabelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleLabelMapper {
    int countByExample(ArticleLabelExample example);

    int deleteByExample(ArticleLabelExample example);

    int deleteByPrimaryKey(String id);

    int insert(ArticleLabel record);

    int insertSelective(ArticleLabel record);

    List<ArticleLabel> selectByExample(ArticleLabelExample example);

    ArticleLabel selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ArticleLabel record, @Param("example") ArticleLabelExample example);

    int updateByExample(@Param("record") ArticleLabel record, @Param("example") ArticleLabelExample example);

    int updateByPrimaryKeySelective(ArticleLabel record);

    int updateByPrimaryKey(ArticleLabel record);
}