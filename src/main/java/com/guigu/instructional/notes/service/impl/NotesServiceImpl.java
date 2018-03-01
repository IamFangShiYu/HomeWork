package com.guigu.instructional.notes.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.instructional.notes.mapper.AttNotesMapper;
import com.guigu.instructional.notes.service.NotesService;
import com.guigu.instructional.po.AttNotes;

@Service("notesServiceImpl")
public class NotesServiceImpl implements NotesService {

	@Resource(name="attNotesMapper")
	private AttNotesMapper attNotesMapper;
	
	@Override
	public boolean addAttNotes(AttNotes attNotes) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateAttNotes(AttNotes attNotes) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<AttNotes> getAttNotesList(AttNotes attNotes) {
		
		return attNotesMapper.selectByExample(null);
	}

	@Override
	public AttNotes getAttNotes(Integer noteid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteAttNotes(Integer noteid) {
		// TODO Auto-generated method stub
		return false;
	}

}
