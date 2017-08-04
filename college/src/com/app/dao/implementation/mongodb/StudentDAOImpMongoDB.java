package com.app.dao.implementation.mongodb;

 /*
  * This one connects to Mongo database to make operations 
  * on Student data, in database.
  * 
  * Target Database : Mongo DB
  * 
  * methods:
  * 
  * 	updateStudent
  * 	deleteStudent
  * 	createStudent
  */


import com.app.dao.StudentDAO;
import com.app.model.beans.student.Student;
import com.app.dao.implementation.mongodb.dbconnection.*;
import com.mongodb.MongoClient;

public class StudentDAOImpMongoDB implements StudentDAO {

	@Override
	public void updateStudent(Student student) {
		//CollegeMongoDB.INSTANCE.getReference();
		//MongoClient c= CollegeMongoDB.INSTANCE.getReference();

	}

	@Override
	public void deleteStudent(Student student) {

	}

	@Override
	public void createStudent(Student student) {

	}

}
