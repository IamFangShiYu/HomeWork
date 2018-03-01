package com.guigu.instructional.employees.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.instructional.employees.mapper.AttEmployeesMapper;
import com.guigu.instructional.employees.service.EmployeesService;
import com.guigu.instructional.po.AttEmployees;
import com.guigu.instructional.po.AttEmployeesExample;
import com.guigu.instructional.po.AttEmployeesExample.Criteria;

@Service("employeesServiceImpl")
public class EmployeesServiceImpl implements EmployeesService{

	@Resource(name="attEmployeesMapper")
	private AttEmployeesMapper attEmployeesMapper;
	
	@Override
	public List<AttEmployees> getAttEmployees(AttEmployees attEmployees) {
		AttEmployeesExample attEmployeesExample =new AttEmployeesExample();
		Criteria Criteria =attEmployeesExample.createCriteria();
		Criteria.andEmployeestateEqualTo(1);
		return attEmployeesMapper.selectByExample(attEmployeesExample);
	}

}
