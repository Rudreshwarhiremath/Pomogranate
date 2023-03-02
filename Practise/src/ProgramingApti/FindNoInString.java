package ProgramingApti;

public class FindNoInString {

	public static void main(String[] args) {

		String name="andriod new version is 120";
		char array[]=name.toCharArray();
		for (int i = 0; i < array.length; i++) {
			//System.out.println(array[i]);
			if(array[i]!=' ' && array[i]<='9') {
				System.err.print(array[i]);
			}
			
		}
	}

}
