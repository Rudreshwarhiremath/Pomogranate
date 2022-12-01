package ProgramingApti;

public class Nocount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 20, 25, 60, 65, 31 };
		int evencount = 0;
		int oddcount = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				evencount++;
			} else {
				oddcount++;
			}

		}
		System.out.println("even" + evencount);
		System.out.println("odd" + oddcount);

	}
}
