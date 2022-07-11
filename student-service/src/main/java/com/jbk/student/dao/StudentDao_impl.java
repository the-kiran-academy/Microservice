package com.jbk.student.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.student.entity.Student;

@Repository
public class StudentDao_impl implements StudentDao {

	@Autowired
	private SessionFactory sf;

	@Override
	public boolean saveStudent(Student student) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		boolean b = false;
		try {
			session.save(student);
			transaction.commit();
			b = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return b;
	}

	@Override
	public Student getStudent(int studentId) {
		Session session = sf.openSession();
		Student student = null;
		try {
			student = session.get(Student.class, studentId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return student;
	}

}
