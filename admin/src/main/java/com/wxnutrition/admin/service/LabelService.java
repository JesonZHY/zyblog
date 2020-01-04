package com.wxnutrition.admin.service;

import com.wxnutrition.admin.pojo.Label;
import com.wxnutrition.admin.pojo.PageResult;

import java.util.List;

public interface LabelService {

    PageResult findAll(int page, int rows);

    int delete(String labelId);

    List<Label> findByName(String labelName);

    int insert(Label label);

    int save(Label label);

    Label findOne(String labelId);

    int updatelabelStatus(String labelId, String labelStatus);
}
