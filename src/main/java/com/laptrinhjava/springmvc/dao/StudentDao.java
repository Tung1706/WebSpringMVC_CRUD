package com.laptrinhjava.springmvc.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.laptrinhjava.springmvc.model.Student;

@Component
public class StudentDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	// save student
	@Transactional
	public void saveStudent(Student student) {
		hibernateTemplate.save(student);
	}

	// get all student
	public List<Student> getAllStudent() {
		return hibernateTemplate.loadAll(Student.class);
	}

	// get student by id
	public Student getById(Long id) {
		return hibernateTemplate.get(Student.class, id);

	}

	// update student
	@Transactional
	public void updateStudent(Student student) {
		hibernateTemplate.update(student);
	}

	// delete student
	@Transactional
	public void deleteStudent(Long id) {
		hibernateTemplate.delete(hibernateTemplate.get(Student.class, id));
	}

}
