package com.abstraction.clas;

public class Square extends Rectangle{

	public Square(String color, double width, double height) {
		super(color, width, height);
		// TODO Auto-generated constructor stub
	}

	public Square(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	public void draw() {
			
			double area=this.getHeight()*this.getWidth();
			System.out.println("Square filled with "+this.getColor()+" and Area is "+area);
			
		}

}