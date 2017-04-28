package com.jeegroupproject.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jeegroupproject.beans.Employee;
import com.jeegroupproject.beans.User;
/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String VIEW = "/WEB-INF/restricted/main.jsp";
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		
		Employee employee = Employee.getClientByAccount_id(account_id);
		request.setAttribute("employee", employee);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
