package com.wxnutrition.admin.controller;

import com.wxnutrition.admin.pojo.Label;
import com.wxnutrition.admin.pojo.PageResult;
import com.wxnutrition.admin.pojo.Result;
import com.wxnutrition.admin.service.LabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RequestMapping("/label")
@RestController
public class LabelController {

    @Autowired
    private LabelService labelService;

    @RequestMapping("/findAll")
    public PageResult findAll(int page, int rows) {
        return labelService.findAll(page, rows);
    }

    @RequestMapping("/findOne")
    public Label findOne(String labelId) {
        return labelService.findOne(labelId);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public Result delete(String labelId) {
        int delete = labelService.delete(labelId);
        if (delete != 0) {
            return new Result(true, "删除成功！");
        } else {
            return new Result(false, "删除失败！");
        }
    }

    @RequestMapping("/findByName")
    @ResponseBody
    public Result findByName(String labelName) {
        List<Label> labelList = labelService.findByName(labelName);
        if (labelList.size() != 0) {
            return new Result(false, "标签名称重复！");
        } else {
            return new Result(true, "标签名称可用！");
        }
    }

    @RequestMapping("/insert")
    @ResponseBody
    public Result insert(String labelName, String labelDesc) {
        List<Label> labelList = labelService.findByName(labelName);
        if (labelList.size() != 0) {
            return new Result(false, "标签名称重复！");
        }
        Label label = new Label();
        label.setLabelId(UUID.randomUUID().toString().replaceAll("-", ""));
        label.setLabelName(labelName);
        label.setLabelDesc(labelDesc);
        int save = labelService.insert(label);
        if (save != 0) {
            return new Result(true, "添加标签成功！");
        } else {
            return new Result(false, "添加标签失败！");
        }
    }

    @RequestMapping("/save")
    @ResponseBody
    public Result save(String labelName, String labelDesc) {
        Label label = labelService.findByName(labelName).get(0);
        label.setLabelDesc(labelDesc);
        int save = labelService.save(label);
        if (save != 0) {
            return new Result(true, "修改标签成功！");
        } else {
            return new Result(false, "修改标签失败！");
        }
    }

    @RequestMapping("/changeLabelStatus")
    @ResponseBody
    public Result changeLabelStatus(String labelId, String labelStatus) {
        int update = labelService.updatelabelStatus(labelId, labelStatus);
        if (update != 0) {
            return new Result(true, "变更标签状态成功！");
        } else {
            return new Result(false, "变更标签状态失败！");
        }
    }
}
