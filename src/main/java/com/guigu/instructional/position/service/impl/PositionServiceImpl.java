package com.guigu.instructional.position.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.instructional.po.AttPosition;
import com.guigu.instructional.position.mapper.AttPositionMapper;
import com.guigu.instructional.position.service.PositionService;

@Service("positionServiceImpl")
public class PositionServiceImpl implements PositionService {

	@Resource(name="attPositionMapper")
	private AttPositionMapper attPositionMapper;
	
	@Override
	public boolean addAttPosition(AttPosition attPosition) {
		try {
            int i = attPositionMapper.insertSelective(attPosition);
            if (i > 0) {
                return true;
            }
        } catch (Exception e) {

        }

        return false;
	}

	@Override
	public boolean updateAttPosition(AttPosition attPosition) {
		
		try {
            int i = attPositionMapper.updateByPrimaryKeySelective(attPosition);
            if (i > 0) {
                return true;
            }
        } catch (Exception e) {

        }

        return false;
	}

	@Override
	public AttPosition getAttPosition(Integer positionid) {
		return attPositionMapper.selectByPrimaryKey(positionid);
	}

	@Override
	public boolean deleteAttPosition(Integer positionid) {
		 try {
	            int i = attPositionMapper.deleteByPrimaryKey(positionid);
	            if (i > 0) {
	                return true;
	            }
	        } catch (Exception e) {

	        }

	        return false;
	}

	@Override
	public List<AttPosition> getAttPositionList(AttPosition attPosition) {
		return attPositionMapper.selectByExample(null);
	}

}
