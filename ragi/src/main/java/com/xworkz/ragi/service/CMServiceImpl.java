package com.xworkz.ragi.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.stereotype.Service;

import com.xworkz.ragi.dto.CMdto;
@Service
public class CMServiceImpl implements CMService {
	public CMServiceImpl() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<CMdto>> validateAndsave(CMdto dto) {
		System.out.println("Running in  validateAndsave");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<CMdto>> constraintViolations = validator.validate(dto);
		if (constraintViolations != null && !constraintViolations.isEmpty()) {
			System.err.println("constraintViolations exists,return constraints");
			return constraintViolations;
		} else {
			System.out.println("constraintViolations does not exist,data is good");
			return Collections.emptySet();
		}

	}

}
