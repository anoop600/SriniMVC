package com.mindtree.hibEmployee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.mindtree.hibEmployee.bean.FactoryMethod;
import com.mindtree.hibEmployee.entity.Employee;
import com.mindtree.hibEmployee.service.EmployeeService;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(FactoryMethod.class);
		EmployeeService es = context.getBean(EmployeeService.class);
		Employee emp = context.getBean(Employee.class);

		emp.setEmpId(1);
		emp.setUsername("anoop");
		emp.setDob("1111-11-11");
		emp.setEmailid("a@a");
		emp.setFullName("Anoop Jain");
		emp.setGender("male");
		emp.setPassword("jdevbwubv".hashCode() + "");
		emp.setSecurityQuestion("jdnaocdn ? ? ? ?");
		emp.setSecurityAnswer("Hi");
		es.create(emp);

		// System.out.println(es.read(7));
		Employee employee = new Employee();
		employee.setEmpId(5);
		employee.setEmailid("sdvnionvc@nciaudc");
		// System.out.println(es.update(employee));

		// System.out.println(es.delete(5));

		es.getAllEmployee().forEach(System.out::println);
		((AbstractApplicationContext) context).close();
	}
}
