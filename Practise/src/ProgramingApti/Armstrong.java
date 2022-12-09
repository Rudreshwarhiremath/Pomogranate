package ProgramingApti;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 153, reve = 0, run,sum1=0, sum = 0, temp = 0,count=0;
		for (; n != 0; n = n / 10) {
			run = n % 10;
			reve = reve * 10 + run;
			//temp = math.pow
			count++;
			sum1^=temp;
			//System.out.println(reve);
			//System.out.println(sum1);
			sum = sum + temp;
		}
		//System.out.println(temp);
		//if(n==sum) {
			System.out.println("it is a armstrong no");
			System.out.println("sum is:" + sum);
		//else {
			System.out.println("it is not a armstrong no");
		//}
		
		//System.out.println("count:" + count);
		//System.out.println("Reverse:" + reve);

	}

}
