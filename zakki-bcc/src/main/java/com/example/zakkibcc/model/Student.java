package com.example.zakkibcc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mahasiswa", schema = "hr")
public class Student {
	@Id
	@Column(name="nim")
	private String nim;

	@Column (name="nama")
	private String nama;
	
	@Column (name="tgl_lhr")
	private String tglLhr;
	
	@Column (name="alamat")
	private String alamat;
	
	@Column (name="jns_kelamin")
	private String jnsKelamin;
	
	@Column (name="kode_ps")
	private Integer kodePs;
	
//	@Column
	
//	@Column (name="password")
//	private String password;
	
//	@Column(name="password")
//	private String password;
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}

	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getTglLhr() {
		return tglLhr;
	}

	public void setTglLhr(String tglLhr) {
		this.tglLhr = tglLhr;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getJnsKelamin() {
		return jnsKelamin;
	}

	public void setJnsKelamin(String jnsKelamin) {
		this.jnsKelamin = jnsKelamin;
	}

	public Integer getKodePs() {
		return kodePs;
	}

	public void setKodePs(Integer kodePs) {
		this.kodePs = kodePs;
	}

//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
	
}
