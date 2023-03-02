package ProgramingApti;

public class Method{
	public static void main(String[] args) {
		
		String a="vv";
		String b="vv";
		String c="gg";
		String d="gg";
		int aCount=0;
		int bCount=0;
		int cCount=0;
		if(a==b) {
			aCount++;
		}
		if(a==c) {
			aCount++;
		}
		if(a==d) {
			aCount++;
		}
		if(b==c) {
			bCount++;
		}
		if(b==d) {
			bCount++;
		}
		if(c==d) {
			cCount++;
	}
		
		if(aCount>bCount) {
			if(bCount>cCount) {
			System.out.println(a);
			}
			else {
				if(aCount<cCount) {
					System.out.println(c);
				}
				else {
					System.out.println(a);
				}
			}	
}
}
}