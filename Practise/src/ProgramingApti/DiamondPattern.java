package ProgramingApti;

public class DiamondPattern {
	public static void main(String[] args) {
		int n = 7;
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				if (i == 4 || j == 4 || i == 3 & j == 3 || i == 3 & j == 2 || i == 3 & j == 5 || i == 3 & j == 6
						|| i == 5 & j == 5 || i == 5 & j == 3 || i == 5 & j == 2 || i == 5 & j == 6 || i == 6 & j == 3
						|| i == 6 & j == 5 || i == 2 & j == 3 || i == 2 & j == 5) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}

	}
}
