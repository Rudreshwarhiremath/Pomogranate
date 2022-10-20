package com.xworkz.Product.boultRunner;

import com.xworkz.Product.boult.Mobile;
import com.xworkz.Product.constants.compnay;


public class MobileRunner {

	public static void main(String[] args) {
		Mobile mobile=new Mobile();
		mobile.reading();
		Mobile mobile1=new Mobile("11 TS",11450L,compnay.MI);
		mobile1.reading();
		Mobile mobile2=new Mobile(11999L,"Nortoz30",compnay.REALME);
		mobile2.reading();

	}

}
