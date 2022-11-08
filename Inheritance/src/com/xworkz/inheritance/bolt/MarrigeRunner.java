package com.xworkz.inheritance.bolt;

import com.xworkz.inheritance.nut.ArrangeMarrige;
import com.xworkz.inheritance.nut.Marrige;

public class MarrigeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marrige marry=new Marrige("Arrange","Sweet Home" ,"20/11/2022");
		System.out.println(marry.type);
		System.out.println(marry.location);
		System.out.println(marry.date);
		ArrangeMarrige arrange=new ArrangeMarrige("Love marrige","Palace Ground","13/11/2022","o", "m");
		System.out.println(arrange.type);
		System.out.println(arrange.location);
		System.out.println(arrange.date);
		System.out.println(arrange.bride);
		System.out.println(arrange.groom);

	}

}
