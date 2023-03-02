package ProgramingApti;

public class JavaTest2 {

	public static void main(String[] args) {
		int[] values = { 45, 333, 900, 23, 76, 29, 474, 654, 29, 454 };
		int temp = 0;
		for (int i = 0; i < values.length - 1; i++) {
			for (int j = i + 1; j < values.length - 1; j++) {
				if (values[i] < values[j]) {
					temp = values[i];
					values[i] = values[j];
					values[j] = temp;

				}

			}
		}
		for (int k = 0; k < values.length; k++) {
			// System.out.println(values[k]);
			if (k == 0) {
				System.out.println("Max ->" + values[k]);

			}
			if (k == 8) {
				System.out.println("Min ->" + values[k]);
			}
		}
		//2
		int[] flowers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < flowers.length; i++) {
			if (flowers[i] % 2 == 0) {

				System.out.println("Love is true");
			} else {
				System.out.println("Love is not true");
			}

		}
	}
}
