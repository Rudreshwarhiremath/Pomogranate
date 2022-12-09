package ProgramingApti;

public class JavaTest {//on dec 9-12-2011

	public static void main(String[] args) {
		String input = "Be yourself; everyone else is taken.";
		String[] var = input.split(" ");
		for (int i = 0; i < var.length; i++) {
			if (i == 4) {
				StringBuffer buff = new StringBuffer(var[4]);
				buff.reverse();
				String name = buff.toString();
				var[4] = name;
			}
			System.out.print(var[i] + " ");
		}
		System.out.println(System.lineSeparator());
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 7; j++) {
				if (i == 2 || i == 6 || j == 1 || j == 7 || i == 1 & j == 3 || i == 1 & j == 5 || i == 1 & j == 7
						|| i == 3 & j == 4 || i == 4 & j == 4 || i == 5 & j == 4) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}

		System.out.println(System.lineSeparator());
		int a[] = { 1, 2, 3, 4, 5, 2, 3, 4, 1, 6, 7, 8 };
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(a[i]);
			}
		}
		System.out.println(System.lineSeparator());
		int b[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int c[] = { 7, 8, 9, 10, 11, 12, 13 };

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < c.length; j++) {
				if (b[i] == c[j]) {
					System.out.println(b[i]);
				}
			}
		}
		System.out.println(System.lineSeparator());
		String array[] = { "true", "true", "true", "false", "true", "true", "true", "true", "true", "false", "true",
				"false", "true", "false", "false", "true", "true", "true", "true", "true", "false", "false", "true",
				"true" };
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == "true") {
				count++;
			}
		}
		System.out.println("Total present-" + count);
	}

}
