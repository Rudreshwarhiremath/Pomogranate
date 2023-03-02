package ProgramingApti;

public class AxisBank1 {
	public static void main(String[] args) {

		int[] a = { 1, 2, 6, 7, 8, 14 };
		int[] b = { 7, 8, 9, 11, 12 };
		System.out.println(a.length);
		System.out.println(b.length);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] != b[j]) {
					System.out.print(a[i]);
					System.out.print(b[j]);
				}
			}
		}
	}
}
