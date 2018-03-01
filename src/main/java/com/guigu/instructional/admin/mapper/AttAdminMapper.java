package com.guigu.instructional.admin.mapper;

import com.guigu.instructional.po.AttAdmin;
import com.guigu.instructional.po.AttAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttAdminMapper {
    int countByExample(AttAdminExample example);

    int deleteByExample(AttAdminExample example);

    int deleteByPrimaryKey(Integer adminid);

    int insert(AttAdmin record);

    int insertSelective(AttAdmin record);

    List<AttAdmin> selectByExample(AttAdminExample example);

    AttAdmin selectByPrimaryKey(Integer adminid);

    int updateByExampleSelective(@Param("record") AttAdmin record, @Param("example") AttAdminExample example);

    int updateByExample(@Param("record") AttAdmin record, @Param("example") AttAdminExample example);

    int updateByPrimaryKeySelective(AttAdmin record);

    int updateByPrimaryKey(AttAdmin record);
}