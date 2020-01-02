package com.wxnutrition.admin.mapper;

import com.wxnutrition.admin.pojo.Categories;
import com.wxnutrition.admin.pojo.CategoriesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CategoriesMapper {
    int countByExample(CategoriesExample example);

    int deleteByExample(CategoriesExample example);

    int deleteByPrimaryKey(String categoriesId);

    int insert(Categories record);

    int insertSelective(Categories record);

    List<Categories> selectByExampleWithBLOBs(CategoriesExample example);

    List<Categories> selectByExample(CategoriesExample example);

    Categories selectByPrimaryKey(String categoriesId);

    int updateByExampleSelective(@Param("record") Categories record, @Param("example") CategoriesExample example);

    int updateByExampleWithBLOBs(@Param("record") Categories record, @Param("example") CategoriesExample example);

    int updateByExample(@Param("record") Categories record, @Param("example") CategoriesExample example);

    int updateByPrimaryKeySelective(Categories record);

    int updateByPrimaryKeyWithBLOBs(Categories record);

    int updateByPrimaryKey(Categories record);
}