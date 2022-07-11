package com.jbk.student.model;

import com.jbk.student.entity.Student;

public class StudentBranch {
	
	private Student student;
	private Branch branch;
	
	public StudentBranch() {
		// TODO Auto-generated constructor stub
	}

	public StudentBranch(Student student, Branch branch) {
		super();
		this.student = student;
		this.branch = branch;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "StudentBranch [student=" + student + ", branch=" + branch + "]";
	}
	
	

}
