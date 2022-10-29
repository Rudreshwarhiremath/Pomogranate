package com.xworkz.Association.things;

import com.xworkz.Association.Constants.Gender;

public class President {
	public String name;
	public int tenure;
	public Gender gender;
	public President(String name) {
		super();
		this.name = name;
		
	}
	public void setName(String name) {
		this.name=name;
		}
	public void setTenure(int tenure) {
		this.tenure=tenure;
	}
	public void setGender(Gender gender) {
		this.gender=gender;
	}
	public void show() {
		System.out.println(this.name);
		System.out.println(this.tenure);
		if(gender!=null) {
			System.out.println(gender);
		}
		else {
			System.out.println("Gender is null");
		}
	}

}
