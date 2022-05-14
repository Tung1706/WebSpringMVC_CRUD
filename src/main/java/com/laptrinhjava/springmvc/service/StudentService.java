package com.laptrinhjava.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.laptrinhjava.springmvc.dao.StudentDao;
import com.laptrinhjava.springmvc.model.Student;

@Component
@Service
public class StudentService {

	@Autowired
	private StudentDao studentDao;

	// save student
	public void saveStudent(Student student) {
		studentDao.saveStudent(student);
	}

	// get all student
	public List<Student> getAllStudent() {
		return studentDao.getAllStudent();
	}

	// get by id

	public Student getById(Long id) {
		return studentDao.getById(id);
	}

	// update student

	public void updateStudent(Student student) {
		studentDao.updateStudent(student);
	}

	// delete Student

	public void deleteStudent(Long id) {
		studentDao.deleteStudent(id);
	}

}
