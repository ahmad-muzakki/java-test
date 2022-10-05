package com.example.zakkibcc.repository;

//import java.util.HashMap;
import java.util.List;
//import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

//import com.example.zakkibcc.DTO.ScoreDTO;
import com.example.zakkibcc.model.Student;

@Repository
//public interface StudentRepository extends JpaRepository<Student, Integer> {
//	 
//}

public interface StudentRepository extends JpaRepository<Student, String> {
	List<Student> findByNameContainingIgnoreCase(String name);
//	 @Query("SELECT * FROM MAHASISWA m \r\n"
//		 		+ "WHERE NAMA LIKE '%Budi%'")
//		    Student student (String nama);
//	 @Query(value="SELECT m FROM MAHASISWA m \r\n"
//		 		+ "WHERE NAMA LIKE '?!'");


//	 List<Student> findByNim(String nama);
//	 
	Student findByNim(String nim);
}