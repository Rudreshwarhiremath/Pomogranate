package com.xworkz.winter.thing.vastugalu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	private String name;
	private String type;
	@Autowired
	private String number;
	@Autowired
	private String version;
	private String company;
	private int strokes;

	public Engine(@Qualifier("nameOfEngine") String name, @Qualifier("typeOfEngine") String type, String company) {
		super();
		this.name = name;
		this.type = type;
		this.company = company;
	}

	@Override
	public String toString() {
		return "Engine [name=" + name + ", type=" + type + ", number=" + number + ", version=" + version + ", company="
				+ company + ", strokes=" + strokes + "]";
	}

	@Autowired
	public void setStrokes(int strokes) {
		this.strokes = strokes;
	}

}
