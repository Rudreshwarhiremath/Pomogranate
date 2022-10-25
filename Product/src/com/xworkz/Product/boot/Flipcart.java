package com.xworkz.Product.boot;

import com.xworkz.Product.constants.Electronics;
import com.xworkz.Product.constants.Mobiles;

public class Flipcart {
	public String name = "flipcart";
	public Mobiles mobiles = Mobiles.REDMI;
	public Electronics electronics = Electronics.WATCHES;
	public String appliances = "Fridge";
	public String fashion = "men/women";
	public String grocery = "kirana/vegitables";

	public Flipcart() {
		super();

	}

	public Flipcart(Mobiles mobiles, Electronics electronics, String appliances, String fashion, String grocery) {
		this.mobiles = mobiles;
		this.electronics = electronics;
		this.appliances = appliances;
		this.fashion = fashion;
		this.grocery = grocery;
	}

	public void perform() {
		System.out.println(name);
		System.out.println(mobiles.types);
		System.out.println(electronics.brand);
		System.out.println(electronics.cost);
		System.out.println(appliances);
		System.out.println(fashion);
		System.out.println(grocery);
	}

}
