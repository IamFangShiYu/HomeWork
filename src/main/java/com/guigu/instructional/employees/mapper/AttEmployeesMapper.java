package com.guigu.instructional.employees.mapper;

import com.guigu.instructional.po.AttEmployees;
import com.guigu.instructional.po.AttEmployeesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttEmployeesMapper {
    int countByExample(AttEmployeesExample example);

    int deleteByExample(AttEmployeesExample example);

    int deleteByPrimaryKey(Integer employeeid);

    int insert(AttEmployees record);

    int insertSelective(AttEmployees record);

    List<AttEmployees> selectByExample(AttEmployeesExample example);

    AttEmployees selectByPrimaryKey(Integer employeeid);

    int updateByExampleSelective(@Param("record") AttEmployees record, @Param("example") AttEmployeesExample example);

    int updateByExample(@Param("record") AttEmployees record, @Param("example") AttEmployeesExample example);

    int updateByPrimaryKeySelective(AttEmployees record);

    int updateByPrimaryKey(AttEmployees record);
}