<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="com.app.dao.implementation.mongodb.dbconnection.*" %>
<%@ page import ="com.mongodb.client.FindIterable" %>
<%@ page import ="com.mongodb.DBCursor" %>
<%@ page import ="com.mongodb.Cursor" %>
<%@ page import="com.mongodb.DBCollection" %>
<%@ page import="com.mongodb.MongoClient" %>

<%@ page import = "org.bson.Document" %>
<%@ page import = "com.mongodb.BasicDBObject" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

 <%! com.mongodb.MongoClient m ; %>
<%
	try{
	 m =  CollegeMongoDB.INSTANCE.getReference();
    System.out.println(m.getDatabase("d2").getCollection("c2").count());

	}
  
catch(Exception e){
	
	 System.out.println("TestDatabaseConnectivity.jsp exception executed");

 	  System.out.println(" Exception gets executed in Login user  method");
 	  e.getCause();
 	  System.out.println(" getMessage() ---------------------------------------------");

 	System.out.println(  e.getMessage());
 	  System.out.println(" Class()---------------------------------------------");

 	System.out.println(  e.getClass());
 	  System.out.println(" getStackTrace()---------------------------------------------");

 	System.out.println( ( e.getStackTrace().toString()));
 	  System.out.println(" ---------------------------------------------()");

 	  System.out.println(" getPrintStackTrace()---------------------------------------------");
 	  e.printStackTrace();
	
 	  System.out.println(" ---------------------------------------------");

	
}
finally{
	  
	  try{ m.close(); } catch(Exception e) { }


}
%>
</body>
</html>