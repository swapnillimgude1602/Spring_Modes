package com.core.autowire.DIbyConstructor;

public class Student {

	private int sid;
	private String Sname;
	
	public Student() {
		
	}
	
	public Student(String sname) {
		super();
		
		this.Sname = sname;
	}
		public Student(int sid) {
			super();
			this.sid = sid;
			
		}
	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.Sname = sname;
	}
	
	void disp()
	{
		System.out.println(sid+""+Sname);
	}
	
	
}
