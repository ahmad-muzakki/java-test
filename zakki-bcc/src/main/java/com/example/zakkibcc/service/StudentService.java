package com.example.zakkibcc.service;

//import java.util.HashMap;
import java.util.List;
//import java.util.Map;

//import com.example.zakkibcc.DTO.ScoreDTO;
import com.example.zakkibcc.DTO.StudentDto;
import com.example.zakkibcc.model.Student;


public interface StudentService {

	public List<Student> getAllStudent();
	
	public String addStudent(Student student);
	
	public String updateStudent(Student student);
	
	public String deleteStudent(String nim);
	
//	public String inputPasswordStudent(String nim);
	
	public String kodeUnik(String nim);
	
	public String addPass(Student student);
	
	public String updatePass(Student student);
	
//	public List<Student> findByNameContainsIgnoreCase(String nama);
	
//	public String findNim(Integer nim);
//	
//	public Map<String, Integer> hm = new HashMap<String, Integer>();
	
	public List<Student> findByNameContainingIgnoreCase(String name);
	
	public StudentDto showData(String nim);
}
