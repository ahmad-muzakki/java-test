package com.example.zakkibcc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "prog_stud", schema = "hr")
public class StudyProgram {
	@Id
	@Column(name = "kode_ps")
	private Integer kodePs;
	
	@Column(name = "nama_ps")
	private String namaPs;

	public Integer getKodePs() {
		return kodePs;
	}

	public void setKodePs(Integer kodePs) {
		this.kodePs = kodePs;
	}

	public String getNamaPs() {
		return namaPs;
	}

	public void setNamaPs(String namaPs) {
		this.namaPs = namaPs;
	}
}
