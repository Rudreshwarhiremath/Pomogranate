package com.xworkz.Product.boultRunner;

import com.xworkz.Product.boult.School;

public class SchoolRunner {

	public static void main(String[] args) {
		String[] classes= {"1","2","3","4","5","6","7","8","9","10"};
		 String[] sports= {"KhoKho","Kabbadi","cricket"};
		 String[] activites= {"Cultural","drawing","ETC...    "};
		 String[] buses= {"Sathya","Shanti"};
		 String[] Teachers= {"om","sm","gm","tm"};
		 School school=new School("SSVS","Kalburgi",2,"Kannada",25,classes,sports,activites,buses,Teachers);
		 school.reading();
		 

	}

}
