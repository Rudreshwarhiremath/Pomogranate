package com.xworkz.bridge.rules;

import com.xworkz.bridge.fallowers.Apollo;
import com.xworkz.bridge.fallowers.Dhanvantri;
import com.xworkz.bridge.govern.HospitalManagement;

public class HospitalManagementRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apollo appollo=new Apollo();
		Dhanvantri dhanvantri=new Dhanvantri();
		HospitalManagement hospital=new HospitalManagement(appollo);
		hospital.management();
		HospitalManagement hospital1=new HospitalManagement(dhanvantri);
		hospital1.management();

	}

}
