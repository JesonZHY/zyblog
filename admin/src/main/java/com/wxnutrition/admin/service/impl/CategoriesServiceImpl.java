package com.wxnutrition.admin.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wxnutrition.admin.mapper.CategoriesMapper;
import com.wxnutrition.admin.pojo.Categories;
import com.wxnutrition.admin.pojo.PageResult;
import com.wxnutrition.admin.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriesServiceImpl implements CategoriesService {

    @Autowired
    private CategoriesMapper categoriesMapper;

    @Override
    public PageResult findAll(int page, int rows) {
        PageHelper.startPage(page, rows);
        Page<Categories> pages = (Page<Categories>) categoriesMapper.selectByExample(null);
        return new PageResult(pages.getTotal(), pages.getResult());
    }

    @Override
    public int delete(String categoriesId) {
        return categoriesMapper.deleteByPrimaryKey(categoriesId);
    }

    @Override
    public List<Categories> findByName(String categoriesName) {
        return categoriesMapper.findByName(categoriesName);
    }

    @Override
    public int insert(Categories categories) {
        return categoriesMapper.insert(categories);
    }

    @Override
    public int save(Categories categories) {
        return categoriesMapper.updateByPrimaryKey(categories);
    }

    @Override
    public Categories findOne(String categoriesId) {
        return categoriesMapper.selectByPrimaryKey(categoriesId);
    }

    @Override
    public int updatecategoriesStatus(String categoriesId, String categoriesStatus) {
        Categories categories = categoriesMapper.selectByPrimaryKey(categoriesId);
        categories.setCategoriesStatus(Integer.parseInt(categoriesStatus));
        return categoriesMapper.updateByPrimaryKey(categories);
    }

    @Override
    public List<Categories> findAllcategories() {
        return categoriesMapper.selectByExample(null);
    }

}
