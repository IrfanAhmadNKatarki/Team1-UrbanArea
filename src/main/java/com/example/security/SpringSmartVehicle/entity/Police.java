package com.example.security.SpringSmartVehicle.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Police {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String dlno;
	private String name;
	private LocalDate dateofBirth;
	private String address;
	private String phonenumber;

	public Police() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Police(int id, String dlno, String name, LocalDate dateofBirth, String address, String phonenumber) {
		super();
		this.id = id;
		this.dlno = dlno;
		this.name = name;
		this.dateofBirth = dateofBirth;
		this.address = address;
		this.phonenumber = phonenumber;
	}

	public Police(String dlno, String name, LocalDate dateofBirth, String address, String phonenumber) {
		super();
		this.dlno = dlno;
		this.name = name;
		this.dateofBirth = dateofBirth;
		this.address = address;
		this.phonenumber = phonenumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDlno() {
		return dlno;
	}

	public void setDlno(String dlno) {
		this.dlno = dlno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(LocalDate dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

}
