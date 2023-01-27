package com.xworkz.application;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/location")
public class LocationServelet extends HttpServlet {
	public LocationServelet() {
		System.out.println("created location");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("created dopost and servicing it");
		String name = req.getParameter("locationName");
		String email = req.getParameter("userEmail");
		String start = req.getParameter("startPoint");
		String end = req.getParameter("destination");
		String gender = req.getParameter("gender");

		System.out.println(name);
		System.out.println(email);
		System.out.println(start);
		System.out.println(end);
		System.out.println(gender);

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body align=\"center\">");
		writer.print("<h1>");
		if (name.length() > 3 && email.length() > 3 && start.length() > 3 && end.length() > 3) {
			writer.print("<span style='color:green'>");
			writer.print("Sign up sucessfully");
			writer.print("</span>");
		} else {
			writer.print("<span style='color:red'>");
			writer.print("Plese insert valide information");
			writer.print("</span>");
		}

		writer.print("</h1>");
		writer.print("<a href=\"index.html\">home page</a>");
		writer.print("<br>");
		writer.print("<a href=\"location.html\">sign in again</a>");
		writer.print("</body>");
		writer.print("</html>");

		resp.setContentType("text/html");

	}

}
