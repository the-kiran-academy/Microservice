package com.jbk.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.jbk.student.dao.StudentDao;
import com.jbk.student.entity.Student;
import com.jbk.student.model.Branch;
import com.jbk.student.model.StudentBranch;

@Service
public class StudentService_impl implements StudentService {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private StudentDao dao;

	@Override
	public boolean saveStudent(Student student) {

		return dao.saveStudent(student);
	}

	@Override
	public Student getStudent(int studentId) {

		return dao.getStudent(studentId);
	}

	@Override
	public StudentBranch getStudentWithBranch(int studentId) {
	
		Student student = getStudent(studentId);
		Branch branch = restTemplate.getForObject("http://localhost:8081/branch/getBranch?branchId="+student.getBranchId(), Branch.class);
		StudentBranch studentBranch=new StudentBranch(student, branch);
		return studentBranch;
	}

}
