package com.xworkz.bakery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.bakery.dto.BakeryDTO;
import com.xworkz.bakery.repositery.BakeryRepositery;

@Service
public class BakeryServiceImpli implements BakeryService {
	@Autowired
	private BakeryRepositery repositery;

	public BakeryServiceImpli() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSave(BakeryDTO dto) {
		System.out.println("Created  validating and saving");
		boolean saved = this.repositery.saved(dto);
		System.out.println("Saved in repo" + saved);
		return false;
	}

}
