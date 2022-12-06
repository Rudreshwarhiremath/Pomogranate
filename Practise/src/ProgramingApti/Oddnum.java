package ProgramingApti;

public class Oddnum {
	public static void main(String[] args) {
		

	//public static void even() {
		int n = 1234321, m, p = 0;
		// for (int i=1;i<50;i++) {
		// if(i!=i/2) {
		// System.out.println(i);
		// }
		// }
		for (; n != 0; n = n / 10) {
			m = n % 10;
			p = p * 10 + m;
			System.out.println(p);
		}
		System.out.println(p + "- full value");
	}
}
//}