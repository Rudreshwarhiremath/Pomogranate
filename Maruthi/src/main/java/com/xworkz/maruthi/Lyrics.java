package com.xworkz.maruthi;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 4, urlPatterns = "/lyric")
public class Lyrics extends HttpServlet {
	public Lyrics() {
		System.out.println("created Lyrics");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("got lyrics by doget");
	}

}
