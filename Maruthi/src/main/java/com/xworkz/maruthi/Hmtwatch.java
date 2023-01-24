package com.xworkz.maruthi;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 5, urlPatterns = "/watch")
public class Hmtwatch extends HttpServlet {

	public Hmtwatch() {
		System.out.println("Created watch");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("got Hmt Branded watch by doget method");
	}
}
