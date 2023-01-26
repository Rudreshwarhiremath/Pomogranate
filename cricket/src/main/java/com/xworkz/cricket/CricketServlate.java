package com.xworkz.cricket;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 3, urlPatterns = "/cricket")
public class CricketServlate extends HttpServlet {
	public CricketServlate() {
		System.out.println("created " + getClass().getSimpleName());
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("created doget in cricket");
		String team = req.getParameter("team");
		String teamCaptianName = req.getParameter("captian");
		String teamType = req.getParameter("type");
		String totalPlayers = req.getParameter("players");
		String teamCoach = req.getParameter("coach");
		String teamMenter = req.getParameter("menter");
		String teamBatsman = req.getParameter("batsman");
		String teamSpeedBowler = req.getParameter("speedBowler");
		String teamSpinerBowler = req.getParameter("spiner");
		String teamKeeper = req.getParameter("keeper");
		String teamAllRounderSpeedbowler = req.getParameter("allrounderSpeed");
		String teamAllRounderSpiner = req.getParameter("allrounderSpiner");
		String CaptianCentures = req.getParameter("centures");
		String CaptianHalfCentures = req.getParameter("50S");
		String CaptianT20Runs = req.getParameter("T20");
		String CaptianTestRuns = req.getParameter("Test");
		String CaptianOdiRuns = req.getParameter("Odi");
		String CaptianStrickRate = req.getParameter("SR");
		String TeamJercyColor = req.getParameter("jercy");
		String CaptianJercyno = req.getParameter("jercyNo");

		System.out.println(team);
		System.out.println(teamCaptianName);
		System.out.println(teamType);
		System.out.println(totalPlayers);
		System.out.println(teamCoach);
		System.out.println(teamMenter);
		System.out.println(teamBatsman);
		System.out.println(teamSpeedBowler);
		System.out.println(teamSpinerBowler);
		System.out.println(teamKeeper);
		System.out.println(teamAllRounderSpeedbowler);
		System.out.println(teamAllRounderSpiner);
		System.out.println(CaptianCentures);
		System.out.println(CaptianHalfCentures);
		System.out.println(CaptianT20Runs);
		System.out.println(CaptianTestRuns);
		System.out.println(CaptianOdiRuns);
		System.out.println(CaptianStrickRate);
		System.out.println(TeamJercyColor);
		System.out.println(CaptianJercyno);

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("Details of team");
		writer.print("</h1>");
		writer.print("<h3>");
		writer.print("<span style='color:red'>");
		writer.print("cricket team name-> " + team);
		writer.print("<br>");
		writer.print("</span>");
		writer.print("<span style='color:blue'>");
		writer.print("cricket teamCaptianName-> " + teamCaptianName);
		writer.print("<br>");
		writer.print("</span>");
		writer.print("<span style='color:darkblue'>");
		writer.print("cricket teamType-> " + teamType);
		writer.print("<br>");
		writer.print("</span>");
		writer.print("<span style='color:orange'>");
		writer.print("cricket totalPlayers -> " + totalPlayers);
		writer.print("<br>");
		writer.print("</span>");
		writer.print("<span style='color:skyblue'>");
		writer.print("cricket teamCoach -> " + teamCoach);
		writer.print("<br>");
		writer.print("</span>");
		writer.print("<span style='color:purpple'>");
		writer.print("cricket teamMenter -> " + teamMenter);
		writer.print("<br>");
		writer.print("</span>");
		writer.print("<span style='color:pink'>");
		writer.print("cricket teamBatsman -> " + teamBatsman);
		writer.print("<br>");
		writer.print("</span>");
		writer.print("<span style='color:red'>");
		writer.print("cricket teamSpeedBowler -> " + teamSpeedBowler);
		writer.print("<br>");
		writer.print("</span>");
		writer.print("<span style='color:greay'>");
		writer.print("cricket teamSpinerBowler -> " + teamSpinerBowler);
		writer.print("<br>");
		writer.print("</span>");
		writer.print("<span style='color:violet'>");
		writer.print("cricket teamKeeper -> " + teamKeeper);
		writer.print("<br>");
		writer.print("</span>");
		writer.print("<span style='color:black'>");
		writer.print("cricket teamAllRounderSpeedbowler -> " + teamAllRounderSpeedbowler);
		writer.print("<br>");
		writer.print("</span>");
		writer.print("<span style='color:orange'>");
		writer.print("cricket teamAllRounderSpiner -> " + teamAllRounderSpiner);
		writer.print("<br>");
		writer.print("</span>");
		writer.print("<span style='color:parrotgreen'>");
		writer.print("cricket CaptianCentures -> " + CaptianCentures);
		writer.print("<br>");
		writer.print("</span>");
		writer.print("<span style='color:red'>");
		writer.print("cricket CaptianHalfCentures -> " + CaptianHalfCentures);
		writer.print("<br>");
		writer.print("</span>");
		writer.print("<span style='color:green'>");
		writer.print("cricket CaptianT20Runs -> " + CaptianT20Runs);
		writer.print("<br>");
		writer.print("</span>");
		writer.print("<span style='color:darkgreen'>");
		writer.print("cricket CaptianTestRuns -> " + CaptianTestRuns);
		writer.print("<br>");
		writer.print("</span>");
		writer.print("<span style='color:red'>");
		writer.print("cricket CaptianOdiRuns -> " + CaptianOdiRuns);
		writer.print("<br>");
		writer.print("</span>");
		writer.print("<span style='color:pink'>");
		writer.print("cricket CaptianStrickRate -> " + CaptianStrickRate);
		writer.print("<br>");
		writer.print("</span>");
		writer.print("<span style='color:black'>");
		writer.print("cricket TeamJercyColor -> " + TeamJercyColor);
		writer.print("<br>");
		writer.print("</span>");
		writer.print("<span style='color:darkblue'>");
		writer.print("cricket CaptianJercyno -> " + CaptianJercyno);
		writer.print("<br>");
		writer.print("</span>");
		writer.print("</h3>");
		writer.print("</body>");
		writer.print("</html>");

		resp.setContentType("text/html");

	}

}
