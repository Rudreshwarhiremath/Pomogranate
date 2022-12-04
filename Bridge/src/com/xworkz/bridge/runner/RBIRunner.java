package com.xworkz.bridge.runner;

import com.xworkz.bridge.fallowers.CanaraBank;
import com.xworkz.bridge.fallowers.SbiBank;
import com.xworkz.bridge.govern.RBI;

public class RBIRunner {

	public static void main(String[] args) {
		CanaraBank canarbank=new CanaraBank();
		SbiBank sbibank=new SbiBank();
		RBI rbi=new RBI(canarbank);
		RBI sbi=new RBI(sbibank);
		rbi.banking();
		sbi.banking();


	}

}
