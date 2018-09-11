package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AnswerServlet extends HttpServlet{

	@Override
	public void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Answer doGet");
		String answer = (String) request.getAttribute("answer");
		PrintWriter pw = response.getWriter();
		pw.write(answer);
		pw.write("<p> <a href=\"Calculator.html\">Calculate Again</a></p>");
	}
	
	@Override
	public void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Answer doPost");
		doGet(request, response);
	}
}
