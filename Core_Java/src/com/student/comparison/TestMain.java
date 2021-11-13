package com.student.comparison;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
	public static void main(String[] args) {
		List<Student> batch1 = new ArrayList<Student>();
		List<Student> batch2 = new ArrayList<Student>();
		
		batch1.add(new Student(101,"m",20,10));
		batch1.add(new Student(102,"a",10,8));
		batch1.add(new Student(103,"b",30,7));
		batch1.add(new Student(104,"c",40,5));
		batch1.add(new Student(105,"d",60,9));
		
		batch2.add(new Student(201,"e",20,10));
		batch2.add(new Student(202,"f",10,8));
		batch2.add(new Student(203,"g",30,7));
		batch2.add(new Student(204,"h",40,5));
		batch2.add(new Student(205,"i",60,9));
		
		Student student = StudentComparison.compareStudents(batch1, batch2);
		
		if(student != null) {
			System.out.println("Student from batch " + student.getStudentId());
			System.out.println("Student Name " + student.getStudentName());
			System.out.println("Student Scroe " + student.getStudentScore());
			System.out.println("Student Attendances " + student.getAttendances());

		}
	}

}
