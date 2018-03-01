package com.guigu.instructional.overtimerecord.mapper;

import com.guigu.instructional.po.AttOvertimerecord;
import com.guigu.instructional.po.AttOvertimerecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttOvertimerecordMapper {
    int countByExample(AttOvertimerecordExample example);

    int deleteByExample(AttOvertimerecordExample example);

    int deleteByPrimaryKey(Integer overtimeid);

    int insert(AttOvertimerecord record);

    int insertSelective(AttOvertimerecord record);

    List<AttOvertimerecord> selectByExample(AttOvertimerecordExample example);

    AttOvertimerecord selectByPrimaryKey(Integer overtimeid);

    int updateByExampleSelective(@Param("record") AttOvertimerecord record, @Param("example") AttOvertimerecordExample example);

    int updateByExample(@Param("record") AttOvertimerecord record, @Param("example") AttOvertimerecordExample example);

    int updateByPrimaryKeySelective(AttOvertimerecord record);

    int updateByPrimaryKey(AttOvertimerecord record);
}