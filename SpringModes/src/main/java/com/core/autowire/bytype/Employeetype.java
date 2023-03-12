package com.core.autowire.bytype;

import org.springframework.beans.factory.annotation.Autowired;


public class Employeetype {
	private String fullName;
	
	@Autowired
	private Departmenttype department;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Departmenttype getDepartment() {
		return department;
	}

	public void setDepartment(Departmenttype department) {
		this.department = department;
	}
	
	

}
