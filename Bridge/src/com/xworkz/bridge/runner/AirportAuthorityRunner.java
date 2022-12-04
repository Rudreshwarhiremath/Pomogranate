package com.xworkz.bridge.runner;

import com.xworkz.bridge.fallowers.Passengers;
import com.xworkz.bridge.fallowers.Passengers2;
import com.xworkz.bridge.govern.AirportAuthority;

public class AirportAuthorityRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Passengers passenger1=new Passengers();
		Passengers2 passenger2=new Passengers2();
		AirportAuthority authority1=new AirportAuthority(passenger1);
		AirportAuthority authority2=new AirportAuthority(passenger2);
		authority1.airportrules();
		authority2.airportrules();
		
		

	}

}
