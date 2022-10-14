package com.xworkz.TeaTime.CostalRunner;

import com.xworkz.TeaTime.Costal.Bread;

public class BreadRunner {

	public static void main(String[] args) {
		Bread bread = new Bread(100, 200.45);
		System.out.println(bread.price);
		System.out.println(bread.quantity);
		Bread bread2 = new Bread("wariyar", 400);
		System.out.println(bread2.companyname);
		System.out.println(bread2.quantity);
		Bread bread3 = new Bread("Round", 120);
		System.out.println(bread3.shape);
		System.out.println(bread3.price);
		Bread bread4 = new Bread("Cream", "Squre");
		System.out.println(bread4.type);
		System.out.println(bread4.shape);
		Bread bread5 = new Bread("cripsy", "oval", 550);
		System.out.println(bread5.type);
		System.out.println(bread5.shape);
		System.out.println(bread5.price);
		Bread bread6 = new Bread("cold", "Rectangale", "OGwarirer");
		System.out.println(bread6.type);
		System.out.println(bread6.shape);
		System.out.println(bread6.companyname);
		Bread bread7 = new Bread("milk", "Round", 600, 250);
		System.out.println(bread7.type);
		System.out.println(bread7.shape);
		System.out.println(bread7.price);
		System.out.println(bread7.quantity);
		Bread bread8 = new Bread("Normal", "Round", 450, 250, "Ayynger");
		System.out.println(bread8.type);
		System.out.println(bread8.shape);
		System.out.println(bread8.price);
		System.out.println(bread8.quantity);
		System.out.println(bread8.companyname);

	}

}
