package com.xworkz.crud.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.crud.dto.MissileDto;
import com.xworkz.crud.repositery.MissileRepositery;

@Component
public class MissileServiceImpli implements MissileService {
	private MissileRepositery missileRepositery;
	private Validator validator;

	public MissileServiceImpli(MissileRepositery missileRepositery, Validator validator) {
		super();
		this.missileRepositery = missileRepositery;
		this.validator = validator;
	}

	@Override
	public boolean validateAndSave(MissileDto dto) {
		System.out.println("starts validation of missile");
		System.out.println("dto" + dto);
		Set<ConstraintViolation<MissileDto>> violance = validator.validate(dto);
		if (!violance.isEmpty()) {
			System.out.println("errer in data");
			violance.forEach(ele -> System.err.println(ele.getMessage()));
			return false;
		} else {
			System.out.println("no violence");
			boolean saved = missileRepositery.save(dto);
			System.out.println("saved" + saved);
			return true;

		}

	}

}
