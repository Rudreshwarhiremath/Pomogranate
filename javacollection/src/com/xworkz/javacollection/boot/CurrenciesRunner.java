package com.xworkz.javacollection.boot;

import java.util.Collection;
import java.util.LinkedList;

public class CurrenciesRunner {

	public static void main(String[] args) {
		String curranci1 = "Ruppe";
		String curranci2 = "Dollar";
		String curranci3 = "pounds";
		String curranci4 = "euro";
		String curranci5 = "Australian Dollar";
		String curranci6 = "Canidian Dollar";
		String curranci7 = "dinar";
		String curranci8 = "franc";
		String curranci9 = "rand";
		String curranci10 = "singapore dollar";
		String curranci11 = "ruble";
		String curranci12 = "peso";
		String curranci13 = "yen";
		String curranci14 = "barmudian Dollar";
		String curranci15 = "nepalese rupee";
		String curranci16 = "dram";
		String curranci17 = "real";
		String curranci18 = "shiling";
		String curranci19 = "krone";
		String curranci20 = "rial";
		String curranci21 = "Brunie Dollar";
		String curranci22 = "dong";
		String curranci23 = "cedi";
		String curranci24 = "taka";
		String curranci25 = "afgani";
		String curranci26 = "cubian peso";

		Collection<String> collection = new LinkedList<String>();
		collection.add(curranci1);
		collection.add(curranci2);
		collection.add(curranci3);
		collection.add(curranci4);
		collection.add(curranci5);
		collection.add(curranci6);
		collection.add(curranci7);
		collection.add(curranci8);
		collection.add(curranci9);
		collection.add(curranci10);
		collection.add(curranci11);
		collection.add(curranci12);
		collection.add(curranci13);
		collection.add(curranci14);
		collection.add(curranci15);
		collection.add(curranci16);
		collection.add(curranci17);
		collection.add(curranci18);
		collection.add(curranci19);
		collection.add(curranci20);
		collection.add(curranci21);
		collection.add(curranci22);
		collection.add(curranci23);
		collection.add(curranci24);
		collection.add(curranci25);
		collection.add(curranci26);

		System.out.println("Size befor clearing curranci-"+collection.size());
		collection.clear();
		System.out.println("Size after clearing curranci-"+collection.size());
	}

}
