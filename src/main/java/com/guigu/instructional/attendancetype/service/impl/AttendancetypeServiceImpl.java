package com.guigu.instructional.attendancetype.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.instructional.attendancetype.mapper.AttAttendancetypeMapper;
import com.guigu.instructional.attendancetype.service.AttendancetypeService;
import com.guigu.instructional.po.AttAttendancetype;
import com.guigu.instructional.po.AttAttendancetypeExample;
import com.guigu.instructional.po.AttAttendancetypeExample.Criteria;

@Service("attendancetypeServiceImpl")
public class AttendancetypeServiceImpl implements AttendancetypeService{

	
	@Resource(name="attAttendancetypeMapper")
	private  AttAttendancetypeMapper attAttendancetypeMapper;
	
	
	
	@Override
	public List<AttAttendancetype> getAttendancetype(AttAttendancetype attAttendancetype) {
		AttAttendancetypeExample attAttendancetypeExample = new AttAttendancetypeExample();
		Criteria criteria =attAttendancetypeExample.createCriteria();
		 return attAttendancetypeMapper.selectByExample(null);
	}

}
