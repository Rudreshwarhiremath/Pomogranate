package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.things.Oil;
import com.xworkz.encapsulation.things.Oilpack;

public class OilRunner {

	public static void main(String[] args) {
		Oil pack=new Oil();
		Oilpack set=new Oilpack();
		System.out.println(pack.getRate());
		System.out.println(pack.getLiters());
		System.out.println(pack.getType());
		System.out.println(pack.getName());
		System.out.println(pack.getBrand());
		System.out.println(pack.getPacktype());
		System.out.println(pack.getLocation());
		System.out.println(pack.getOwner());
		System.out.println(pack.getLaburs());
		System.out.println(pack.isNice());
		System.out.println(pack.isTeaste());
		set.show();
		

	}

}
