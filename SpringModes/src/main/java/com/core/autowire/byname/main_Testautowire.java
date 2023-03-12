package com.core.autowire.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main_Testautowire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resources")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/core/autowire/byname/application-context.xml");
		
		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee.getFullName());
		System.out.println(employee.getDepartment().getName());

	}

}
