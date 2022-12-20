package com.xworkz.javacollection.boot;

import java.util.Collection;
import java.util.TreeSet;

public class CoupnesRunner {

	public static void main(String[] args) {
		String coupne1="Flipcart";
		String coupne2="Amezon";
		String coupne3="Dmart";
		String coupne4="Trends";
		String coupne5="Flipcart";
		String coupne6="zometo";
		String coupne7="swiggy";
		String coupne8="paytum";
		String coupne9="recharge";
		String coupne10="mesho";
		String coupne11="zipto";
		String coupne12="ecommerce";
		
		Collection<String>collection=new TreeSet<String>();
		collection.add(coupne1);
		collection.add(coupne2);
		collection.add(coupne3);
		collection.add(coupne4);
		collection.add(coupne5);
		collection.add(coupne6);
		collection.add(coupne7);
		collection.add(coupne8);
		collection.add(coupne9);
		collection.add(coupne10);
		collection.add(coupne11);
		collection.add(coupne12);
		System.out.println("Size befor clearing coupne-"+collection.size());
		collection.clear();
		System.out.println("Size after clearing coupne-"+collection.size());
	
	}

}
