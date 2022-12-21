package com.xworkz.javacollection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SoftwareCompnayRunner {

	public static void main(String[] args) {
		String compnay1="TCS";
		String compnay2="Infosis";
		String compnay3="wipro";
		String compnay4="Accentere";
		String compnay5="Tech Mahindra";
		String compnay6="Sony";
		String compnay7="Philiphs";
		String compnay8="Accuvate";
		String compnay9="Oracale";
		String compnay10="SAP";
		String compnay11="Globallogic";
		String compnay12="Cube labs";
		String compnay13="Team Lease";
		String compnay14="Penta amount";
		String compnay15="Nevvit Technologies";
		String compnay16="Pentagan space";
		String compnay17="Blue star";
		String compnay18="LG";
		String compnay19="Lenevo";
		String compnay20="Hp";
		
		Collection<String> software=new ArrayList<String>();
		software.add(compnay1);
		software.add(compnay2);
		software.add(compnay3);
		software.add(compnay4);
		software.add(compnay5);
		software.add(compnay6);
		software.add(compnay7);
		software.add(compnay8);
		software.add(compnay9);
		software.add(compnay10);
		software.add(compnay11);
		software.add(compnay12);
		software.add(compnay13);
		software.add(compnay14);
		software.add(compnay15);
		software.add(compnay16);
		software.add(compnay17);
		software.add(compnay18);
		software.add(compnay19);
		software.add(compnay20);
		
		System.out.println(software);
		System.out.println("=============to string=============");
        
		for (String name : software) {
			System.out.println(name);
			
		}
		System.out.println("=============for each=============");
		Iterator<String> compnay=software.iterator();
		while(compnay.hasNext()) {
			String metro=compnay.next();
			System.out.println(metro);
		}
		System.out.println("=============Iterator=============");
		

	}

}
