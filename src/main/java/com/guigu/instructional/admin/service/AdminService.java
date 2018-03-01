package com.guigu.instructional.admin.service;

import java.util.List;

import com.guigu.instructional.po.AttAdmin;


public interface AdminService {

	
	 public List<AttAdmin> getAttAdminList(AttAdmin attAdmin);
	 public List<AttAdmin> getSuperAttAdminList(AttAdmin attAdmin);
	    
}
