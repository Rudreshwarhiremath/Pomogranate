package com.xworkz.TeaTime.KalburgiRunner;

import com.xworkz.TeaTime.Kalburgi.Chain;

public class ChainRunner {

	public static void main(String[] args) {
		Chain chain = new Chain();
		System.out.println(chain.type);
		System.out.println(chain.price);
		System.out.println(chain.length);
		System.out.println(chain.material);
		System.out.println(chain.weight);
		System.out.println(chain.stolen);
		System.out.println(chain.usedfor);
		System.out.println(chain.fresh);
		Chain chain2 = new Chain("fresh");
		System.out.println(chain2.fresh);
		Chain chain3 = new Chain(1500.4);
		System.out.println(chain3.weight);
		Chain chain4 = new Chain(550);
		System.out.println(chain4.price);
		Chain chain5 = new Chain("dds");
		System.out.println(chain5.type);
		Chain chain6 = new Chain("no", "yes");
		System.out.println(chain6.stolen);
		System.out.println(chain6.fresh);
		Chain chain7 = new Chain(4500, 2500);
		System.out.println(chain7.length);
		System.out.println(chain7.weight);
		Chain chain8 = new Chain("Steel", "mudholbreed");
		System.out.println(chain8.type);
		System.out.println(chain8.usedfor);
		Chain chain9 = new Chain("dogi", "germanshefred", "stainlesssteel");
		System.out.println(chain9.type);
		System.out.println(chain9.material);
		System.out.println(chain9.usedfor);
		// Chain chain10 =new
		// Chain("chainly",600,100,"plastic/steel",500,"no","dog","no");

	}

}
