package ProgramingApti;

public class StringPalindrome {

	public static void main(String[] args) {
		String name = "madam";
		String rev = "";
		char[] array = name.toCharArray();
		for (int i = array.length - 1; i >= 0; i--) {
			rev = rev + array[i];

		}
		if (name.equals(rev)) {
			System.out.println(rev);
			System.out.println("palindrome");
		}else {
			System.out.println("it is not a palindrome");
			System.out.println(rev);
		}

	}

}
