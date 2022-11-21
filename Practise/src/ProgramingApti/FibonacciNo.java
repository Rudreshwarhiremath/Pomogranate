package ProgramingApti;

public class FibonacciNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,j=1,k,l,count=20;
		System.out.println(i+" "+j);
		for(l=2;l<count;++l) {
			k=i+j;
			System.out.println(" "+k);
			i=j;
			j=k;
		}

	}

}
