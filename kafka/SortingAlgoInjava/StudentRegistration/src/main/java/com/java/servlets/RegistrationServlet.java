package com.java.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.model.Student;

public class RegistrationServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<Student> students= new ArrayList<>();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String course=request.getParameter("course");
		
		Student student= new Student(name, email, course);
		student.setName(name);
		student.setEmail(email);
		student.setCourse(course);
		
		response.sendRedirect("Registration.jsp");
		
	}
	

}
