package com.abstraction.clas;

public class Rectangle  extends Shape{
	
	private double width;
	private double height;
	
	public Rectangle(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	public Rectangle(String color, double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void draw() {

		double area=height*width;
		System.out.println("Rectangle filled with "+this.getColor()+" and Area is "+area);
		
	}

}
