package com.xworkz.maruthi;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet(loadOnStartup = 8,urlPatterns = "/presention")
public class Presenting extends HttpServlet {

	public Presenting() {
		System.out.println("Created Presenting");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("got Presenting by doget");
	}

}
