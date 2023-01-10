package com.xworkz.winter.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Season {
	private String name;
	private Double duration;
	private String startingMonth;

	public Season() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	@Value("winter")
	public void setName(String name) {
		this.name = name;
	}

	public Double getDuration() {
		return duration;
	}

	@Value("4")
	public void setDuration(Double duration) {
		this.duration = duration;
	}

	public String getStartingMonth() {
		return startingMonth;
	}

	@Value("November")
	public void setStartingMonth(String startingMonth) {
		this.startingMonth = startingMonth;
	}

}
