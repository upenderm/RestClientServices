package com.c4networks.clientservice;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreateEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CreateEmployeeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("****In CreateEmployeeServlet.doPost **********");
		RestClientFacade client = new RestClientFacade();
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().write("<br>");
		response.getWriter()
				.write("\n\n" + client.createEmployee(request.getParameter("empId"), request.getParameter("empName"),
						request.getParameter("address"), request.getParameter("email"),
						request.getParameter("mobile")));

	}

}
