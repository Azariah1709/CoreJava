package com.method.overriding;

public class Person {
	protected String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	public Person() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isOutStanding() {
		boolean flag= true;
		return  flag;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", getName()=" + getName() + ", isOutStanding()=" + isOutStanding() + "]";
	}
	
	
	

}
