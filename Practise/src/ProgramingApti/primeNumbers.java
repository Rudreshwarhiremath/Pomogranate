package ProgramingApti;

public class primeNumbers {

	public static void main(String[] args) {
		int n=5;
		int count=0;
		if(n==0||n==1) {
			System.out.println("not prime no");
					}
		else {
			for(int i=2;i<n-1;i++) {
				if(n%i==0) {
					count++;
				}
			}
			if (count==2) {
				System.out.println("is a prime no");
			}
			else {
				System.out.println("not a prime no");
			}
		}

	}

}
