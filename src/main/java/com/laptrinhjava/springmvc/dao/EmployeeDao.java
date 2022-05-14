package com.laptrinhjava.springmvc.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.laptrinhjava.springmvc.model.Employee;

@Component
public class EmployeeDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	// add all employee
	@Transactional
	public void addEmployee(Employee employee) {
		hibernateTemplate.save(employee);
	}

	// get all employee
	public List<Employee> getAllEmployee() {
		return hibernateTemplate.loadAll(Employee.class);
	}

	// get employee by id
	@Transactional
	public Employee getEmployeeById(Long id) {

		Employee employee = hibernateTemplate.get(Employee.class, id);
		return employee;
	}

	// update employee
	@Transactional
	public void updateEmployee(Employee employee) {
		hibernateTemplate.update(employee);
	}

	// delete employee
	@Transactional
	public void deleteEmployee(Long id) {
		hibernateTemplate.delete(hibernateTemplate.load(Employee.class, id));
	}

}
