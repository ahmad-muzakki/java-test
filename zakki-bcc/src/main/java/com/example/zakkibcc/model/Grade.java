package com.example.zakkibcc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nilai", schema = "hr")
public class Grade {
	@Id
	@Column(name="	kode_nilai")
	private String kodeNilai;

	public String getKodeNilai() {
		return kodeNilai;
	}

	public void setKodeNilai(String kodeNilai) {
		this.kodeNilai = kodeNilai;
	}
	
	@Column (name="nim")
	private String nim;

	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}
	
	@Column (name="kode_matkul")
	private String kodeMatkul;

	public String getKodeMatkul() {
		return kodeMatkul;
	}

	public void setKodeMatkul(String kodeMatkul) {
		this.kodeMatkul = kodeMatkul;
	}
	
	@Column (name="nilai")
	private Integer nilai;

	public Integer getNilai() {
		return nilai;
	}

	public void setNilai(Integer nilai) {
		this.nilai = nilai;
	}
}
