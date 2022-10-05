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

import com.example.zakkibcc.model.Course;
import com.example.zakkibcc.service.CourseService;

@RestController
@RequestMapping("/api/course")
public class CourseController {
	
	@Autowired
	CourseService courseService;
	
	@GetMapping
	public List<Course> getAllCourse() {
		return courseService.getAllCourse();
	}
	
	@PostMapping("addCourse")
	public String addCourse(@RequestBody Course course) {
		return courseService.addCourse(course);
	}
	
	@PutMapping("updateCourse")
	public String updateCourse(@RequestBody Course course) {
		return courseService.updateCourse(course);
	}
	
	@DeleteMapping("{kodeMatkul}")
	public String deleteCourse(@PathVariable Integer kodeMatkul) {
		return courseService.deleteCourse(kodeMatkul);
	}
	
}
