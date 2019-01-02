package com.mindtree.hibEmployee.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.hibEmployee.entity.Employee;
import com.mindtree.hibEmployee.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService es;

	@RequestMapping("/index")
	public ModelAndView indexPage() {
		return new ModelAndView("index", "message", "");
	}

	@RequestMapping("/addEmp1")
	public ModelAndView addEmployeePage() {
		return new ModelAndView("addEmp", "message", "");
	}

	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
	public ModelAndView addEmployee(@ModelAttribute("employee") @Validated Employee employee,
			BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return new ModelAndView("index", "message", "Unsuccessfull");
		}

		System.out.println(employee);
		es.create(employee);
		return new ModelAndView("index", "message", "Add Successfully");
	}

	@RequestMapping("/deleteEmp1")
	public ModelAndView deleteEmployeePage() {

		return new ModelAndView("deleteEmp");
	}

	@RequestMapping(value = "/deleteEmp", method = RequestMethod.POST)
	public ModelAndView deleteEmployee(Employee employee, Model model) {
		System.out.println(employee.getEmpId());
		es.delete(employee.getEmpId());
		return new ModelAndView("index", "message", "Deleted Successfully");
	}

	@RequestMapping("/getAllEmpDetails1")
	public ModelAndView getEmployeePage() {
		List<Employee> e = es.getAllEmployee();
		return new ModelAndView("getAllEmpDetails", "message", e);
	}

	@RequestMapping("/getByEmpId1")
	public ModelAndView getEmployeeByIDPage() {
		return new ModelAndView("getByEmpId", "message", "");
	}

	@RequestMapping(value = "/getByEmpId", method = RequestMethod.POST)
	public ModelAndView getEmployeeById(Employee employee, Model model) {
		System.out.println(employee.getEmpId());
		Employee e = es.read(employee.getEmpId());
		List<Employee> emps = new ArrayList<Employee>();
		emps.add(e);
		System.out.println(emps);
		return new ModelAndView("getByEmpId", "message", emps);
	}

	@RequestMapping("/checkLogin1")
	public ModelAndView checkLoginPage(Employee employee, Model model) {
		List<Employee> e = es.getAllEmployee();
		for (int i = 0; i < e.size(); i++) {
			if (e.get(i).getUsername().equals(employee.getUsername())
					&& e.get(i).getPassword().equals(employee.getPassword()))
				return new ModelAndView("checkLogin", "message", "Login Success");
		}
		return new ModelAndView("checkLogin", "message", "Login Failed");
	}

}
