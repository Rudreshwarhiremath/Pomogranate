package com.xworkz.bridge.fallowers;

import com.xworkz.bridge.rules.BankRule;

public class CanaraBank implements BankRule {

	@Override
	public double minBalance() {
		System.out.println("Checking min balance");
		return 100000d;
	}

	@Override
	public boolean acount() {
		// TODO Auto-generated method stub
		return true;
	}

}
