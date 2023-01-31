package com.xworkz.jspdemo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/show")
public class Jspdemoservalet extends HttpServlet {

	public Jspdemoservalet() {
		System.out.println("created "+this.getClass().getSimpleName());
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String gender = req.getParameter("gender");
		String address = req.getParameter("address");
		String reason = req.getParameter("reason");
	

		System.out.println(fname);
		System.out.println(lname);
		System.out.println(gender);
		System.out.println(address);
		System.out.println(reason);

		RequestDispatcher dispatcher = req.getRequestDispatcher("display.jsp");
		req.setAttribute("fname", fname);
		req.setAttribute("lname", lname);
		req.setAttribute("gender", gender);
		req.setAttribute("address", address);
		req.setAttribute("reason", reason);
		dispatcher.forward(req, resp);
	}
	
	

}
