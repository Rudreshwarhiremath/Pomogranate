package com.xworkz.Product.boultRunner;

import com.xworkz.Product.boult.Medical;

public class MedicalRunner {

	public static void main(String[] args) {
		String[]colours= {"green","white","brown","blue"};
		String[]wnames= {"Lingau","Dhananjy","Puspak","dharma"};
		String[]coco= {"peark","Dairymilk","milkbar"};
		String[]tab= {"paracitamel","cinarest","dolo650","zintak"};
		String[]syp= {"cinarest","cheston","zikuss"};
		int[]earning= {10000,15000,25000,30000,20000,30000};
	  Medical medical =new Medical("mata",155,"BasaveshwarNagar",9999999999L,"Basava", colours, wnames, coco, tab, syp, earning);
	  medical.reading();

	}

}
