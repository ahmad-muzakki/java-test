package com.example.zakkibcc.service;

import java.util.List;
import com.example.zakkibcc.model.Course;


public interface CourseService {
	
	public List<Course> getAllCourse();
	
	public String addCourse(Course course);
	
	public String updateCourse(Course course);
	
	public String deleteCourse(Integer kodeMatkul);
}
