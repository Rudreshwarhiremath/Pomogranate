package com.xworkz.mandir;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/kamali")
public class Different extends HttpServlet {
	public Different() {
		System.out.println("created different constructer");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Get from different");
		String data = "Vinodha";
		PrintWriter writter = resp.getWriter();
		writter.print(data);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Post from different");
		String data = "Maddurvade";
		PrintWriter writter = resp.getWriter();
		writter.print(data);
		resp.setContentType("text/plain");

	}

	@Override
	protected void doTrace(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("Trace from different");

	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Delete from different");
		String data = "Manikya";
		PrintWriter writter = resp.getWriter();
		writter.print(data);
		resp.setContentType("text/plain");

	}

	@Override
	protected void doHead(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("created head in different");
	}

	@Override
	protected void doOptions(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("created Options in different");
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Delete from different");
		String data = "Vikranta Rona";
		PrintWriter writter = resp.getWriter();
		writter.print(data);
		resp.setContentType("text/plain");
	}

}
