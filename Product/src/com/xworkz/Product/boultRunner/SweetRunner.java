package com.xworkz.Product.boultRunner;

import com.xworkz.Product.boult.Sweet;

public class SweetRunner {
	public static void main(String[] args) {
		Sweet sweet1=new Sweet("Kaju burfi");
		sweet1.quantity=1.25;
		sweet1.setPrice(120);
		sweet1.reading();
	}

}
