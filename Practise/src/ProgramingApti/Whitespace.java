package ProgramingApti;

public class Whitespace {

	public static void main(String[] args) {
		String name=" Hi hello how are you om sir ";
		int count=0;
		//name=name.replaceAll("\\s+","");
		System.out.println("All space removed:"+name);
		char [] array=name.toCharArray();
		for (int i=0;i<name.length()-1;i++) {
			System.out.println(array[i]);
			if(array[i]==' ') {
				count++;
			}
		}System.out.println(count+"-total white space");
		
		String value ="om sai ram";
		String use="";
		int var=0;
		//value=value.replaceAll(" ","");
		//System.out.println(value);
		for(char ch:value.toCharArray()){
			if(ch==' ') {
				var+=1;
			}else {
				use+=ch;
			}
			
		}System.out.println(use);
		System.out.println(var);

	}

}
