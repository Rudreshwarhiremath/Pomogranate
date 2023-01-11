package com.xworkz.winter.autowirebasic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HardwareShop {
	@Autowired
	private int id;
	@Autowired
//	@Qualifier("name")
	private String name;
	@Autowired
	private String gstNo;
	@Autowired
	private String ownerName;
	@Autowired
	private String adress;

	@Override
	public String toString() {
		return "HardwareShop [id=" + id + ", name=" + name + ", gstNo=" + gstNo + ", ownerName=" + ownerName
				+ ", adress=" + adress + "]";
	}

}
