package com.guigu.instructional.department.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.instructional.department.mapper.AttDepartmentMapper;
import com.guigu.instructional.department.service.DepartmentService;
import com.guigu.instructional.po.AttDepartment;
import com.guigu.instructional.po.StaffInfoExample;
import com.guigu.instructional.po.StaffInfoExample.Criteria;

@Service("departmentServiceImpl")
public class DepartmentServiceImpl implements DepartmentService{

	@Resource(name="attDepartmentMapper")
	private AttDepartmentMapper attDepartmentMapper;
	
	
	@Override
	public boolean addDepartment(AttDepartment attDepartment) {
		try {
            int i = attDepartmentMapper.insertSelective(attDepartment);
            if (i > 0) {
                return true;
            }
        } catch (Exception e) {

        }

        return false;
	}

	@Override
	public boolean updateDepartment(AttDepartment attDepartment) {
		  try {
	            int i = attDepartmentMapper.updateByPrimaryKeySelective(attDepartment);
	            if (i > 0) {
	                return true;
	            }
	        } catch (Exception e) {

	        }

	        return false;
	}

	@Override
	public List<AttDepartment> getStaffInfoList(AttDepartment attDepartment) {
		 
	       
		return attDepartmentMapper.selectByExample(null);
	    
	}

	@Override
	public AttDepartment getDepartment(Integer departmentid) {
		 return attDepartmentMapper.selectByPrimaryKey(departmentid);
	}

	@Override
	public boolean deleteDepartment(Integer departmentid) {
		 try {
	            int i = attDepartmentMapper.deleteByPrimaryKey(departmentid);
	            if (i > 0) {
	                return true;
	            }
	        } catch (Exception e) {

	        }

	        return false;
	}

}
