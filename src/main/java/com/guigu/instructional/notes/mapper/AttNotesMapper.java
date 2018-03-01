package com.guigu.instructional.notes.mapper;

import com.guigu.instructional.po.AttNotes;
import com.guigu.instructional.po.AttNotesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttNotesMapper {
    int countByExample(AttNotesExample example);

    int deleteByExample(AttNotesExample example);

    int deleteByPrimaryKey(Integer noteid);

    int insert(AttNotes record);

    int insertSelective(AttNotes record);

    List<AttNotes> selectByExample(AttNotesExample example);

    AttNotes selectByPrimaryKey(Integer noteid);

    int updateByExampleSelective(@Param("record") AttNotes record, @Param("example") AttNotesExample example);

    int updateByExample(@Param("record") AttNotes record, @Param("example") AttNotesExample example);

    int updateByPrimaryKeySelective(AttNotes record);

    int updateByPrimaryKey(AttNotes record);
}