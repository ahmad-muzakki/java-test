package com.example.zakkibcc.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.zakkibcc.model.StudyProgram;
import com.example.zakkibcc.service.StudyProgramService;

import net.sf.jasperreports.engine.JRException;

@CrossOrigin
@RestController
@RequestMapping("/api/studyProgram")
public class StudyProgramController {
	
	@Autowired
	StudyProgramService studyProgramService;
	
	@GetMapping
	public List<StudyProgram> getAllStudyProgram() {
		return studyProgramService.getAllStudyProgram();
	}
	
	@PostMapping("addStudyProgram")
	public String addStudyProgram(@RequestBody StudyProgram studyProgram) {
		return studyProgramService.addStudyProgram(studyProgram);
	}
	
	@PutMapping("updateStudyProgram")
	public String updateStudyProgram(@RequestBody StudyProgram studyProgram) {
		return studyProgramService.updateStudyProgram(studyProgram);
	}
	
	@DeleteMapping("{kodePs}")
	public String deleteStudyProgram(@PathVariable Integer kodePs) {
		return studyProgramService.deleteStudyProgram(kodePs);
	}
	
	@GetMapping("report")
	public byte[] getStudyProgramReport() throws JRException, IOException {
		return studyProgramService.getStudyProgramReport();
	}
	
}
