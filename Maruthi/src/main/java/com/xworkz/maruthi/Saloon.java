package com.xworkz.maruthi;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 9, urlPatterns = "/cutting")
public class Saloon extends HttpServlet {
	public Saloon() {
		System.out.println("created saloon");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("got saloon by doget");
	}

}
