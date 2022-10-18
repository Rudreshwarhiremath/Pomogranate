package com.xworkz.Product.boultRunner;

import com.xworkz.Product.boult.MilkParlour;

public class MilkParlourRunner {

	public static void main(String[] args) {
		 String[] milkProduct= {"Milk","curd","buttermilk","ghee","butter"};
		 String[] available= {"milk","curd"};
		 String[] Sweets= {"peda","kalakan","Khava"};
		 String[] Snacks= {"samosa","vadapav"};
		 int[] rates= {11,22,44,66,10,};
		 String[] colditeams= {"BadamMilk","Curd","butterMilk"};
		 MilkParlour milk=new MilkParlour("Pranava", "Nandini", 505, "bestquality", 1, milkProduct, available, Sweets, Snacks, rates, colditeams);
		 milk.reading();

	}

}
