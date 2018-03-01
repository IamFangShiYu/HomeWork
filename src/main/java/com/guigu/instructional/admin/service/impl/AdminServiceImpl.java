package com.guigu.instructional.admin.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.instructional.admin.mapper.AttAdminMapper;
import com.guigu.instructional.admin.service.AdminService;
import com.guigu.instructional.po.AttAdmin;
import com.guigu.instructional.po.AttAdminExample;
import com.guigu.instructional.po.AttAdminExample.Criteria;


@Service("adminServiceImpl")
public class AdminServiceImpl implements AdminService {
	
	 @Resource(name="attAdminMapper")
	private AttAdminMapper attAdminMapper;


	@Override
	public List<AttAdmin> getAttAdminList(AttAdmin attAdmin) {
		AttAdminExample attAdminExample = new AttAdminExample();
        
        Criteria criteria =attAdminExample.createCriteria();
        
        criteria.andAdminaccountEqualTo(attAdmin.getAdminaccount());
        
        criteria.andAdminpwdEqualTo(attAdmin.getAdminpwd());
           
        criteria.andAdminstateEqualTo(1);
        
        return attAdminMapper.selectByExample(attAdminExample);
	}

	@Override
	public List<AttAdmin> getSuperAttAdminList(AttAdmin attAdmin) {
AttAdminExample attAdminExample = new AttAdminExample();
        
        Criteria criteria =attAdminExample.createCriteria();
        
        criteria.andAdminaccountEqualTo(attAdmin.getAdminaccount());
        
        criteria.andAdminpwdEqualTo(attAdmin.getAdminpwd());
           
        criteria.andAdminstateEqualTo(1);
        
        criteria.andAdminrightEqualTo(1);
      
        return attAdminMapper.selectByExample(attAdminExample);
	}

}
