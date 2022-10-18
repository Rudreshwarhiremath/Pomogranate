package com.xworkz.Product.boultRunner;

import com.xworkz.Product.boult.JuicePoint;

public class JuicePointRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] juiceType = { "Orange", "Pinapple", "apple", "Sapota", "Milkshakes" };
		String[] iteam = { "Mixer", "Mixerjar", "Glass", "Counter", "etc......" };
		String[] workersName = { "Sanju", "Mallu", "Kallu" };
		String[] Fruite = { "Orange", "Pinapple", "apple", "Sapota" };
		int[] rate = { 30, 40, 60, 50, 80, 100 };
		String[] iceCream = { "Stabery", "Butterscoth", "Venila", "Etc....." };
		JuicePoint juice = new JuicePoint("SiddGanga", "Sharana", 455, 25, 4, juiceType, iteam, workersName, Fruite,
				rate, iceCream);
		juice.reading();

	}

}
