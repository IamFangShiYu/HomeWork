package com.guigu.instructional.department.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.instructional.department.service.DepartmentService;
import com.guigu.instructional.po.AttDepartment;
import com.guigu.instructional.po.StaffInfo;
import com.guigu.instructional.system.service.StaffInfoService;

@Controller
@RequestMapping("/system/department/")
public class DepartmentController {

	  @Resource(name = "departmentServiceImpl")
	    private DepartmentService departmentService;

	  @RequestMapping("add.action")
	    public String addStaffInfo(AttDepartment attDepartment,Model model) {
	       boolean result= departmentService.addDepartment(attDepartment);
	       if(result) {
	           model.addAttribute("info","success");
	       }else {
	           model.addAttribute("info","defult");
	       }
	       return this.list(null, model);
	       
	    }
	    
	    @RequestMapping("list.action")
	    public String list(AttDepartment attDepartment,Model model) {
	        List<AttDepartment> list =departmentService.getStaffInfoList(attDepartment);
	        model.addAttribute("list", list);	        
	        return "system/department/department_list";
	    }
	    
	    @RequestMapping("show.action")
	    public String showDepartment(Integer departmentid,Model model) {
	    	AttDepartment attDepartment=departmentService.getDepartment(departmentid);
	        model.addAttribute("attDepartment", attDepartment);
	        return "system/department/department_update";
	        
	    }
	    
	 
	    
	    @RequestMapping("update.action")
	    public String updateDepartment(AttDepartment attDepartment,Model model) {
	        boolean result=departmentService.updateDepartment(attDepartment);
	        if(result) {
	            model.addAttribute("info", "success");
	        }else {
	            model.addAttribute("info", "defult");
	        }
	        return this.list(null, model);
	    }
	    
	    @RequestMapping("delete.action")
	    public String deleteStaffInfo(Integer departmentid,Model model) {
	        
	    	 boolean result=departmentService.deleteDepartment(departmentid);
		        if(result) {
		            model.addAttribute("info", "success");
		        }else {
		            model.addAttribute("info", "defult");
		        }
		        return this.list(null, model);
	    }
	  
	  
}
