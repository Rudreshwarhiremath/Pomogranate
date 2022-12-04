package com.xworkz.bridge.govern;

import com.xworkz.bridge.rules.HospitalRule;

public class HospitalManagement {
	private HospitalRule hospitalRules;

	public HospitalManagement() {
		super();
	}

	public HospitalManagement(HospitalRule hospitalRules) {
		super();
		this.hospitalRules = hospitalRules;
	}

	public void management() {
		if (this.hospitalRules != null) {
			System.out.println("Fetching Hospital rules");
			boolean rule1 = hospitalRules.mask();
			boolean rule2 = hospitalRules.noice();
			int rule3 = hospitalRules.persons();
			if (rule1 == true && rule2 == true && rule3 <= 2) {
				System.out.println("Hospital fallowing rules");
			} else {
				System.out.println("Hospital not fallowing rules");
			}

		}
	}

}
