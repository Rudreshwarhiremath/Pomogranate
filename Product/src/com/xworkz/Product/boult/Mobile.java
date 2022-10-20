package com.xworkz.Product.boult;

import com.xworkz.Product.constants.compnay;

public class Mobile {
	public String brand="Note 10pro";
	public long price=15999L;
	public  compnay name=compnay.SAMSUNG ;
	
	public Mobile() {
		
	}
	
	public Mobile(String brand,long price,compnay name) {
		this.brand=brand;
		this.price=price;
		this.name=name;
		
	}
	public Mobile(long price,String brand,compnay name) {
		this.brand=brand;
		this.price=price;
		this.name=name;
	}
	public void reading() {
		System.out.println(brand);
		System.out.println(price);
		System.out.println(name);
	}
		

}
