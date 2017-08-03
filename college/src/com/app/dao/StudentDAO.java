package com.app.dao;

import com.app.student.Student;

public interface StudentDAO {

	public void updateStudent(Student student);

	public void deleteStudent(Student student);

	public void createStudent(Student student);

}
