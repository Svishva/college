package com.app.model.controller;

/**
 * Controls where to redirect when user sends Http requests.
 * 
 * This class extends HttpServlet and all Http methods
 * are caught here and redirected to respected fuctions (like create, update, delete)
 * Ex: deletestudent form-doPost  redirect to   Student DAO implementation deleteStudent()
 * 
 * 
 * @author visweshwaran
 * 
 */

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet(urlPatterns = { "/Controller" })
public class Controller extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
   

	

	/**
	 * All user Get Request are caught here and are directed to respected Resources
	 * 
	 * 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 * 
	 * User Form submissions are caught here.
	 * It re-directs to respected DAO implemented functions
	 * 
	 * This will not check any logic on data given by user.
	 * Logic is checked on their corresponding functions and
	 * that function redirects to error or success pages
	 *  
	 * 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
