package com.wxnutrition.admin.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wxnutrition.admin.mapper.LabelMapper;
import com.wxnutrition.admin.pojo.Label;
import com.wxnutrition.admin.pojo.PageResult;
import com.wxnutrition.admin.service.LabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabelServiceImpl implements LabelService {

    @Autowired
    private LabelMapper labelMapper;

    @Override
    public PageResult findAll(int page, int rows) {
        PageHelper.startPage(page, rows);
        Page<Label> pages = (Page<Label>) labelMapper.selectByExample(null);
        return new PageResult(pages.getTotal(), pages.getResult());
    }

    @Override
    public int delete(String labelId) {
        return labelMapper.deleteByPrimaryKey(labelId);
    }

    @Override
    public List<Label> findByName(String labelName) {
        return labelMapper.findByName(labelName);
    }

    @Override
    public int insert(Label label) {
        return labelMapper.insert(label);
    }

    @Override
    public int save(Label label) {
        return labelMapper.updateByPrimaryKey(label);
    }

    @Override
    public Label findOne(String labelId) {
        return labelMapper.selectByPrimaryKey(labelId);
    }

}
