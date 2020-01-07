package com.wxnutrition.admin.mapper;

import com.wxnutrition.admin.pojo.ArticleCategories;
import com.wxnutrition.admin.pojo.ArticleCategoriesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleCategoriesMapper {
    int countByExample(ArticleCategoriesExample example);

    int deleteByExample(ArticleCategoriesExample example);

    int deleteByPrimaryKey(String id);

    int insert(ArticleCategories record);

    int insertSelective(ArticleCategories record);

    List<ArticleCategories> selectByExample(ArticleCategoriesExample example);

    ArticleCategories selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ArticleCategories record, @Param("example") ArticleCategoriesExample example);

    int updateByExample(@Param("record") ArticleCategories record, @Param("example") ArticleCategoriesExample example);

    int updateByPrimaryKeySelective(ArticleCategories record);

    int updateByPrimaryKey(ArticleCategories record);
}