package com.abstraction.clas;

public class Circle extends Shape{

	private double radius;

	public Circle(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void draw() {
			
			double area=3.14*radius*radius;
			System.out.println("Circle filled with "+this.getColor()+" and Area is "+area);
			
		}

}
