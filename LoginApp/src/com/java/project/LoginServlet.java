package com.java.project;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.project.dto.User;
import com.java.project.service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userid=request.getParameter("userId");
		String pass=request.getParameter("password");
		LoginService loginservice=new LoginService();
		boolean result=loginservice.authenticate(userid, pass);
		if(result){
			User user=loginservice.getUserDetails(userid);
			request.setAttribute("user", user);
			RequestDispatcher dispatcher=request.getRequestDispatcher("success.jsp");
			dispatcher.forward(request, response);
			//response.sendRedirect("success.jsp");
			return;
		}else
		{
			response.sendRedirect("login.jsp");
			return;
		}
	}

}
