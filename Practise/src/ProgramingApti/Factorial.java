package ProgramingApti;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,fact=1,n=6;
		for(i=1;i<=n;i++) {
			fact=fact*i;
			}
		System.out.println(fact);
	
	int a=10,b=20;
	System.out.println("a before:"+a);
	System.out.println("b before:"+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("a after:"+a);
	System.out.println("b after:"+b);
	
	}
	

}

//a=10,b=20
//a=a+b-30
//b=a-b->30-20=10
//a=a-b->30-20=10