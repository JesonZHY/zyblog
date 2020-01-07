package com.wxnutrition.admin.controller;

import com.wxnutrition.admin.pojo.Articles;
import com.wxnutrition.admin.pojo.Categories;
import com.wxnutrition.admin.pojo.Label;
import com.wxnutrition.admin.pojo.Result;
import com.wxnutrition.admin.service.ArticlesService;
import com.wxnutrition.admin.service.CategoriesService;
import com.wxnutrition.admin.service.LabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticlesController {

    @Autowired
    private ArticlesService articlesService;

    @Autowired
    private LabelService labelService;

    @Autowired
    private CategoriesService categoriesService;

    @RequestMapping("/findAll")
    public List<Articles> findAll() {
        List<Articles> articlesList = articlesService.findAll();
        return articlesList;
    }

    @RequestMapping("/saveStatus")
    @ResponseBody
    public Result saveStatus(String articleId, String articleStatus) {
        int saveStatusResult = articlesService.saveStatus(articleId, articleStatus);
        if (saveStatusResult != 0) {
            return new Result(true, "变更文章状态成功！");
        } else {
            return new Result(false, "变更文章状态失败！");
        }
    }

    @RequestMapping("/delete")
    @ResponseBody
    public Result delete(String articleId) {
        int delete = articlesService.delete(articleId);
        if (delete != 0) {
            return new Result(true, "删除成功！");
        } else {
            return new Result(false, "删除失败！");
        }
    }

    @RequestMapping("/getAlllabels")
    public List<Label> getAlllabels() {
        List<Label> labelList = labelService.findAlllabels();
        return labelList;
    }

    @RequestMapping("/getAllCategories")
    public List<Categories> getAllCategories() {
        List<Categories> categoriesList = categoriesService.findAllcategories();
        return categoriesList;
    }

    @RequestMapping("/insert")
    @ResponseBody
    public Result insert(String articleTitle, String articleCategories, String articleLabels, String articleContents, HttpServletRequest request) {
        int articleInsertResult = articlesService.insert(articleTitle, articleCategories, articleLabels, articleContents, (String) request.getSession().getAttribute("userLogin"));
        if (articleInsertResult != 0) {
            return new Result(true, "文章保存成功！");
        } else {
            return new Result(false, "文章保存失败！");
        }
    }
}
