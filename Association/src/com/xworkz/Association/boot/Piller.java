package com.xworkz.Association.boot;

import com.xworkz.Association.Constants.Shape;

public class Piller {
	public int id;
	public String place;
	public Shape shape = Shape.DRAPED;
	public double height;
	public String supporting;
	public Company company;

	public Piller(int id, String place, double height, String supporting) {
		super();
		this.id = id;
		this.place = place;
		this.height = height;
		this.supporting = supporting;
	}

	public void reading() {
		System.out.println(id);
		System.out.println(place);
		System.out.println(shape);
		System.out.println(height);
		System.out.println(supporting);
		Company compnay = new Company("L&T", "MultiType&MNC");
		compnay.show();
	}

}
