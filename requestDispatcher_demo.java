package com.Amizone;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginPage
 */
@WebServlet("/login")
public class LoginPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub		
    
	PrintWriter out = response.getWriter();
	String userId = (String)request.getParameter("user");
	String pwd = (String)request.getParameter("pwd");

	request.setAttribute("name", "Virat Kohli");
    
	if(userId.equals("Mahi7781") && pwd.equals("183")) {
    RequestDispatcher rd = request.getRequestDispatcher("/profile.jsp");
		rd.forward(request, response);
	} else {
		response.setContentType("text/html");
		out.println("Bhai password galat hai");
		RequestDispatcher rd = request.getRequestDispatcher("/NewFile.html");
		rd.include(request, response);
	}
	}
}
