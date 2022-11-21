package ProgramingApti;

public class looping {

	public static void main(String[] args) {

		int[] array= {1,2,3,4,5};
	
		for (int i = 0; i < array.length; i++) {
			int j = array[i];
			System.out.println(array[i]);
		}
		System.out.println(System.lineSeparator());
		for(int number:array) {
			System.out.println(number);

	}
	}
}
