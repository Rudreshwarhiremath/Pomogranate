package com.xworkz.Product.boot;

import com.xworkz.Product.constants.Appliances;
import com.xworkz.Product.constants.Fashion;

public class Amezon {
	public String name="AMEZON";
	public String mobiles="Micromax";
	public String electronics="Sound Speakers";
	public Appliances appliances=Appliances.FRIDGE;
	public Fashion fashion=Fashion.WOMEN;
	public String grocery="Fresh";
	public Amezon() {
		super();
		
	}

	public Amezon(String mobiles, String electronics, Appliances appliances, Fashion fashion,String grocery) {
		this.mobiles=mobiles;
		this.electronics=electronics;
		this.appliances=appliances;
		this.fashion=fashion;
		this.grocery=grocery;
	}
	public void perform() {
		System.out.println(name);
		System.out.println(mobiles);
		System.out.println(electronics);
		System.out.println(appliances.brand);
		System.out.println(appliances.price);
		System.out.println(fashion.type);
		System.out.println(fashion.size);
		System.out.println(fashion.price);
		System.out.println(grocery);
	}

}
