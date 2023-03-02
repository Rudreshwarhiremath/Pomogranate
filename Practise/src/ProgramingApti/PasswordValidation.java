package ProgramingApti;

import java.util.Scanner;

public class PasswordValidation {
	public static void main(String[] args) {
		System.out.println("Enter A password");
		Scanner sc = new Scanner(System.in);
		char[] spcl = { '@', '#', '$', '%', '&' };
		char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		boolean validePassword = false;
		String password = sc.next();
		if (password != null) {
			char[] pswd = password.toCharArray();
			System.out.println(pswd.length);
			for (int i = 0; i <= pswd.length - 1; i++) {
				System.err.println(pswd[i]);
				if (pswd[0] >= 'A' && pswd[0] <= 'Z' || pswd[3] == spcl[i] || pswd[7] == num[i]) {
					validePassword = true;
				}
			}
		}
		
	}
}
