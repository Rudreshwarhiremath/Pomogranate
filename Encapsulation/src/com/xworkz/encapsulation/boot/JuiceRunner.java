package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.things.Jet;
import com.xworkz.encapsulation.things.Juice;

public class JuiceRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Juice java=new Juice();
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
		Jet jack=new Jet();
		jack.show();
		

	}

}
