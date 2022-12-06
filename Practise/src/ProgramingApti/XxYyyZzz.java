package ProgramingApti;

public class XxYyyZzz {

	public static void main(String[] args) {
		String value="abcd";
		for (int i = 0; i < value.length(); i++) {
			for (int j = 0; j <=i+1; j++) {
				if(j==0) {
					System.out.print(value.toUpperCase().charAt(i));
				}else {
					System.out.print(value.toLowerCase().charAt(i));
				}
				
			}
			
		}


	}

}
