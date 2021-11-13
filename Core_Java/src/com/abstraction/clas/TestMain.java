package com.abstraction.clas;

import java.util.ArrayList;
import java.util.List;

public class TestMain {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Shape> shapes=new ArrayList<Shape>();
		
		Rectangle r=new Rectangle("Black",15,20);
		Square s=new Square("Green",15,15);
		Circle c=new Circle("Orange",5);
		shapes.add(r);
		shapes.add(s);
		shapes.add(c);
		
		for(Shape sh:shapes) {
			if(sh instanceof Circle) {
				((Circle)sh).draw();
			}
			else if(sh instanceof Rectangle) {
				((Rectangle)sh).draw();
			}
			else if(sh instanceof Square) {
				((Square)sh).draw();
			}
		}
	}

}
