package com.xworkz.Product.things;

import com.xworkz.Product.boot.Amezon;
import com.xworkz.Product.constants.Appliances;
import com.xworkz.Product.constants.Fashion;

public class AmezonRunner {

	public static void main(String[] args) {
		Amezon flip = new Amezon();
		flip.perform();
		Amezon cart = new Amezon("Samsung", "Desktop", Appliances.FRIDGE, Fashion.BAGS, "Kirana iteams");
		cart.perform();

	}

}
