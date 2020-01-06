package com.wxnutrition.admin.service;

import com.wxnutrition.admin.pojo.Categories;
import com.wxnutrition.admin.pojo.PageResult;

import java.util.List;

public interface CategoriesService {

    PageResult findAll(int page, int rows);

    int delete(String categoriesId);

    List<Categories> findByName(String categoriesName);

    int insert(Categories categories);

    int save(Categories categories);

    Categories findOne(String categoriesId);

    int updatecategoriesStatus(String categoriesId, String categoriesStatus);
}
