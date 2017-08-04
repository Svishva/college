package com.app.dao;

/*
 * This is DAO interface for Student which can do 
 * functions like
 * UPDATE, DELETE, CREATE etc.
 * 
 * 
 */
import com.app.model.beans.student.Student;;

public interface StudentDAO {

	public void updateStudent(Student student);

	public void deleteStudent(Student student);

	public void createStudent(Student student);

}
