package com.xworkz.Product.things;

import com.xworkz.Product.boot.Flipcart;
import com.xworkz.Product.constants.Electronics;
import com.xworkz.Product.constants.Mobiles;

public class FlipcartRunner {

	public static void main(String[] args) {
		Flipcart flip = new Flipcart();
		flip.perform();
		Flipcart cart = new Flipcart(Mobiles.REALME, Electronics.SOUND, "Washing machine", "Clothes", "Kirana iteams");
		cart.perform();

	}

}
