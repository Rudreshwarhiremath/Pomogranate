package com.xworkz.bridge.govern;

import com.xworkz.bridge.rules.BankRule;

public class RBI {
	private BankRule bankrule;
	 
	

	public RBI() {
		super();
	}



	public RBI(BankRule bankrule) {
		super();
		this.bankrule = bankrule;
	}



	public void banking() {
			if (this.bankrule != null) {
			double balance = bankrule.minBalance();
			boolean acountHave = bankrule.acount();
			if (balance >= 100000 && acountHave == true) {
				System.out.println("Bank fallowing their rules");
			} else {
				System.out.println("Bank not fallowing their rules");
			}

		}

	}
}