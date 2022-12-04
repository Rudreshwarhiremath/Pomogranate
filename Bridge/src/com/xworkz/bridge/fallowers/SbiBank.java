package com.xworkz.bridge.fallowers;

import com.xworkz.bridge.rules.BankRule;

public class SbiBank implements BankRule {

	@Override
	public boolean acount() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public double minBalance() {
		// TODO Auto-generated method stub
		return 5000;
	}

}
