package com.example.zakkibcc.serviceImpl;


import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import com.example.zakkibcc.model.StudyProgram;
import com.example.zakkibcc.repository.StudyProgramRepository;
import com.example.zakkibcc.service.StudyProgramService;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Service
public class StudyProgramServiceImpl implements StudyProgramService {
	
	@Autowired
	StudyProgramRepository studyProgramRepository;
	
	@Override
	public List<StudyProgram> getAllStudyProgram() {
		List<StudyProgram> result = studyProgramRepository.findAll();
		return result;
	}

	@Override
	public String addStudyProgram(StudyProgram studyProgram) {
		String result = "Add Study Program Failed";
		
		if(studyProgram != null) {
			studyProgramRepository.save(studyProgram);
			result = "Add Study Program Success";
		} 
		
		return result;
	}

	@Override
	public String updateStudyProgram(StudyProgram studyProgram) {
		String result = "Update Study Program Failed";
		
		Optional<StudyProgram> optStudyProgram = studyProgramRepository.findById(studyProgram.getKodePs());
		
		if(optStudyProgram.isPresent()) {
			studyProgramRepository.save(studyProgram);
			result = "Update Study Program Success";
		}
		
		return result;
	}

	@Override
	public String deleteStudyProgram(Integer kodePs) {
		String result = "Delete Study Program Failed";
		
		Optional<StudyProgram> optStudyProgram = studyProgramRepository.findById(kodePs);
		
		if(optStudyProgram.isPresent()) {
			studyProgramRepository.deleteById(kodePs);
			result = "Delete Study Program Success";
		}
		
		return result;
	}

	@Override
	public byte[] getStudyProgramReport() throws JRException, IOException {
		
		InputStream filePath = new ClassPathResource("templates/Blank_A4.jrxml")
				.getInputStream();
		List <StudyProgram> studyProgram = getAllStudyProgram();
		
		JRBeanCollectionDataSource ds = new JRBeanCollectionDataSource(studyProgram);
		
		JasperReport report = JasperCompileManager.compileReport(filePath);
		
		final Map <String, Object> parameters = new HashMap<>();
		parameters.put("createdBy", "Zakki");
		
		JasperPrint print = JasperFillManager.fillReport(report, parameters, ds);
		
		byte[] byteArr = JasperExportManager.exportReportToPdf(print);
		
		return byteArr;
			
	}

}
