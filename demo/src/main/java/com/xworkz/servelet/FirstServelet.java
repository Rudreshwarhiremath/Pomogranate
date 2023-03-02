package com.xworkz.servelet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/Call")
public class FirstServelet extends HttpServlet {

	public FirstServelet() {
		System.out.println("created in FirstServelet");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String ref1 = req.getParameter("name");
	String ref2 = req.getParameter("age");
	String ref3 = req.getParameter("mobileNo");

	System.out.println(ref1);
	System.out.println(ref2);
	System.out.println(ref3);

	}
	
}
