package com.mindtree.hibEmployee.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.hibEmployee.dao.EmployeeDao;
import com.mindtree.hibEmployee.entity.Employee;
import com.mindtree.hibEmployee.service.EmployeeService;

@Component
@Repository
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Transactional
	public String create(Employee employee) {
		return employeeDao.create(employee);
	}

	public Employee read(int id) {
		return employeeDao.read(id);
	}

	@Transactional(readOnly = false)
	public int update(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.update(employee);
	}

	@Transactional(readOnly = false)
	public int delete(int id) {
		return employeeDao.delete(id);
	}

	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeDao.getAllEmployee();
	}

}
