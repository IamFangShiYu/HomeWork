package com.guigu.instructional.admin.mapper;

import com.guigu.instructional.po.AttAdminpopedom;
import com.guigu.instructional.po.AttAdminpopedomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttAdminpopedomMapper {
    int countByExample(AttAdminpopedomExample example);

    int deleteByExample(AttAdminpopedomExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AttAdminpopedom record);

    int insertSelective(AttAdminpopedom record);

    List<AttAdminpopedom> selectByExample(AttAdminpopedomExample example);

    AttAdminpopedom selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AttAdminpopedom record, @Param("example") AttAdminpopedomExample example);

    int updateByExample(@Param("record") AttAdminpopedom record, @Param("example") AttAdminpopedomExample example);

    int updateByPrimaryKeySelective(AttAdminpopedom record);

    int updateByPrimaryKey(AttAdminpopedom record);
}