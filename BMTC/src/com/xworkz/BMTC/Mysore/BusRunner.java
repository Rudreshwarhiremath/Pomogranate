package com.xworkz.BMTC.Mysore;

import com.xworkz.BMTC.banglore.Bus;

public class BusRunner {

	public static void main(String[] args) {
	Bus no=new Bus();
	System.out.println(no.number);
	Bus dest=new Bus();
	System.out.println(dest.Destination);
	Bus sorc=new Bus();
	System.out.println(sorc.Source);
	no.number=80;
	dest.Destination="kempe Gouda Busstand";
	sorc.Source="Basaveshwarnagar";
	System.out.println(no.number);
	System.out.println(dest.Destination);
	System.out.println(sorc.Source);

	}

}
