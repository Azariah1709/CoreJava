package com.method.overriding;

public class Professor extends Person{
	
	private int booksPublished;
	
	

	


	public Professor() {
		super();
	}


	public Professor(String name, int booksPublished) {
		super(name);
		this.booksPublished = booksPublished;
	}


	public void print() {
		System.out.println("Name :"+name);
		System.out.println("Books Published :"+booksPublished);
		
	}
	
	public boolean isOutStanding() {
		boolean flag= false;
		if(booksPublished>4) {
			flag=true;
		}
		return  flag;
	}
	
	

}
