package com.xworkz.application;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2, urlPatterns = "/contact")
public class ContactServelet extends HttpServlet {
	public ContactServelet() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("created dopost and servicing it");
		String name = req.getParameter("userName");
		String email = req.getParameter("email");
		String number = req.getParameter("number");
		String commet = req.getParameter("comments");
		//Long mobile = Long.parseLong(number);

		System.out.println(name);
		System.out.println(email);
		System.out.println(number);
		System.out.println(commet);

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body align=\"center\">");
		writer.print("<h1>");
		if (name.length() > 3 && email.length() > 3 && number.length() == 10 && commet.length() > 3) {
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
		writer.print("<a href=\"contact.html\">sign in again</a>");
		writer.print("</body>");
		writer.print("</html>");

		resp.setContentType("text/html");

	}
}
