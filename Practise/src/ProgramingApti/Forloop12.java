package ProgramingApti;

public class Forloop12 {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i == 3 && j == 4) {
					System.out.print("X-workz");
				} else {
					System.out.print(j);
				}

			}
			System.out.println(" ");

		}
		System.out.println(System.lineSeparator());
		for(int k=1;k<=4;k++) {
			for(int l=1;l<=4;l++) {
				if(k==1 && l==1) {
					System.out.print("X-workz");
				}else {
						System.out.print(k);
					}
				}
			System.out.println(" ");
			}
		}

	

}
