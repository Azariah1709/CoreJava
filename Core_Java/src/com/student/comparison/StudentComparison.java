package com.student.comparison;

import java.util.List;

public class StudentComparison {
	
	public static Student compareStudents(List<Student> batch1, List<Student> batch2) {
		Student topStudent1 = null;
		Student topStudent2 = null;
		Student heightAttendance1 = null;
		Student heightAttendance2 = null;

		topStudent1 = getHeightestScroe(batch1);
		topStudent2 = getHeightestScroe(batch2);
		
		heightAttendance1 = getHeightAttendance(batch1);
		heightAttendance2 = getHeightAttendance(batch2);
		
		int Score1 =topStudent1.getStudentScore();
		int Score2 =topStudent2.getStudentScore();
		
		int attendances1 = heightAttendance1.getAttendances();
		int attendances2 = heightAttendance2.getAttendances();
		
		
		if (Score1 > Score2 || attendances1 > attendances2) {
			return topStudent1;
		}
		else if (Score1 < Score2 || attendances1< attendances2) {
			return topStudent2;
		}
		else if(attendances1 == attendances2 || Score1 > Score2 ) {
			return topStudent1;
		}
		else if(attendances1 == attendances2 || Score1 < Score2 ) {
			return topStudent2;
		}
		
		else if(attendances1 == attendances2 || Score1 == Score2 ) {
			return topStudent1;
		}
		
		return null;

	}

	public static Student getHeightestScroe(List<Student> list) {
		Student topStudent = null;
		int mark = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getStudentScore() > mark) {
				// 6
				topStudent = list.get(i);
				mark = list.get(i).getStudentScore();
			}
		}
		return topStudent;
	}
	
	public static Student getHeightAttendance(List<Student> list) {
		Student heightAttendance = null;
		int attendances = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAttendances() > attendances) {
				heightAttendance = list.get(i);
				attendances = list.get(i).getAttendances();
			}
		}
		return heightAttendance;
	}

}
