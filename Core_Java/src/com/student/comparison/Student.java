package com.student.comparison;

public class Student {
	private int studentId;
	private String studentName;
	private int studentScore;
	private int attendances;
	
	
	public Student() {
		super();
	}


	public Student(int studentId, String studentName, int studentScore, int attendances) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentScore = studentScore;
		this.attendances = attendances;
	}


	


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public int getStudentScore() {
		return studentScore;
	}


	public void setStudentScore(int studentScore) {
		this.studentScore = studentScore;
	}


	public int getAttendances() {
		return attendances;
	}


	public void setAttendances(int attendances) {
		this.attendances = attendances;
	}
	
	public boolean equals(Student obj) {
		if (this.attendances == obj.attendances || this.studentScore == obj.studentScore) {
			return true;
		}
		return super.equals(obj);
	}
}
