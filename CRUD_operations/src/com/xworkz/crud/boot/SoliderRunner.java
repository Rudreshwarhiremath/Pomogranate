package com.xworkz.crud.boot;

import com.xworkz.crud.dto.SoldierDto;
import com.xworkz.crud.repositery.SoldireRepositery;
import com.xworkz.crud.repositery.SoldireRepositeryImpliments;
import com.xworkz.crud.service.SoldierServiceImpliments;
import com.xworkz.crud.service.SoliderService;

public class SoliderRunner {

	public static void main(String[] args) {
		SoldierDto dto=new SoldierDto("Sandeeep UnniKrishanan", 24, "Major","LeftinentGeneral");
		SoldierServiceImpliments service=new SoldierServiceImpliments();
		SoldireRepositery repositery=new SoldireRepositeryImpliments();
		service.SetterSoldireRepositery(repositery);
		service.validateAndSaved(dto);
		repositery.save(dto);
		System.out.println(dto);

	}

}
