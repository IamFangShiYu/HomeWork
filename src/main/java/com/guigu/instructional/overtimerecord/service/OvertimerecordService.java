package com.guigu.instructional.overtimerecord.service;

import java.util.List;

import com.guigu.instructional.po.AttOvertimerecord;


public interface OvertimerecordService {

	
	    public boolean addAttOvertimerecord(AttOvertimerecord attOvertimerecord);
	    	
	    public boolean updateAttOvertimerecord(AttOvertimerecord attOvertimerecord);
	    
	    public boolean deleteAttOvertimerecord(Integer overtimeid);
	    
	    public List<AttOvertimerecord> getAttOvertimerecordList(AttOvertimerecord attOvertimerecord);
	    
	    public AttOvertimerecord getAttOvertimerecord(Integer overtimeid);

}
