package ProgramingApti;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, isprime;
		System.out.println("prime numbers are :- ");

		for (i = 2; i <= 100; i++) {
			isprime = 0;
			for (j = 2; j <= i / 2; j++) {

				if (i % j == 0) {
					isprime = 1;
					break;
				}
			}
			if (isprime ==0)

				System.out.println(i + " ");
		}
		
	}
}
