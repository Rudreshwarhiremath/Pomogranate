package com.xworkz.FarmingJava.Bornvita;

public class Palndrome {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int revers=0,reminder=0,temp;
		int num=454;
		temp=num;
		for(;num!=0;num/=10){
			reminder=num%10;
			revers=revers*10+reminder;
			
		}
		if(temp==revers) {
			System.out.println("its a palndrom"+temp+"  "+revers+reminder);
		}else {
			System.out.println("its not a palendrom"+temp+"  "+revers+reminder);
		}

	}

}
