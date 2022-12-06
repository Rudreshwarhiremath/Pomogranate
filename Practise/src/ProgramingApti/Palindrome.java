package ProgramingApti;

public class Palindrome {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int revers=0,reminder=0,temp;
		int num=120457;
		temp=num;
		for(;num!=0;num/=10){
			reminder=num%10;
			revers=revers*10+reminder;
			if(reminder%2==0) {
				System.out.println(reminder+"-  it is even");
			}else {
				System.out.println(reminder+"-   it is not even");
			}
		}
		if(temp==revers) {
			System.out.println("its a palndrom"+temp+"  "+revers+reminder);
		}else {
			System.out.println("its not a palendrom"+temp+" - "+revers+reminder);
		}
		

	}

}
