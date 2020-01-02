package com.wxnutrition.admin.mapper;

import com.wxnutrition.admin.pojo.Labels;
import com.wxnutrition.admin.pojo.LabelsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LabelsMapper {
    int countByExample(LabelsExample example);

    int deleteByExample(LabelsExample example);

    int deleteByPrimaryKey(String labelId);

    int insert(Labels record);

    int insertSelective(Labels record);

    List<Labels> selectByExampleWithBLOBs(LabelsExample example);

    List<Labels> selectByExample(LabelsExample example);

    Labels selectByPrimaryKey(String labelId);

    int updateByExampleSelective(@Param("record") Labels record, @Param("example") LabelsExample example);

    int updateByExampleWithBLOBs(@Param("record") Labels record, @Param("example") LabelsExample example);

    int updateByExample(@Param("record") Labels record, @Param("example") LabelsExample example);

    int updateByPrimaryKeySelective(Labels record);

    int updateByPrimaryKeyWithBLOBs(Labels record);

    int updateByPrimaryKey(Labels record);
}