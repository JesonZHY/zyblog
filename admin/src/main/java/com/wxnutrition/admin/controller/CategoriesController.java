package com.wxnutrition.admin.controller;

import com.wxnutrition.admin.pojo.Categories;
import com.wxnutrition.admin.pojo.PageResult;
import com.wxnutrition.admin.pojo.Result;
import com.wxnutrition.admin.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RequestMapping("/categories")
@RestController
public class CategoriesController {

    @Autowired
    private CategoriesService categoriesService;

    @RequestMapping("/findAll")
    public PageResult findAll(int page, int rows) {
        return categoriesService.findAll(page, rows);
    }

    @RequestMapping("/findOne")
    public Categories findOne(String categoriesId) {
        return categoriesService.findOne(categoriesId);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public Result delete(String categoriesId) {
        int delete = categoriesService.delete(categoriesId);
        if (delete != 0) {
            return new Result(true, "删除成功！");
        } else {
            return new Result(false, "删除失败！");
        }
    }

    @RequestMapping("/findByName")
    @ResponseBody
    public Result findByName(String categoriesName) {
        List<Categories> categoriesList = categoriesService.findByName(categoriesName);
        if (categoriesList.size() != 0) {
            return new Result(false, "分类名称重复！");
        } else {
            return new Result(true, "分类名称可用！");
        }
    }

    @RequestMapping("/insert")
    @ResponseBody
    public Result insert(String categoriesName, String categoriesDesc) {
        List<Categories> categoriesList = categoriesService.findByName(categoriesName);
        if (categoriesList.size() != 0) {
            return new Result(false, "分类名称重复！");
        }
        Categories categories = new Categories();
        categories.setCategoriesId(UUID.randomUUID().toString().replaceAll("-", ""));
        categories.setCategoriesName(categoriesName);
        categories.setCategoriesDesc(categoriesDesc);
        int save = categoriesService.insert(categories);
        if (save != 0) {
            return new Result(true, "添加分类成功！");
        } else {
            return new Result(false, "添加分类失败！");
        }
    }

    @RequestMapping("/save")
    @ResponseBody
    public Result save(String categoriesName, String categoriesDesc) {
        Categories categories = categoriesService.findByName(categoriesName).get(0);
        categories.setCategoriesDesc(categoriesDesc);
        int save = categoriesService.save(categories);
        if (save != 0) {
            return new Result(true, "修改分类成功！");
        } else {
            return new Result(false, "修改分类失败！");
        }
    }

    @RequestMapping("/changeCategoriesStatus")
    @ResponseBody
    public Result changeCategoriesStatus(String categoriesId, String categoriesStatus) {
        int update = categoriesService.updatecategoriesStatus(categoriesId, categoriesStatus);
        if (update != 0) {
            return new Result(true, "变更分类状态成功！");
        } else {
            return new Result(false, "变更分类状态失败！");
        }
    }
}
