package com.example.zakkibcc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.zakkibcc.model.Grade;

@Repository
public interface GradeRepository extends JpaRepository<Grade, Integer> {

	List<Grade> findByNim(String nim);
}
