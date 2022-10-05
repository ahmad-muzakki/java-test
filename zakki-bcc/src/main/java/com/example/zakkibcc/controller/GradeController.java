package com.example.zakkibcc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.zakkibcc.model.Grade;
import com.example.zakkibcc.service.GradeService;

@RestController
@RequestMapping("/api/grade")
public class GradeController {
	
	@Autowired
	GradeService gradeService;
	
	@GetMapping
	public List<Grade> getAllGrade() {
		return gradeService.getAllGrade();
	}
	
	@PostMapping("/addGrade")
	public String addGrade(@RequestBody Grade grade) {
		return gradeService.addGrade(grade);
	}
	
	@PutMapping("/updateGrade")
	public String updateGrade(@RequestBody Grade grade) {
		return gradeService.updateGrade(grade);
	}
	
	@DeleteMapping("{kodeNilai}")
	public String deleteGrade(@PathVariable Integer kodeNilai) {
		return gradeService.deleteGrade(kodeNilai);
	}
	
}
