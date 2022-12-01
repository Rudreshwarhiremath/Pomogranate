package com.xworkz.bridge.fallowers;

import com.xworkz.bridge.rules.TraficRules;
import com.xworkz.bridge.rules.Xworkz;

public class XworkzRajajinagar implements Xworkz,TraficRules {

	@Override
	public boolean interview() {
		System.out.println("Interview is from either Development or testing");
		return false;
	}

	@Override
	public boolean training() {
         System.out.println("Training is from Institute");
		return false;
	}

	@Override
	public boolean placement() {
		  System.out.println("placement is from Institute");		
		  return false;
	}

	@Override
	public boolean takeRight() {
		System.out.println("Takeright from Trafic Rules");
		return false;
	}

	@Override
	public boolean gostright() {
		System.out.println("gostright from Trafic Rules");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean noUturn() {
		System.out.println("noUturn from Trafic Rules");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean noOvertake() {
		System.out.println("noOvertake from Trafic Rules");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keepleft() {
		System.out.println("keepleft from Trafic Rules");
		// TODO Auto-generated method stub
		return false;
	}

}
