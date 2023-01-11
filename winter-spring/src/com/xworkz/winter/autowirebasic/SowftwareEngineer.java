package com.xworkz.winter.autowirebasic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SowftwareEngineer {
	@Autowired
	@Qualifier("nameOfSoftwareEngineer")
	private String name;
	@Autowired
	private long salary;
	@Autowired
	private String companyName;
	@Autowired
	private int expirence;

	@Override
	public String toString() {
		return "SowftwareEngineer [name=" + name + ", salary=" + salary + ", companyName=" + companyName
				+ ", expirence=" + expirence + "]";
	}

}
