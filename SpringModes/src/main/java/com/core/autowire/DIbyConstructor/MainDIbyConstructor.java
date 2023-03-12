package com.core.autowire.DIbyConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDIbyConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/core/autowire/DIbyConstructor/appplication-context.xml");
		Student std = (Student)context.getBean("s");
		std.disp();
		
	}

}
