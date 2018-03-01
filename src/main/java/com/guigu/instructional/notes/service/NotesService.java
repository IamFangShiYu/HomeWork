package com.guigu.instructional.notes.service;

import java.util.List;

import com.guigu.instructional.po.AttNotes;

public interface NotesService {

    public boolean addAttNotes(AttNotes attNotes);
    
    public boolean updateAttNotes(AttNotes attNotes);
    
    public List<AttNotes> getAttNotesList(AttNotes attNotes);
    
    public AttNotes getAttNotes(Integer noteid);
    
    public boolean deleteAttNotes(Integer noteid);
    
//    public List<StaffSalaryCustom> findStaffSalaryList(StaffSalaryCustom staffSalaryCustom)throws Exception;
	
}
