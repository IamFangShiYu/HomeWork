package com.guigu.instructional.position.mapper;

import com.guigu.instructional.po.AttPosition;
import com.guigu.instructional.po.AttPositionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttPositionMapper {
    int countByExample(AttPositionExample example);

    int deleteByExample(AttPositionExample example);

    int deleteByPrimaryKey(Integer positionid);

    int insert(AttPosition record);

    int insertSelective(AttPosition record);

    List<AttPosition> selectByExample(AttPositionExample example);

    AttPosition selectByPrimaryKey(Integer positionid);

    int updateByExampleSelective(@Param("record") AttPosition record, @Param("example") AttPositionExample example);

    int updateByExample(@Param("record") AttPosition record, @Param("example") AttPositionExample example);

    int updateByPrimaryKeySelective(AttPosition record);

    int updateByPrimaryKey(AttPosition record);
}