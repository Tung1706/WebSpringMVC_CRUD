package com.laptrinhjava.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.laptrinhjava.springmvc.dao.EmployeeDao;
import com.laptrinhjava.springmvc.model.Employee;

@Component
@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	// add employee
	public void addEmployee(Employee employee) {
		employeeDao.addEmployee(employee);
	}

	// get all employee
	public List<Employee> getAllEmployee() {
		return employeeDao.getAllEmployee();
	}

	// get employee by id
	public Employee getById(Long id) {
		return employeeDao.getEmployeeById(id);
	}

	// update employee

	public void updateEmployee(Employee employee) {
		employeeDao.updateEmployee(employee);
	}

	// delete employee

	public void deleteEmployee(Long id) {
		employeeDao.deleteEmployee(id);
	}

}
