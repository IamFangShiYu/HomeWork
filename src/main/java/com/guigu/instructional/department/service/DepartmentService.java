package com.guigu.instructional.department.service;

import java.util.List;

import com.guigu.instructional.po.AttDepartment;

public interface DepartmentService {

	  	public boolean addDepartment(AttDepartment attDepartment);
	  	
	    public boolean updateDepartment(AttDepartment attDepartment);
	    
	    public List<AttDepartment> getStaffInfoList(AttDepartment attDepartment);
	    
	    public AttDepartment getDepartment(Integer departmentid);
	    
	    public boolean deleteDepartment(Integer departmentid);
}
