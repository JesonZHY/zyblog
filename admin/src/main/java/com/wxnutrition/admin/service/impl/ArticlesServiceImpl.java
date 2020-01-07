package com.wxnutrition.admin.service.impl;

import com.wxnutrition.admin.mapper.ArticleCategoriesMapper;
import com.wxnutrition.admin.mapper.ArticleLabelMapper;
import com.wxnutrition.admin.mapper.ArticlesMapper;
import com.wxnutrition.admin.pojo.ArticleCategories;
import com.wxnutrition.admin.pojo.ArticleLabel;
import com.wxnutrition.admin.pojo.Articles;
import com.wxnutrition.admin.service.ArticlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class ArticlesServiceImpl implements ArticlesService {

    @Autowired
    private ArticlesMapper articlesMapper;

    @Autowired
    private ArticleLabelMapper articleLabelMapper;

    @Autowired
    private ArticleCategoriesMapper articleCategoriesMapper;

    @Override
    public List<Articles> findAll() {
        List<Articles> articlesList = articlesMapper.findAll();
        for (Articles articles : articlesList) {
            if (articles.getArticleContents().length() > 220) {
                articles.setArticleContents(articles.getArticleContents().substring(0, 220));
            }
        }
        return articlesList;
    }

    @Override
    public int saveStatus(String articleId, String articleStatus) {
        Articles articles = articlesMapper.selectByPrimaryKey(articleId);
        articles.setArticleStatus(Integer.parseInt(articleStatus));
        return articlesMapper.updateByPrimaryKey(articles);
    }

    @Override
    public int delete(String articleId) {
        return articlesMapper.deleteByPrimaryKey(articleId);
    }

    @Override
    public int insert(String articleTitle, String articleCategories, String articleLabels, String articleContents, String userId) {
        Articles articles = new Articles();
        String articleId = UUID.randomUUID().toString().replaceAll("-","");
        articles.setArticleId(articleId);
        articles.setUserId(userId);
        articles.setArticleTitle(articleTitle);
        articles.setArticleContents(articleContents);
        articles.setArticleStatus(1);
        articles.setArticleDate(new Date());

        articlesMapper.insert(articles);

        String articleCategoriesNotIncludeSymbol = articleCategories.substring(0, articleCategories.lastIndexOf(","));
        if (articleCategoriesNotIncludeSymbol.length() > 32) {
            String[] articleCategoriesArray = articleCategoriesNotIncludeSymbol.split(",");
            for (String articleCategoryId : articleCategoriesArray) {
                insertToCategoriesDB(articleId, articleCategoryId);
            }
        } else {
            insertToCategoriesDB(articleId, articleCategoriesNotIncludeSymbol);
        }

        String articleLabelsNotIncludeSymbol = articleLabels.substring(0, articleLabels.lastIndexOf(","));
        if (articleLabelsNotIncludeSymbol.length() > 32) {
            String[] articleLabelArray = articleLabelsNotIncludeSymbol.split(",");
            for (String articleLabelId : articleLabelArray) {
                insertToLabelDB(articleId, articleLabelId);
            }
        } else {
            insertToLabelDB(articleId, articleLabelsNotIncludeSymbol);
        }

        return 1;
    }

    public void insertToCategoriesDB(String articleId, String articleCategoryId) {
        ArticleCategories categories = new ArticleCategories();
        categories.setId(UUID.randomUUID().toString().replaceAll("-",""));
        categories.setArticleId(articleId);
        categories.setCategoriesId(articleCategoryId);
        articleCategoriesMapper.insert(categories);
    }

    public void insertToLabelDB(String articleId, String articleLabelId) {
        ArticleLabel articleLabel = new ArticleLabel();
        articleLabel.setId(UUID.randomUUID().toString().replaceAll("-",""));
        articleLabel.setArticleId(articleId);
        articleLabel.setLabelId(articleLabelId);
        articleLabelMapper.insert(articleLabel);
    }
}
