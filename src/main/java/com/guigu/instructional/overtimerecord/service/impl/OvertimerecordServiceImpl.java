package com.guigu.instructional.overtimerecord.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.instructional.overtimerecord.mapper.AttOvertimerecordMapper;
import com.guigu.instructional.overtimerecord.service.OvertimerecordService;
import com.guigu.instructional.po.AttOvertimerecord;
import com.guigu.instructional.po.AttOvertimerecordExample;
import com.guigu.instructional.po.AttOvertimerecordExample.Criteria;

@Service("overtimerecordServiceImpl")
public class OvertimerecordServiceImpl implements OvertimerecordService {

	@Resource(name="attOvertimerecordMapper")
	private AttOvertimerecordMapper attOvertimerecordMapper;
	
	@Override
	public boolean addAttOvertimerecord(AttOvertimerecord attOvertimerecord) {
		
		
		try {
			int i = attOvertimerecordMapper.insertSelective(attOvertimerecord);
			if (i > 0) {
				return true;
			}
		} catch (Exception e) {

		}

		return false;
	}

	@Override
	public boolean updateAttOvertimerecord(AttOvertimerecord attOvertimerecord) {
		try {
			int i = attOvertimerecordMapper.updateByPrimaryKey(attOvertimerecord);
			if (i > 0) {
				return true;
			}
		} catch (Exception e) {

		}

		return false;
	}

	@Override
	public boolean deleteAttOvertimerecord(Integer overtimeid) {
		try {
			int i = attOvertimerecordMapper.deleteByPrimaryKey(overtimeid);
			if (i > 0) {
				return true;
			}
		} catch (Exception e) {

		}

		return false;
	}

	@Override
	public List<AttOvertimerecord> getAttOvertimerecordList(AttOvertimerecord attOvertimerecord) {
		AttOvertimerecordExample attOvertimerecordExample = new AttOvertimerecordExample();
		
		Criteria criteria = attOvertimerecordExample.createCriteria();
		if (attOvertimerecord != null) {
			//是否审核
			if (attOvertimerecord.getIsverify()!= null) {
				criteria.andIsverifyEqualTo(attOvertimerecord.getIsverify());
			}
			//加班时间
			if (attOvertimerecord.getOvertimedate()!= null) {
				criteria.andOvertimedateEqualTo(attOvertimerecord.getOvertimedate());
			}
			//申请人
			if (attOvertimerecord.getEmployeeid()!= null) {
				criteria.andEmployeeidEqualTo(attOvertimerecord.getEmployeeid());
				System.out.println("@"+attOvertimerecord.getEmployeeid());
			}	
			//负责人
			if (attOvertimerecord.getOperatorid()!= null) {
				criteria.andOperatoridEqualTo(attOvertimerecord.getOperatorid());
				System.out.println("@"+attOvertimerecord.getOperatorid());
			}	

		}else {
			System.out.println("test");
			return attOvertimerecordMapper.selectByExample(null);
		}

		return attOvertimerecordMapper.selectByExample(attOvertimerecordExample);
	}

	@Override
	public AttOvertimerecord getAttOvertimerecord(Integer overtimeid) {
		return attOvertimerecordMapper.selectByPrimaryKey(overtimeid);
	}

}
