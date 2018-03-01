package com.guigu.instructional.admin.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.instructional.admin.service.AdminService;
import com.guigu.instructional.po.AttAdmin;

@Controller
@RequestMapping("/admin/")
public class AdminController {

	  @Resource(name="adminServiceImpl")
	    private AdminService adminService;
	  
	  
	  @RequestMapping("list.action")
	    public String list(AttAdmin attAdmin,Model model) {
	        List<AttAdmin> list =adminService.getAttAdminList(attAdmin);
	        List<AttAdmin> superlist =adminService.getSuperAttAdminList(attAdmin);
	        
	        System.out.println(list);
	        

	        System.out.println(superlist);
	        
	        if(!superlist.isEmpty()) {

	        	model.addAttribute("name", "超级管理员");
	        	return "index";
	       
	        	
	        }else if (!list.isEmpty()) {
	        	
	        	model.addAttribute("name", "考勤管理员");
	        	return "index2";
			}else {
			
	        	model.addAttribute("name", "验证失败请重新验证");
	        	 return "login";
			}
	        
	    }

}
