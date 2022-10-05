package com.example.zakkibcc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "matakuliah", schema = "hr")
public class Course {
	@Id
	@Column(name="kode_matkul")
	private Integer kodeMatkul;

	public Integer getKodeMatkul() {
		return kodeMatkul;
	}

	public void setKodeMatkul(Integer kodeMatkul) {
		this.kodeMatkul = kodeMatkul;
	}
	
	@Column (name="nama_matkul")
	private String namaMatkul;

	public String getNamaMatkul() {
		return namaMatkul;
	}

	public void setNamaMatkul(String namaMatkul) {
		this.namaMatkul = namaMatkul;
	}
	
	@Column (name="sks")
	private Integer sks;

	public Integer getSks() {
		return sks;
	}

	public void setSks(Integer sks) {
		this.sks = sks;
	}
	
	String a = "al";
}
