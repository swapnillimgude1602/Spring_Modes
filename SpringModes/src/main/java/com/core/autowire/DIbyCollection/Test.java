package com.core.autowire.DIbyCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ApplicationContext context = new ClassPathXmlApplicationContext("com/core/autowire/DIbyCollection/application-context.xml");
			
			Question q=(Question)context.getBean("q"); 
			q.displayInfo();
			}

	}
