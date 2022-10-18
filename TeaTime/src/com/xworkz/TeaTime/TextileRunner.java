package com.xworkz.TeaTime.KalburgiRunner;

import com.xworkz.TeaTime.Kalburgi.Textile;

public class TextileRunner {

	public static void main(String[] args) {
		Textile textile = new Textile();
		System.out.println(textile.shopName);
		System.out.println(textile.ownerName);
		System.out.println(textile.mobileNo);
		System.out.println(textile.location);
		System.out.println(textile.childrens);
		System.out.println(textile.shopColour);
		System.out.println(textile.area);

		Textile textile2 = new Textile("Stylesh", "Ravi");
		System.out.println(textile2.shopName);
		System.out.println(textile2.ownerName);
		Textile textile3 = new Textile(4, "green");
		System.out.println(textile3.childrens);
		System.out.println(textile3.shopColour);
		Textile textile4 = new Textile(2222255555L, "RajajiNagar");
		System.out.println(textile4.mobileNo);
		System.out.println(textile4.location);
		Textile textile5 = new Textile("Chamundi");
		System.out.println(textile5.shopName);
		Textile textile6 = new Textile(8888899999L);
		System.out.println(textile6.mobileNo);
		Textile textile7 = new Textile(4);
		System.out.println(textile7.childrens);
		Textile textile8 = new Textile(555.545);
		System.out.println(textile8.area);
		Textile textile9 = new Textile("Patils", "Prashant", 0000000000L, "Vijaynagar", 0, "black", 600.52);
		System.out.println(textile9.shopName);
		System.out.println(textile9.ownerName);
		System.out.println(textile9.mobileNo);
		System.out.println(textile9.location);
		System.out.println(textile9.childrens);
		System.out.println(textile9.shopColour);
		System.out.println(textile9.area);

	}

}
