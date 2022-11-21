package com.xworkz.FarmingJava.boot;

public class foorloop3 {

	public static void main(String[] args) {
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 5; col++) {
				if (col == 2 || col == 3 || col == 4 || col == 5 ) 
				{
					System.out.print("  ");
				
				if(row==5)
				{
					System.out.print(col);
				}
				}else {
					System.out.print(col);
				}
			}
			System.out.println();
		}

	}
}
