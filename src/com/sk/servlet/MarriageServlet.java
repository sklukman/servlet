package com.sk.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MarriageServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("MarriageServlet doGet() Method");
		String name = null, gender = null;
		int age = 0;
		PrintWriter pw = null;
		// get print writer
		pw = res.getWriter();
		// set response content type
		res.setContentType("text/html");
		// read form data
		name = req.getParameter("pname");
		gender = req.getParameter("gender");
		age = Integer.parseInt(req.getParameter("page"));
//write b. logic or request processing logic
		if (gender.equalsIgnoreCase("M")) {
			if (age >= 21) {
				pw.println("<h1 style='color;red;text-align:center'>Mr." + name + "You are elgible for marriage</h1>");
			} else
				pw.println(
						"<h1 style='color;red;text-align:center'>Mr." + name + "You are not elgible for marriage</h1>");
		} // if
		else if (gender.equalsIgnoreCase("F")) {

			if (age >= 18) {
				pw.println(
						"<h1 style='color;red;text-align:center'>Miss." + name + "You are elgible for marriage</h1>");
			} else
				pw.println("<h1 style='color;red;text-align:center'>Miss." + name
						+ "You are not elgible for marriage</h1>");

		} // else if
		else
			pw.println("<h1 style='color;red';text-align:center>Unknown Gender</h1>");
		// write logic for Date() b.logic
		pw.println("<h1 style='color:red ; text-align:center'>Date and Time:::" + new Date() + "</h1>");
//add graphical hyper link
		pw.println("<br><a href='input.html' ><img src='images/home.jpg' width='50' height='50'></a>");

	}// method

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("MarriageServlet doPost() Method");
		PrintWriter pw = null;
//get PrintWriter
		pw = res.getWriter();
//set content type
		res.setContentType("text/html");
		// write b.logic
		pw.println("<h1 style='color:red ; text-align:center'>Date and Time:::" + new Date() + "</h1>");
//add graphical hyper link
		pw.println("<br><a href='input.html' ><img src='images/home.jpg' width='50' height='50'></a>");
		// close stream
		pw.close();
	}// method

}// class
