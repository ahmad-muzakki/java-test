package com.example.zakkibcc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.zakkibcc.DTO.ScoreDto;
import com.example.zakkibcc.model.Student;
import com.example.zakkibcc.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping
	public List<Student> getAllStudent() {
		return studentService.getAllStudent();
	}
	
	@PostMapping("addStudent")
	public String addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}
	
	@PutMapping("updateStudent")
	public String updateStudent(@RequestBody Student student) {
		return studentService.updateStudent(student);
	}
	
//	@DeleteMapping("{nim}")
//	public String deleteStudent(@PathVariable Integer nim) {
//		return studentService.deleteStudent(nim);
//	}
	
//	@PostMapping("inputPasswordStudent")
//	public String inputPasswordStudent(@RequestBody String nim) {
//		return studentService.inputPasswordStudent(nim);
//	}
	
	@PostMapping("/generateKode")
	public String kodeUnik(@RequestBody String nim) {
		return studentService.kodeUnik(nim);
	}
	
	@PostMapping("/addPass")
	public String addPass(@RequestBody Student student) {
		return studentService.addPass(student);
	}
	
	@PostMapping("/updatePass")
	public String updatePass(@RequestBody Student student) {
		return studentService.updatePass(student);
	}
	
//	@PostMapping("/findName")
//	public String findName (@RequestBody String nama) {
//		return studentService.findName(nama);
//	}
	
//	@PostMapping("/findNim")
//	public String findNim (@RequestBody Integer nim) {
//		return studentService.findNim(nim);
//	}
	
//	@PostMapping("/findName")
//	public ResponseEntity<List<Student>> getFindByNameContainsIgnoreCase(@RequestParam String nama) {
//		return new ResponseEntity<List<Student>>(HttpStatus.OK);
	
	@PostMapping("/searchBy")
	public List<Student> findByName(@RequestBody String name) {
		return studentService.findByNameContainingIgnoreCase(name);
	}
		
//	@PostMapping("/updatePass")
//	public String updatePass(@RequestBody Student student) 
	
//	@PostMapping("/searchByNim")
//	public String findByNim(Integer nim) {
//		return studentService.findByNim(nim);
//	}
	
	}
