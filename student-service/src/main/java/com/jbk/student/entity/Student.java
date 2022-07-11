package com.jbk.student.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int studentId;
	private String studentName;
	private String gender;
	private int branchId;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String studentName, String gender, int branchId) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.gender = gender;
		this.branchId = branchId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", gender=" + gender + ", branchId="
				+ branchId + "]";
	}
	
	

}
