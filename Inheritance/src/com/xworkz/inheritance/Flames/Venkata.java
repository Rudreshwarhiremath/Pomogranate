package com.xworkz.inheritance.Flames;

public class Venkata extends PetrolBunk {
	public double total;

	public Venkata(double petrolRate, double diseleRate,double total) {
		super(105.50, 88.25);
        this.total=total;
	}
	public void HP() {
		super.HP();
		double totalpricep=petrolRate*total;
		double totalpriced=diseleRate*total;
		System.out.println(total);
		System.out.println("Total price of petrol:"+totalpricep);
		System.out.println("Total price of Disele:"+totalpriced);
	}

}
