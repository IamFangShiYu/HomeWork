package com.guigu.instructional.overtimerecord.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.instructional.employees.service.EmployeesService;
import com.guigu.instructional.notes.service.NotesService;
import com.guigu.instructional.overtimerecord.service.OvertimerecordService;
import com.guigu.instructional.po.AttEmployees;
import com.guigu.instructional.po.AttNotes;
import com.guigu.instructional.po.AttOvertimerecord;


@Controller
@RequestMapping("/Overtimerecord/")
public class OvertimerecordController {

	@Resource(name="notesServiceImpl")
	private NotesService  notesService;
	
	@Resource(name="employeesServiceImpl")
	private EmployeesService  employeesService;
	
	@Resource(name="overtimerecordServiceImpl")
	private OvertimerecordService overtimerecordService;
	
	
//	@RequestMapping("loadchange.action")
//    public String StudentInfo(Integer studentId,Model model) {
//		StudentInfo studentInfo =studentInfoService.getStudentInfo(studentId);
//        model.addAttribute("studentInfo", studentInfo);
//        List<StudentInfo> list =studentInfoService.getStudentInfoList(null);
//        model.addAttribute("studentlist", list);
//        return "system/roleinfo/role_change";
//    }
	
//	@RequestMapping("excel.action")
//	public void export(HttpServletResponse response) throws Exception {
//		StudentPayment studentPayment=new StudentPayment();
//		List<StudentPayment> list =studentPaymentService.getStudentPayment(studentPayment);			
//		ExportExcel<StudentPayment> ee= new ExportExcel<StudentPayment>();
//		
//		String[] headers = { "payment_id", "student_id", "staff_id", "payment_situtation" , "payment_menthod", "payment_time", "payment_discount_amount", "payment_should_amount", "payment_real_amount", "payment_debt_amount", "payment_remark"};
//		String fileName = "StudentPaymentTable";
//		ee.exportExcel(headers,list,fileName,response);
//	}


	   @RequestMapping("add.action")
	    public String addOvertimerecord(@Validated AttOvertimerecord attOvertimerecord,BindingResult bindingResult,Model model) throws Exception {
	       
		   if(bindingResult.hasErrors()) {
				  List<ObjectError> allErrors=bindingResult.getAllErrors();
				   model.addAttribute("allErrors",allErrors);
				   
				   List<AttEmployees> list =employeesService.getAttEmployees(null);
			        model.addAttribute("employeeslist", list);
			        
			     	    
			        List<AttNotes> list3 =notesService.getAttNotesList(null);
			        model.addAttribute("attNoteslist", list3);
			
			        model.addAttribute("attOvertimerecord", attOvertimerecord);
					
			        return "attOvertimerecord/attOvertimerecord/attOvertimerecord_add";
				   
			   }
		   
   
	       boolean result= overtimerecordService.addAttOvertimerecord(attOvertimerecord);
	       if(result) {
	           model.addAttribute("info","-AddSuccess");
	       }else {
	           model.addAttribute("info","-AddFailure");
	       }
	       
	       return this.list(null, model);
	       
	    }
	   
	   @RequestMapping("delete.action")
	    public String deleteOvertimerecord(Integer overtimeid,Model model) throws Exception {
	       
		   
		   
	       boolean result= overtimerecordService.deleteAttOvertimerecord(overtimeid);
	       if(result) {
	           model.addAttribute("info","-DeleteSuccess");
	       }else {
	           model.addAttribute("info","-DeleteFailure");
	       }
	       
	       return this.list(null, model);
	       
	    }
	   
	   @RequestMapping("update.action")
	    public String updateOvertimerecord(@Validated AttOvertimerecord attOvertimerecord,BindingResult bindingResult,Model model) throws Exception {
		
		   if(bindingResult.hasErrors()) {
				  List<ObjectError> allErrors=bindingResult.getAllErrors();
				   model.addAttribute("allErrors",allErrors);
				   
				   List<AttEmployees> list =employeesService.getAttEmployees(null);
			        model.addAttribute("employeeslist", list);
			        
			     	    
			        List<AttNotes> list3 =notesService.getAttNotesList(null);
			        model.addAttribute("attNoteslist", list3);
			
			        model.addAttribute("attOvertimerecord", attOvertimerecord);
					
			        return "attOvertimerecord/attOvertimerecord/attOvertimerecord_update";
				   
			   }
	       
	       boolean result= overtimerecordService.updateAttOvertimerecord(attOvertimerecord);
	       if(result) {
	           model.addAttribute("info","-UpdateSuccess");
	       }else {
	           model.addAttribute("info","-UpdateFailure");
	       }
	       
	       return this.list(null, model);
	       
	    }
	   
	   @RequestMapping("load.action")
	    public String loadUpate(Integer overtimeid,Model model) {
	      
	        List<AttEmployees> list =employeesService.getAttEmployees(null);
	        model.addAttribute("employeeslist", list);
	        
	        AttOvertimerecord attOvertimerecord = overtimerecordService.getAttOvertimerecord(overtimeid);
	        model.addAttribute("attOvertimerecord", attOvertimerecord);
	        	    
	        List<AttNotes> list3 =notesService.getAttNotesList(null);
	        model.addAttribute("attNoteslist", list3);
	
	        
	        return "attOvertimerecord/attOvertimerecord/attOvertimerecord_update";
	    }
	   
	   @RequestMapping("addload.action")
	    public String addloadUpate(AttOvertimerecord attOvertimerecord,Model model) {
	      
		   List<AttOvertimerecord> list =overtimerecordService.getAttOvertimerecordList(attOvertimerecord);
			  
	        List<AttEmployees> list2=employeesService.getAttEmployees(null);
	        model.addAttribute("employeeslist", list2);
	        
	        List<AttNotes> list3 =notesService.getAttNotesList(null);
	        model.addAttribute("attNoteslist", list3);
	        	        
	        model.addAttribute("list", list);        
	        return "attOvertimerecord/attOvertimerecord/attOvertimerecord_add";
	    }
	   
	   @RequestMapping("show.action")
	    public String uploadUpate(Integer overtimeid,Model model) {
	      
			  
		   AttOvertimerecord attOvertimerecord =overtimerecordService.getAttOvertimerecord(overtimeid);
		   
	        List<AttEmployees> list2=employeesService.getAttEmployees(null);
	        model.addAttribute("employeeslist", list2);
	        
	        List<AttNotes> list3 =notesService.getAttNotesList(null);
	        model.addAttribute("attNoteslist", list3);
	        	        
	        model.addAttribute("attOvertimerecord", attOvertimerecord);        
	        return "attOvertimerecord/attOvertimerecord/attOvertimerecord_update";
	    }
	   
	   @RequestMapping("list.action")
	    public String list(AttOvertimerecord attOvertimerecord,Model model) throws Exception {
	        List<AttOvertimerecord> list =overtimerecordService.getAttOvertimerecordList(attOvertimerecord);
	        List<AttEmployees> list2=employeesService.getAttEmployees(null);
	        model.addAttribute("employeeslist", list2);
	        
	        	        
	        model.addAttribute("list", list);        
	        return "attOvertimerecord/attOvertimerecord/attOvertimerecord_list";
	    }
	  
	
}
