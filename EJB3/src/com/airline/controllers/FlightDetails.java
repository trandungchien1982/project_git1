package com.airline.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import app.airline.service.FlightService;
import java.com.vn;

/**
 * Servlet implementation class FlightDetails
 */
@WebServlet("/flightDetails")
public class FlightDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	FlightService fs;

	@EJB
	FlightService fs1;

	@EJB
	FlightService fs2;

	@EJB
	FlightService fs3;

	@EJB
	FlightService fs4;

	@EJB
	FlightService fs5;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FlightDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("Flight Model : " + fs.getAirplanModel() + new Date() + " >> chien day ne : ");
		
		out.println("fs0 : " + fs.hashCode());
		out.println("fs1 : " + fs1.hashCode());
		out.println("fs2 : " + fs2.hashCode());
		out.println("fs3 : " + fs3.hashCode());
		out.println("fs4 : " + fs4.hashCode());
		out.println("fs5 : " + fs5.hashCode());
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
