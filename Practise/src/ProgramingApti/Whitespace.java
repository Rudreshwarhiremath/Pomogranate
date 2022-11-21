package ProgramingApti;

public class Whitespace {

	public static void main(String[] args) {
		String name="Hi hello how are you sir";
		name=name.replaceAll("\\s+","");
		System.out.println("All space removed:"+name);

	}

}
