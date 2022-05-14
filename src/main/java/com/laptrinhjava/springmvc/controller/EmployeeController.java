package com.laptrinhjava.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.laptrinhjava.springmvc.model.Employee;
import com.laptrinhjava.springmvc.service.EmployeeService;

@Controller
@RequestMapping
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;

	// lode add employee form
	@GetMapping("addEmployee")
	public String addEmployee() {
		return "AddEmployee";
	}

	// save employee form
	@PostMapping("/insertEmployee")
	public String insertEmployee(@ModelAttribute("insertEmployee") Employee employee) {

		employeeService.addEmployee(employee);
		return "redirect:/employeeReport";
	}

	// lode employee data
	@GetMapping("employeeReport")
	public String lodeEmployee(Model model) {
		model.addAttribute("employee", employeeService.getAllEmployee());
		model.addAttribute("title", "Employee Report");

		return "EmployeeReport";
	}

	// lode edit form

	@GetMapping("/editEmployee/{id}")
	public String lodeEditForm(@PathVariable(value = "id") Long id, Model model) {
		Employee employee = employeeService.getById(id);

		System.out.println(employee);
		model.addAttribute("employee", employee);
		model.addAttribute("title", "Edit Employee");

		return "EditEmployee";

	}

	@PostMapping("/editEmployee/updateEmployee")
	public String updateEmp(@ModelAttribute("updateEmployee") Employee employee) {
		employeeService.updateEmployee(employee);

		return "redirect:/employeeReport";

	}

	@GetMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable Long id) {
		employeeService.deleteEmployee(id);

		return "redirect:/employeeReport";
	}

}
