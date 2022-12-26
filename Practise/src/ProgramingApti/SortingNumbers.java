package ProgramingApti;

public class SortingNumbers {

	public static void main(String[] args) {
		int[] a = { 1, 55, 65, 58, 15, 5 };

		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = a.length - 1; i >= 0; i--) {
			//System.out.println(a[i]);
			if (i == 2) {
				System.out.println("Second l no-" + a[i]);
			}
		}
	}

}
