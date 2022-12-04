package com.xworkz.bridge.govern;

import com.xworkz.bridge.rules.Airbus;

public class AirportAuthority {
	private Airbus airbus;

	public AirportAuthority(Airbus airbus) {
		super();
		this.airbus = airbus;
	}
	
	public void airportrules() {
		if(airbus!=null) {
			boolean airrule1=airbus.airticket();
			boolean airrule2=airbus.document();
			boolean airrule3=airbus.luggageCheck();
			boolean airrule4=airbus.physicalCheck();
			boolean airrule5=airbus.seatNo();
			if(airrule1==true&&airrule2==true&&airrule3==true&&airrule4==true&&airrule5==true) {
				System.out.println("Airport is fallowing rules");
			}else {
				System.out.println("Airport is not fallowing rules");
			}
		}
	}

}
