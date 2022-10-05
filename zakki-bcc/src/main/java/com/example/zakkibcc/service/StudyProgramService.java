package com.example.zakkibcc.service;

import java.io.IOException;
import java.util.List;
import com.example.zakkibcc.model.StudyProgram;

import net.sf.jasperreports.engine.JRException;


public interface StudyProgramService {
	
	public List<StudyProgram> getAllStudyProgram();
	
	public String addStudyProgram(StudyProgram studyProgram);
	
	public String updateStudyProgram(StudyProgram studyProgram);
	
	public String deleteStudyProgram(Integer kodePs);
	
	public byte[] getStudyProgramReport() throws JRException, IOException;
} 
