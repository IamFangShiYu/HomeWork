package com.guigu.instructional.position.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.guigu.instructional.po.AttPosition;
import com.guigu.instructional.position.service.PositionService;


@Controller
@RequestMapping("/system/position/")
public class PositionController {

	    @Resource(name = "positionServiceImpl")
	    private PositionService positionService;

	    @RequestMapping("add.action")
	    public String addPosition(AttPosition attPosition,Model model) {
	       boolean result= positionService.addAttPosition(attPosition);
	       if(result) {
	           model.addAttribute("info","success");
	       }else {
	           model.addAttribute("info","defult");
	       }
	       return this.list(null, model);
	       
	    }
	    
	    @RequestMapping("list.action")
	    public String list(AttPosition attPosition,Model model) {
	        List<AttPosition> list =positionService.getAttPositionList(attPosition);
	        model.addAttribute("list", list);	        
	        return "system/position/position_list";
	    }
	    
	    @RequestMapping("show.action")
	    public String showPosition(Integer positionid,Model model) {
	    	AttPosition attPosition=positionService.getAttPosition(positionid);
	        model.addAttribute("attPosition", attPosition);
	        return "system/position/position_update";
	        
	    }
	    
	 
	    
	    @RequestMapping("update.action")
	    public String updatePosition(AttPosition attPosition,Model model) {
	        boolean result=positionService.updateAttPosition(attPosition);
	        if(result) {
	            model.addAttribute("info", "success");
	        }else {
	            model.addAttribute("info", "defult");
	        }
	        return this.list(null, model);
	    }
	    
	    @RequestMapping("delete.action")
	    public String deletePosition(Integer positionid,Model model) {
	        
	    	 boolean result=positionService.deleteAttPosition(positionid);
		        if(result) {
		            model.addAttribute("info", "success");
		        }else {
		            model.addAttribute("info", "defult");
		        }
		        return this.list(null, model);
	    }
	  
	
}
