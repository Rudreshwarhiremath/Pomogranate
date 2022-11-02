package com.xworkz.encapsulation.things;

public class Jet {
	Juice java=new Juice();
	public void show() {
	java.setName("Apple");
	java.setConten("more things");
	java.setRate (100);
	java.setQuantity (200);
	java.setGlass (5);
	java.setTypes (2);
	java.setIce ("Ice");
	java.setSugur ("Sugurless");
	java.setMilk ("fullMilk");
	java. setMixer("Jar");
	java.setTotal ("1000");
	java.setLiked (true);
	java.setTeaste (false);
	System.out.println(java.getName());
	System.out.println(java.getConten());
	System.out.println(java.getRate());
	System.out.println(java.getQuantity());
	System.out.println(java.getGlass());
	System.out.println(java.getTypes());
	System.out.println(java.getIce());
	System.out.println(java.getSugur());
	System.out.println(java.getMilk());
	System.out.println(java.getMixer());
	System.out.println(java.getTotal());
	System.out.println(java.isLiked());
	System.out.println(java.isTeaste());
	}

}
