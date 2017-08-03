package com.app.model.dbconnect;

import com.mongodb.MongoClient;

public enum StudentDatabase {
	
	
	INSTANCE;
	
	  private  static final MongoClient mc = new MongoClient( "localhost" , 27017 );

	public final MongoClient getReference(){
		
		System.out.println("Student Database getReference() executed");
		return mc;
	
	}

}
