package com.method.overriding;

public class Student extends Person {
	
	private double percentage;
	
	
	public Student() {
		super();
	}


	public Student(String name, double percentage) {
		super(name);
		this.percentage = percentage;
	}

	
	public void display() {
		System.out.println("Student Name :"+name);
		System.out.println("Student Percentage :"+percentage);
	}

	public boolean isOutStanding() {
		boolean flag= false;
		if(percentage>85) {
			flag=true;
		}
		return  flag;
	}
	
	

}
