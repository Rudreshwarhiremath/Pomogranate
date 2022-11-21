package ProgramingApti;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8956,reve=0,run;
		for(;n!=0;n=n/10) {
			run=n%10;
			reve=reve*10+run;
		}
		System.out.println(reve);

	}

}
