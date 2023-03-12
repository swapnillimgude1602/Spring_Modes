package com.core.autowireonConstructors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.core.autowireonSetmethods.TextEditor;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/core/autowireonConstructors/Beans.xml");

		TextEditor te = (TextEditor) context.getBean("textEditor");
		te.spellCheck();

	}

}
