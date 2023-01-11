package com.xworkz.winter.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor {
	private String name;
	private String langauge;
	private Integer age;

	public Actor(@Value("Sudeep") String name, @Value("Kannada") String langauge, @Value("36") Integer age) {
		super();
		this.name = name;
		this.langauge = langauge;
		this.age = age;
	}

	public String getName() {
		this.name = name;
		return name;
	}

	public String getLangauge() {
		this.langauge = langauge;
		return langauge;
	}

	public Integer getAge() {
		this.age = age;
		return age;
	}

}
