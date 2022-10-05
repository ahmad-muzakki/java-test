package com.example.zakkibcc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.zakkibcc.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

}
