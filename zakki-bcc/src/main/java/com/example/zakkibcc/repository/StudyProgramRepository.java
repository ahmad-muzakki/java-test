package com.example.zakkibcc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.zakkibcc.model.StudyProgram;

@Repository
public interface StudyProgramRepository extends JpaRepository<StudyProgram, Integer> {

}
