package com.xworkz.crud.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.crud.dto.SoldierDto;
import com.xworkz.crud.repositery.SoldireRepositery;

public class SoldierServiceImpliments implements SoliderService {
	private SoldireRepositery soldireRepositery;

	public void SetterSoldireRepositery(SoldireRepositery soldireRepositery) {
		this.soldireRepositery = soldireRepositery;
	}

	@Override
	public boolean validateAndSaved(SoldierDto soldierdto) {
		System.out.println("validate started....");
		System.out.println("DTO is passed");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator valide = factory.getValidator();
		Set<ConstraintViolation<SoldierDto>> voilence = valide.validate(soldierdto);
		if (!voilence.isEmpty()) {
			System.out.println("errer is created");
			voilence.forEach(ele -> System.err.println(ele.getMessage()));
			return false;
		} else {
			System.out.println("data is vallide");
			boolean saved = soldireRepositery.save(soldierdto);
			System.out.println("DTO saved using repo" + saved);
			return saved;

		}

	}

}
