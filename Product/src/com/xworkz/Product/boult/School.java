package com.xworkz.Product.boult;

public class School {
	public String name;
	public String location;
	public int branchs;
	public String Medium;
	public int staffs;
	public String[] classes;
	public String[] sports;
	public String[] activites;
	public String[] buses;
	public String[] Teachers;

	public School(String name, String location, int branchs, String Medium, int staffs, String[] classes,
			String[] sports, String[] activites, String[] buses, String[] Teachers) {
		this.name = name;
		this.location = location;
		this.branchs = branchs;
		this.Medium = Medium;
		this.staffs = staffs;
		this.classes = classes;
		this.sports = sports;
		this.activites = activites;
		this.buses = buses;
		this.Teachers = Teachers;

	}

	public void reading() {
		System.out.println(name);
		System.out.println(location);
		System.out.println(branchs);
		System.out.println(Medium);
		System.out.println(staffs);
		for (int i = 0; i < classes.length; i++) {
			System.out.println("classes:" + classes[i]);
		}
		for (int i = 0; i < sports.length; i++) {
			System.out.println(" sports:" + sports[i]);
		}
		for (int i = 0; i < activites.length; i++) {
			System.out.println("activites:" + activites[i]);
		}
		for (int i = 0; i < buses.length; i++) {
			System.out.println("buses:" + buses[i]);
		}
		for (int i = 0; i < Teachers.length; i++) {
			System.out.println("Teachers:" + Teachers[i]);
		}

	}

}
