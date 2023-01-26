package com.xworkz.webseries;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = "/series")
public class WebseriesServalet extends HttpServlet {

	public WebseriesServalet() {
		System.out.println("created web series");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running in doget method");
		String name = req.getParameter("webname");
		String laungauge = req.getParameter("Laguage");
		String episodes = req.getParameter("episodes");
		String ott = req.getParameter("ott");
		String budget = req.getParameter("budget");

		System.out.println(name);
		System.out.println(laungauge);
		System.out.println(episodes);
		System.out.println(ott);
		System.out.println(budget);

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:orange'>");
		writer.print("web series name " + name );
		writer.print("<br>");
		writer.print(laungauge);
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("<h2>");
		writer.print("<span style='color:yellow'>");
		writer.print("web series laungauge " + laungauge);
		writer.print("</span>");
		writer.print("</h2>");
		writer.print("<h2>");
		writer.print("<span style='color:blue'>");
		writer.print("web series episodes " + episodes);
		writer.print("</span>");
		writer.print("</h2>");
		writer.print("<h2>");
		writer.print("<span style='color:black'>");
		writer.print("web series ott " + ott);
		writer.print("</span>");
		writer.print("</h2>");
		writer.print("<h2>");
		writer.print("<span style='color:green'>");
		writer.print("web series budget " + budget);
		writer.print("</span>");
		writer.print("</h2>");
		writer.print("</body>");
		writer.print("</html>");

		resp.setContentType("text/html");

	}

}
