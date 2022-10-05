package com.example.zakkibcc.DTO;

import java.util.Date;
import java.util.List;

public class StudentDto {
	
	public String nim;
	public String name;
	public Date dob;
	public String gender;
	public Integer codePs;
	public String password;
	public List<ScoreDto> scoreDto;
	
	public String getNim() {
		return nim;
	}
	public void setNim(String nim) {
		this.nim = nim;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getCodePs() {
		return codePs;
	}
	public void setCodePs(Integer codePs) {
		this.codePs = codePs;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<ScoreDto> getScoreDto() {
		return scoreDto;
	}
	public void setScoreDto(List<ScoreDto> scoreDto) {
		this.scoreDto = scoreDto;
	}
	
}
