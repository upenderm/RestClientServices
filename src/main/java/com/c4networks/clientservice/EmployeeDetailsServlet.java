package com.c4networks.clientservice;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeDetailsServlet
 */
public class EmployeeDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeDetailsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("*****In EmployeeDetailsServlet.doGet *********");
		RestClientFacade client = new RestClientFacade();
		response.getWriter().write(client.getEmployeeDetails(new Integer(request.getParameter("empId"))).toString());
		response.getWriter().append("<br/><br/>");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
