package com.method.overriding;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
	
	public static void main(String[] args) {
		List<Person> people = new ArrayList<Person>();
		Student student = new Student();
		Professor professor = new Professor();
		people.add(new Professor("Mohit" ,12));
		people.add(new Professor("Arun",3));
		people.add(new Professor("Jhon",5));
		people.add(new Student("std1", 92));
		people.add(new Student("std2", 85));
		people.add(new Student("std5", 12));
//		
		
//		Professor pr1 = new Professor("Ajax",8);
//		Professor pr2 = new Professor("Ajay",5);
//		Professor pr3 = new Professor("Ajla",3);
//		Student s1 = new Student("Sam",89);
//		Student s2 = new Student("Josh",89);
//		
//		person.add(pr1);
//		person.add(pr2);
//		person.add(pr3);
//		person.add(s1);
//		person.add(s2);
		
		for(Person p : people) {
//			System.out.println(p);
			if(p instanceof Professor) {
				if(p.isOutStanding()==true) {
					((Professor) p).print();
				}
			}
			else if(p.isOutStanding()==true) {
				((Student) p).display();
			}
		}
//		professor.print();
//		student.display();
	}

}
