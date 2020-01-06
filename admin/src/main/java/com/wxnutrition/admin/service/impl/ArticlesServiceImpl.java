package com.wxnutrition.admin.service.impl;

import com.wxnutrition.admin.mapper.ArticlesMapper;
import com.wxnutrition.admin.pojo.Articles;
import com.wxnutrition.admin.service.ArticlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticlesServiceImpl implements ArticlesService {

    @Autowired
    private ArticlesMapper articlesMapper;

    @Override
    public List<Articles> findAll() {
        List<Articles> articlesList = articlesMapper.findAll();
        for (Articles articles : articlesList) {
            articles.setArticleContents(articles.getArticleContents().substring(0,220));
        }
        return articlesList;
    }
}
