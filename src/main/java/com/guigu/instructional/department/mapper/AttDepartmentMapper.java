package com.guigu.instructional.department.mapper;

import com.guigu.instructional.po.AttDepartment;
import com.guigu.instructional.po.AttDepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttDepartmentMapper {
    int countByExample(AttDepartmentExample example);

    int deleteByExample(AttDepartmentExample example);

    int deleteByPrimaryKey(Integer departmentid);

    int insert(AttDepartment record);

    int insertSelective(AttDepartment record);

    List<AttDepartment> selectByExample(AttDepartmentExample example);

    AttDepartment selectByPrimaryKey(Integer departmentid);

    int updateByExampleSelective(@Param("record") AttDepartment record, @Param("example") AttDepartmentExample example);

    int updateByExample(@Param("record") AttDepartment record, @Param("example") AttDepartmentExample example);

    int updateByPrimaryKeySelective(AttDepartment record);

    int updateByPrimaryKey(AttDepartment record);
}