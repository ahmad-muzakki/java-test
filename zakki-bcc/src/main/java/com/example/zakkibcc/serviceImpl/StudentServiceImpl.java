package com.example.zakkibcc.serviceImpl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

import javax.swing.table.DefaultTableModel;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.zakkibcc.DTO.StudentDto;
import com.example.zakkibcc.model.Grade;
import com.example.zakkibcc.model.Student;
import com.example.zakkibcc.repository.GradeRepository;
import com.example.zakkibcc.repository.StudentRepository;
import com.example.zakkibcc.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	GradeRepository gradeRepository;
	
	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public List<Student> getAllStudent() {
		List<Student> result = studentRepository.findAll();
		return result;
	}

	@Override
	public String addStudent(Student student) {
		String result = "Add Student Failed";
		
		if(student != null) {
			studentRepository.save(student);
			result = "Add Study Program Success";
		} 
		
		return result;
	}

	@Override
	public String updateStudent(Student student) {
		String result = "Update Student Failed";
		
		Optional<Student> optStudent = studentRepository.findById(student.getNim());
		
		if(optStudent.isPresent()) {
			studentRepository.save(student);
			result = "Update Student Success";
		}
		
		return result;
		
	}

	@Override
	public String deleteStudent(String nim) {
		String result = "Delete Student Failed";
		
		Optional<Student> optStudent = studentRepository.findById(nim);
		
		if(optStudent.isPresent()) {
			studentRepository.deleteById(nim);
			result = "Delete Student Success";
		}
		
		return result;
	}
	
//	@Override
//	public String inputPasswordStudent(String nim) {
//		
//		nim = "nim";
//		String substrNim = "";
//		substrNim = nim.substring(1,4);
//				
//		Date dateAndTime = new Date();
//		
//		int random = (int) (Math.random() * 1000);
//		
//		String hasil = substrNim + "/" + dateAndTime + "/" + random;
//		
//		return hasil;
//		
//	}
	
	public String kodeUnik(String nim) {
		String result=nim.substring(0,3);
		
		
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("ddMMyy");
		String str = formatter.format(date);
		String a= result+"/"+str;
		
		int nilai = (int)(Math.random()*1001);
		String b =String.valueOf(nilai);
		
		int panjang = b.length();
		
		if(panjang==1) {
			b="000"+b;
		}else if(panjang==2) {
			b="00"+b;
		}else if(panjang==3) {
			b="0"+b;
		}else if(panjang==4) {
			b+=b;
		}
		
		
		String maka = a+"/"+b;
		return maka;
	}
	
//	@Override
//	public String addPass(Student student) {
//		String result = "Add Pass Failed";
//		if(student != null) {
//			BCryptPasswordEncoder passEncoder = new BCryptPasswordEncoder();
//			String pass = student.getPassword();
//			student.setPassword(passEncoder.encode(pass));
////			result = passEncoder.encode(student);
//			studentRepository.save(student);
//			result = "Add Pass Success";
//		}
//		return result;
//	}
	
//	@Override
//	public String updatePass(Student student) {
//		String result = "Update Pass Failed";
//		if(student != null) {
//			BCryptPasswordEncoder passEncoder = new BCryptPasswordEncoder();
//			String pass = student.getPassword();
//			student.setPassword(passEncoder.encode(pass));
////			result = passEncoder.encode(student);
//			studentRepository.save(student);
//			result = "Update Pass Success";
//		}
//		return result;
//	}

//	@Override
//	public List<Student> findByNameContainsIgnoreCase(String nama) {
//		String result = "Name Not Found";
//		if (nama != null) {
//			Scanner scanner = new Scanner(System.in);
//			String findNama = scanner.next(nama);
//			result = nama;
//		}
//		return null;
//		try {
//			   String sql = "select nama from student";
//			            pst = conn.prepareStatement(sql);
//			            rs = pst.executeQuery(sql);
//			            tabel.setModel(DbUtils.resultSetToTableModel(rs));
//			        } catch (Exception e) {
//			            JOptionPane.showMessageDialog(null, e);
//			        }
//	}
	
//	@Override
//	public String findNim(Integer nim) {
//		String result = "Finding Name Failed";
//		if (nim != null) {
//			Scanner scanner = new Scanner(System.in);
//			String findNim = "";
//			int findNim2 = findNim.indexOf(scanner.nextInt(nim));
//			result = "Finding Nim Success";
//		}
//		return result;
//	}

	@Override
	public String addPass(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updatePass(Student student) {
		// TODO Auto-generated method stub
		return null;
	}
	
//	Map<String, Integer> hm = new HashMap<String, Integer>();
//	 hm.put(nim, new Integer(nilai));
	
	@Override
	public List<Student> findByNameContainingIgnoreCase(String name) {
		return studentRepository.findByNameContainingIgnoreCase(name);
	
	}

	@Override
	public StudentDto showData(String nim) {
		// TODO Auto-generated method stub
		return null;
	}

//@Override
//public StudentDto showData(String nim) {
//	Student listStudent = studentRepository.findByNim(nim);
//	List<Grade> listGrade = gradeRepository.findByNim(nim);
//	return Student;
//}

	
	
//	@Override
//	public StudentDTO showData (String nim) {
//		return studentRepository.showData(nim);
//	}
//	
	
	
}

