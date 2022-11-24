package com.xworkz.Product.StringMethods;

import java.util.LinkedList;
import java.util.List;

public class method {
	String str = new String();
	public String name = "Rudreshwar".concat(" Hiremath");
	String value = "RaviChandra".replaceAll("Chandra", "Mama");
	String set = "RudreshwarHiremath".toUpperCase();
	String get = "RAVITEJA".toLowerCase();
	int count = "MalakangoudaPatil".length();
	String validty = "Akhilesh Kottrgasti".trim();
	String check = "JagadeeshAllagi".toString();
	char[] pit = "Rudreshwar".toCharArray();
	String rain = "Heavy Rain".substring(5, 8);
	String wet = "Sheloveyou".substring(3);
	int pet = "argument of an object".lastIndexOf(10);
	int puppy = "Rambo".hashCode();
	boolean argu = "Ramachari".endsWith("ri");
	boolean gave = "Mr Ramachari".startsWith("Mr");
	String[] buff = "abcdefghijklmnop".split("j");
	String joint = String.join("-", "Sathyam", "Shivim", "Sundram");
	String deep = String.valueOf(pet);
	String depth = String.valueOf(name);
	String copy = String.copyValueOf(pit);
	String vet = String.copyValueOf(pit, 2, 4);
	String price = "457.258F";
	String size = "M";
	String number = "8088928928L";
	String bool = "true";
	String height = "175.65d";
	String cat = "120";
	String price1 = String.valueOf(price);
	String size1 = String.valueOf(size);
	String number1 = String.valueOf(number);
	String bool1 = String.valueOf(bool);
	String height1 = String.valueOf(height);
	String cat1 = String.valueOf(cat);

	public static void main(String[] args) {
		method met = new method();
		System.out.println("Concat:" + met.name);
		System.out.println("replaceAll:" + met.value);
		System.out.println("toUpperCase:" + met.set);
		System.out.println("toLowerCase :" + met.get);
		System.out.println("length :" + met.count);
		System.out.println("trim :" + met.validty);
		System.out.println("toString :" + met.check);
		System.out.println("toCharArray :" + met.pit);
		System.out.println("Heavy Rain     substring(5,8) :" + met.rain);
		System.out.println("Sheloveyou     substring(3):" + met.wet);
		System.out.println("argument of an object    lastIndexOf:" + met.pet);
		System.out.println("hashCode :" + met.puppy);
		System.out.println("Ramachari  endsWith :" + met.argu);
		System.out.println("Mr Ramachari    startsWith :" + met.gave);
		System.out.println("abcdefghijklmnop    split :" + met.buff);
		System.out.println("join :" + met.joint);
		System.out.println("valueOf :" + met.deep);
		System.out.println("valueOf :" + met.depth);
		System.out.println("copyvalueOf :" + met.copy);
		System.out.println("copyvalueOf range :" + met.vet);
		System.out.println(" :" + met.price);
		System.out.println(" :" + met.size);
		System.out.println(" :" + met.number);
		System.out.println(" :" + met.bool);
		System.out.println(" :" + met.height);
		System.out.println(" :" + met.cat);
		System.out.println("valueOf :" + met.price1);
		System.out.println("valueOf :" + met.size1);
		System.out.println("valueOf :" + met.number1);
		System.out.println("valueOf :" + met.bool1);
		System.out.println("valueOf :" + met.height1);
		System.out.println("valueOf :" + met.cat1);

	}
}
