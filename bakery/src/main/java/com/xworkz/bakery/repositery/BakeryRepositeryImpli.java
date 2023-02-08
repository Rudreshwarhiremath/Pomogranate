package com.xworkz.bakery.repositery;

import org.springframework.stereotype.Repository;

import com.xworkz.bakery.dto.BakeryDTO;

@Repository
public class BakeryRepositeryImpli implements BakeryRepositery {
	public BakeryRepositeryImpli() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean saved(BakeryDTO dto) {
		System.out.println("Running save in repositery impl");
		return false;
	}

}
