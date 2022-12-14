package ProgramingApti;

public class Foreach {
	public static void main(String[] args) {
		String name = "abcdefghijklmnopqrstuvwxyz";
		char[] array = name.toCharArray();
		int count = 0;
		for (char cat : array) {
			// System.out.println(cat);
			if (cat > 'a' && cat < 'e') {
				count = 1;
				for (int i = 1; i <= count; i++) {
					System.out.print(cat);
				}
						} else if (cat > 'e' && cat <'i') {
				count = 2;
				for (int j = 1; j <= count; j++) {
					System.out.print(cat);
				}
			} else if (cat > 'i' && cat < 'o') {
				count = 3;
				for (int k = 1; k <= count; k++) {
					System.out.print(cat);
				}
			} else if (cat > 'o' && cat < 'u') {
				count = 4;
				for (int l = 1; l <= count; l++) {
					System.out.print(cat);
				}
			} else if (cat > 'u' && cat <= 'z') {
				count = 5;
				for (int m = 1; m <= count; m++) {
					System.out.print(cat);
				}
			}else {
				System.err.print(cat);
			}

		}

	}

}
