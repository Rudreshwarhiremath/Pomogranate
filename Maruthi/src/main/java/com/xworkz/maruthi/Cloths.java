package com.xworkz.maruthi;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 7,urlPatterns = "/cloths")
public class Cloths extends HttpServlet {

	public Cloths() {
		System.out.println("created cloths");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("got cloths by doget");
	}

}
