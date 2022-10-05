package com.example.zakkibcc.serviceImpl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.zakkibcc.model.Course;
import com.example.zakkibcc.repository.CourseRepository;
import com.example.zakkibcc.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	CourseRepository courseRepository;
	
	@Override
	public List<Course> getAllCourse() {
		List<Course> result = courseRepository.findAll();
		return result;
	}

	@Override
	public String addCourse(Course course) {
		String result = "Add Course Failed";
		
		if(course != null) {
			courseRepository.save(course);
			result = "Add Course Success";
		} 
		
		return result;
	}

	@Override
	public String updateCourse(Course course) {
		String result = "Update Course Failed";
		
		Optional<Course> optCourse = courseRepository.findById(course.getKodeMatkul());
		
		if(optCourse.isPresent()) {
			courseRepository.save(course);
			result = "Update Course Success";
		}
		
		return result;
	}

	@Override
	public String deleteCourse(Integer kodeMatkul) {
		String result = "Delete Course Failed";
		
		Optional<Course> optCourse = courseRepository.findById(kodeMatkul);
		
		if(optCourse.isPresent()) {
			courseRepository.deleteById(kodeMatkul);
			result = "Delete Course Success";
		}
		
		return result;
	}

}
