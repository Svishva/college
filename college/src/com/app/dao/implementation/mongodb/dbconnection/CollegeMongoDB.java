package com.app.dao.implementation.mongodb.dbconnection;

 /*
  * Singleton implementation of MongoDB Connection
  * using enum
  * 
  * All connections to database make use of this 
  * Reference to make operations
  * 
  * USAGE:
  * 		 import this package
  *  	call CollegeMongoDB.getInstance()
  * 
  * @author visweshwaran
  */
import com.mongodb.MongoClient;

/*
 public final class CollegeMongoDB{
	 
	 
	  // To restrict Object creation for CollegeMongoDB class
	  // private constructor is used
	 
	 	private CollegeMongoDB(){
		 
		 
	 	}
	 
	 
	 	public static final MongoClient getInstance(){
		 
		 return CollegeMongo.INSTANCE.getReference();
	 	}
	 
 }

 */

	/*
	 * Implementation of enum using Single element enum.
	 * Protects against Serealization & Reflection  attacks
	 * 
	 */

public enum CollegeMongoDB {
	
	
	INSTANCE;
	
	  private  static final MongoClient mc = new MongoClient( "localhost" , 27017 );

	  public final MongoClient getReference(){
		
		System.out.println("Student Database getReference() executed");
		return mc;
	
	}
}
