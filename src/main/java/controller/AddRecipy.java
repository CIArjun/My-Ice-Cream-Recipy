package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.UserService;

public class AddRecipy extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String recipy = request.getParameter("recipy");
		 String rname = request.getParameter("rname");
		  response.setContentType("text/html");
		  PrintWriter out = response.getWriter();
		
                  String  result = new UserService().addRecipies(rname,recipy);
	           request.setAttribute("result", result);
		   	  
	        RequestDispatcher rd = request.getRequestDispatcher("/addrecipy.jsp");
				    rd.forward(request, response);
	}	  
}
