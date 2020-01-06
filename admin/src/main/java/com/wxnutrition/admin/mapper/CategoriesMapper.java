package com.wxnutrition.admin.mapper;

import com.wxnutrition.admin.pojo.Categories;
import com.wxnutrition.admin.pojo.CategoriesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CategoriesMapper {
    int countByExample(CategoriesExample example);

    int deleteByExample(CategoriesExample example);

    int deleteByPrimaryKey(String categoriesId);

    int insert(Categories record);

    int insertSelective(Categories record);

    List<Categories> selectByExample(CategoriesExample example);

    Categories selectByPrimaryKey(String categoriesId);

    int updateByExampleSelective(@Param("record") Categories record, @Param("example") CategoriesExample example);

    int updateByExample(@Param("record") Categories record, @Param("example") CategoriesExample example);

    int updateByPrimaryKeySelective(Categories record);

    int updateByPrimaryKey(Categories record);

    List<Categories> findByName(@Param("categoriesName") String categoriesName);
}