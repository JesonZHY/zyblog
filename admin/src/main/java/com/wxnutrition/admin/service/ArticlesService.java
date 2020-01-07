package com.wxnutrition.admin.service;

import com.wxnutrition.admin.pojo.Articles;

import java.util.List;

public interface ArticlesService {

    List<Articles> findAll();

    int saveStatus(String articleId, String articleStatus);

    int delete(String articleId);

    int insert(String articleTitle, String articleCategories, String articleLabels, String articleContents, String userId);
}
