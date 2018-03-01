package com.guigu.instructional.attendancetype.mapper;

import com.guigu.instructional.po.AttAttendancetype;
import com.guigu.instructional.po.AttAttendancetypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttAttendancetypeMapper {
    int countByExample(AttAttendancetypeExample example);

    int deleteByExample(AttAttendancetypeExample example);

    int deleteByPrimaryKey(Integer typeid);

    int insert(AttAttendancetype record);

    int insertSelective(AttAttendancetype record);

    List<AttAttendancetype> selectByExample(AttAttendancetypeExample example);

    AttAttendancetype selectByPrimaryKey(Integer typeid);

    int updateByExampleSelective(@Param("record") AttAttendancetype record, @Param("example") AttAttendancetypeExample example);

    int updateByExample(@Param("record") AttAttendancetype record, @Param("example") AttAttendancetypeExample example);

    int updateByPrimaryKeySelective(AttAttendancetype record);

    int updateByPrimaryKey(AttAttendancetype record);
}