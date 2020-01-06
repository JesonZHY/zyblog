package com.wxnutrition.admin.controller;

import com.wxnutrition.admin.pojo.Articles;
import com.wxnutrition.admin.service.ArticlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticlesController {

    @Autowired
    private ArticlesService articlesService;

    @RequestMapping("/findAll")
    public List<Articles> findAll() {
        List<Articles> articlesList = articlesService.findAll();
        return articlesList;
    }
}
