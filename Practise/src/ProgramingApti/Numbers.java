package ProgramingApti;

public class Numbers {

	public static void main(String[] args) {
		int[] numbers = { 20, 25, 60, 65, 31 };
		int evenNum;
		int oddNum;
		for (int i = 0; i < numbers.length; i++) {
			int ref = numbers[i];
			if (ref % 2 == 0) {
				System.out.println(ref);
			}
		}
	}

}
