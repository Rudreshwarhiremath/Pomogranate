package ProgramingApti;

public class SplitandReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hands on learning hers";
		String[] name = str.split(" ");
		for (int i = 0; i <= name.length - 1; i++) {
			System.out.println(name[i]);
			if (i == 2) {
				StringBuffer string = new StringBuffer(name[i]);
				//System.out.println(name[i]);
				System.err.println("Reverse word-" + string.reverse());
				char ch[]=name[i].toCharArray();
				for(int j=ch.length-1;j>=0;j--) {
					System.out.print(ch[j] );
				}
			}

		}

	}
}
