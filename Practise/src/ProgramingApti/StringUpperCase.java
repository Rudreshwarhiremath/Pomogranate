package ProgramingApti;

public class StringUpperCase {
	public static void main(String[] args) {
		String name = "Rudreshwar";
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == 'e') {
				System.err.print(Character.toUpperCase('e'));

			} else if (name.charAt(i) == 'w') {
				System.err.print(Character.toUpperCase('w'));

			} else {
				System.out.print(name.charAt(i));
			}

		}
	}

}
