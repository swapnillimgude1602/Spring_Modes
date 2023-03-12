package com.core.autowire.bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.core.autowire.byname.Employee;

public class Main_Testautowiretype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resources")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/core/autowire/bytype/application-context_1.xml");
		
		Employeetype employee = (Employeetype) context.getBean("employee");
		System.out.println(employee.getFullName());
		System.out.println(employee.getDepartment().getName());

	}

}
