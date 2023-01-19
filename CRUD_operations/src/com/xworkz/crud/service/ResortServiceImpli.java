package com.xworkz.crud.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.crud.dto.ResortDto;
import com.xworkz.crud.repositery.ResortRepositery;
@Component
public class ResortServiceImpli implements ResortService {
	private ResortRepositery resortRepositery;
	private Validator validator;

	public ResortServiceImpli(ResortRepositery resortRepositery, Validator validator) {
		super();
		this.resortRepositery = resortRepositery;
		this.validator = validator;
	}

	@Override
	public boolean validateAndSave(ResortDto dto) {
		System.out.println("Data started to validate in Resort");
		Set<ConstraintViolation<ResortDto>> violence = validator.validate(dto);
		if (!violence.isEmpty()) {
			System.out.println("There is error in code");
			violence.forEach(ele -> System.out.println(ele.getMessage()));
			return false;
		} else {
			boolean saved = resortRepositery.save(dto);
			System.out.println("saved" + saved);
			return saved;
		}

	}

}
