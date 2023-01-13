package com.xworkz.cold.Vastugalu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {
	@Autowired
	private Director director;
	@Autowired
	private CameraMan cameraman;
	@Autowired
	private Producer producer;

	public Movie() {
		System.out.println("created movie");
	}

	public Director director() {
		return director;
	}

	public CameraMan cameraman() {
		return cameraman;
	}

	public Producer producer() {
		return producer;
	}

}
