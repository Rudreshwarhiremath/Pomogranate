package ProgramingApti;

public class ReversePattern {

	public static void main(String[] args) {
		for(int i=1;i<6;i++) {
			for(int j=6-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k);
			}
			System.out.println(" ");
		}

	}

}
