package com.jbk.student.service;

import com.jbk.student.entity.Student;
import com.jbk.student.model.StudentBranch;

public interface StudentService {
	public boolean saveStudent(Student student);
	public Student getStudent(int studentId);
	public StudentBranch getStudentWithBranch(int studentId);
	

}
