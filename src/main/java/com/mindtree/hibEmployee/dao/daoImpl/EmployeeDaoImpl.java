package com.mindtree.hibEmployee.dao.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.mindtree.hibEmployee.dao.EmployeeDao;
import com.mindtree.hibEmployee.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private HibernateTemplate hibernatetemplate;

	public String create(Employee employee) {
		hibernatetemplate.save(employee);
		return "inserted";
	}

	public Employee read(int id) {
		return hibernatetemplate.get(Employee.class, id);

	}

	public int update(Employee employee) {
		Employee emp = read(employee.getEmpId());
		emp.setEmailid(employee.getEmailid());
		hibernatetemplate.saveOrUpdate(emp);
		return 1;
	}

	public int delete(int id) {
		// TODO Auto-generated method stub
		Employee emp = read(id);
		hibernatetemplate.delete(emp);
		return 1;
	}

	public List<Employee> getAllEmployee() {
		return hibernatetemplate.loadAll(Employee.class);
	}

}
