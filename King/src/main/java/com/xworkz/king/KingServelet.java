package com.xworkz.king;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2, urlPatterns = "/king")
public class KingServelet extends HttpServlet {
	public KingServelet() {
		System.out.println("created" + getClass().getSimpleName());
	}

	@Override
	public void init() throws ServletException {
		System.out.println("created and started init");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("created and started doget in king");
		String name = req.getParameter("kingName");
		String region = req.getParameter("region");
		String queens = req.getParameter("queens");
		String birth = req.getParameter("birth");
		String death = req.getParameter("death");

		System.out.println(name);
		System.out.println(region);
		System.out.println(queens);
		System.out.println(birth);
		System.out.println(death);

		PrintWriter write = resp.getWriter();
		write.print("<html>");
		write.print("<body>");
		write.print("<h1>");
		write.print("<span style='color:orange'>");
		write.print("King name " + name);
		write.print("<br>");
		write.print("</span>");
		write.print("<span style='color:green'>");
		write.print("King region " + region);
		write.print("<br>");
		write.print("</span>");
		write.print("<span style='color:blue'>");
		write.print("King no of queens " + queens);
		write.print("<br>");
		write.print("</span>");
		write.print("<span style='color:black'>");
		write.print("King birth date " + birth);
		write.print("<br>");
		write.print("</span>");
		write.print("<span style='color:pink'>");
		write.print("King death date " + death);
		write.print("</span>");
		write.print("</h1>");
		write.print("</body>");
		write.print("</html>");

		resp.setContentType("text/html");

	}

}
