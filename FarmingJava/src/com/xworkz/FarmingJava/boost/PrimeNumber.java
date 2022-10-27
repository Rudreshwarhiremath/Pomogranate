package com.xworkz.FarmingJava.boost;

public class PrimeNumber {

	public static void main(String Args[]) {
		int i, j, count;
		System.out.println("prime numbers are :- ");

		for (i = 2; i <= 100; i++) {
			count = 0;
			for (j = 2; j <= i / 2; j++) {

				if (i % j == 0) {
					count++;
					break;
				}
			}
			if (count == 0)

				System.out.println(i+"         "+j);
		}
	}
}
