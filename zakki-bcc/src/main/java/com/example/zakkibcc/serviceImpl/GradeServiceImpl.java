package com.example.zakkibcc.serviceImpl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.zakkibcc.DTO.StudentDto;
import com.example.zakkibcc.model.Grade;
import com.example.zakkibcc.model.Student;
import com.example.zakkibcc.repository.GradeRepository;
import com.example.zakkibcc.repository.StudentRepository;
import com.example.zakkibcc.service.GradeService;

@Service
public class GradeServiceImpl implements GradeService {
	
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	GradeRepository gradeRepository;
	
	@Override
	public List<Grade> getAllGrade() {
		List<Grade> result = gradeRepository.findAll();
		return result;
	}

	@Override
	public String addGrade(Grade grade) {
		String result = "Add Grade Failed";
		
		if(grade != null) {
			gradeRepository.save(grade);
			result = "Add Grade Success";
		} 
		
		return result;
	}

//	@Override
//	public String updateGrade(Grade grade) {
//		String result = "Update Grade Failed";
//		
//		Optional<Grade> optGrade = gradeRepository.findById(grade.getKodeNilai());
//		
//		if(optGrade.isPresent()) {
//			gradeRepository.save(grade);
//			result = "Update Grade Success";
//		}
//		
//		return result;
//	}

	@Override
	public String deleteGrade(Integer kodeNilai) {
		String result = "Delete Grade Failed";
		
		Optional<Grade> optGrade = gradeRepository.findById(kodeNilai);
		
		if(optGrade.isPresent()) {
			gradeRepository.deleteById(kodeNilai);
			result = "Delete Grade Success";
		}
		
		return result;
	}

	@Override
	public StudentDto showData(String nim) {
		List<Grade> listGrade = gradeRepository.findByNim(nim);
		Student listStudent = studentRepository.findByNim(nim);
		return null;
	}

	@Override
	public String updateGrade(Grade grade) {
		// TODO Auto-generated method stub
		return null;
	}

}
