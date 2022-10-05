package com.example.zakkibcc.service;

import java.util.List;

import com.example.zakkibcc.DTO.StudentDto;
import com.example.zakkibcc.model.Grade;


public interface GradeService {
	
	public List<Grade> getAllGrade();
	
	public String addGrade(Grade grade);
	
	public String updateGrade(Grade grade);
	
	public String deleteGrade(Integer kodeNilai);
	
	public StudentDto showData(String kodeNilai);
}
