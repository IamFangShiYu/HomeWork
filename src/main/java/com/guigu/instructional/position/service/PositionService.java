package com.guigu.instructional.position.service;


import java.util.List;

import com.guigu.instructional.po.AttPosition;

public interface PositionService {

  	public boolean addAttPosition(AttPosition attPosition);
  	
    public boolean updateAttPosition(AttPosition attPosition);
      
    public AttPosition getAttPosition(Integer positionid);
    
    public boolean deleteAttPosition(Integer positionid);
		
	public List<AttPosition> getAttPositionList(AttPosition attPosition);
		    
	}


