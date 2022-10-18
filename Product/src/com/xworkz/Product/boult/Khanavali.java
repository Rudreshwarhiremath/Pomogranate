package com.xworkz.Product.boult;

public class Khanavali {
	public String name = "SRG";
	public String ownername = "Raghu";
	public int workers = 2;
	public int tables = 6;
	public long number = 888888888L;
	public String[] meals = { "Roti/chapati", "Palya1", "palya2", "Rice", "Sambar" };
	public String[] tiffin = { "Idli", "Vada", "dosa", "Puri" };
	public String[] workersName = { "Sangy", "balya" };
	public String[] RotiTypes = { "JoladRotti", "SajjiRoti", "AkkiRotti" };
	public String[] specialmeals = { "Holige", "jamun", "Sabudana", "Parota" };
	public int[] earning = { 4000, 5000, 4500, 5500, 6000 };

	public Khanavali() {
		super();
	}

	public void reading() {
		System.out.println(name);
		System.out.println(ownername);
		System.out.println(workers);
		System.out.println(tables);
		System.out.println(number);
		for (int i = 0; i < meals.length; i++) {
			System.out.println("meals" + meals[i]);
		}
		for (int i = 0; i < tiffin.length; i++) {
			System.out.println("Names" + tiffin[i]);
		}
		for (int i = 0; i < workersName.length; i++) {
			System.out.println("workersName" + workersName[i]);
		}
		for (int i = 0; i < RotiTypes.length; i++) {
			System.out.println("RotiTypes" + RotiTypes[i]);
		}
		for (int i = 0; i < specialmeals.length; i++) {
			System.out.println("specialmeals" + specialmeals[i]);
		}
		for (int i = 0; i < earning.length; i++) {
			System.out.println("Earning" + earning[i]);
		}
	}

}
