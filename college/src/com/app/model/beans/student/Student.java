package com.app.model.beans.student;


/*
 * all Student details are packed into class
 * 
 * User form submissions on student related data are stored into database 
 * by Student Object
 * 
 * 
 */

public class Student implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6857321703418967027L;
	private Long studentID;
	private String studentName;
	private String studentCGPA;

	
	public Student(){
		
		
	}
	
	/**
	 * @param studentID
	 * @param studentName
	 * @param studentCGPA
	 */
	public Student(Long studentID, String studentName, String studentCGPA) {
		
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentCGPA = studentCGPA;
	}

	public Long getStudentID() {
		return studentID;
	}

	public void setStudentID(Long studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentCGPA() {
		return studentCGPA;
	}

	public void setStudentCGPA(String studentCGPA) {
		this.studentCGPA = studentCGPA;
	}
	

}
