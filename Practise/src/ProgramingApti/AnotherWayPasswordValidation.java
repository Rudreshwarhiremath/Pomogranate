package ProgramingApti;

import java.util.Scanner;

public class AnotherWayPasswordValidation {
	public static void main(String[] args) {
		System.out.println("Enter A password");
		Scanner sc = new Scanner(System.in);
		char[] spcl = { '@', '#', '$', '%', '&' };
		char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		String password = sc.next();
		System.out.println(password.length());
		if (password.length() == 8) {
			System.out.println(password.charAt(0));
			System.out.println(password.charAt(3));
			System.out.println(password.charAt(7));
			if (password.charAt(0) >= 'A' && password.charAt(0) <= 'Z' || password.charAt(3) == '@'
					|| password.charAt(7) >= '0' && password.charAt(7) <= '9') {
				System.out.println("Password is valide");
			} else {
				System.out.println("Password is not valide");
			}
		} else {
			System.out.println("Password is not valide");
		}

	}

}
