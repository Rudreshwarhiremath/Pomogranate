package com.xworkz.winter.autowirebasic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Tractor {
	@Autowired
	@Qualifier("nameOfTractor")
	private String name;
	@Autowired
	private String brand;
	@Autowired
	private String model;
	@Autowired
	@Qualifier("priceOfTractor")
	private long price;
	@Autowired
	private boolean fourWheelDrive;
	@Autowired
	private int hp;
	@Autowired
	private int frontGear;
	@Autowired
	private int reverseGear;
	@Autowired
	private int cylinder;

	@Override
	public String toString() {
		return "Tractor [name=" + name + ", brand=" + brand + ", model=" + model + ", price=" + price
				+ ", fourWheelDrive=" + fourWheelDrive + ", hp=" + hp + ", frontGear=" + frontGear + ", reverseGear="
				+ reverseGear + ", cylinder=" + cylinder + "]";
	}

}
