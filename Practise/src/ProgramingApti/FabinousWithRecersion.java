package ProgramingApti;

import java.util.Scanner;

public class FabinousWithRecersion {

	public static void main(String[] args) {
		System.out.println("Enter value");
		Scanner scr=new Scanner(System.in);
		int Count=scr.nextInt();
		int n1=1,n2=2,n3=0;
		for (int i = 0; i < Count; i++) {
			n3=n1+n2;
			n2=n1;
			n1=n2;
			System.out.println(n3);
			
		}
	

	}

}
