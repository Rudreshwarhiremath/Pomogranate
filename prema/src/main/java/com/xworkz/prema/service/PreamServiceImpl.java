package com.xworkz.prema.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.prema.dto.Preamdto;
import com.xworkz.prema.entity.PreamEntity;
import com.xworkz.prema.repositery.PreamRepositery;

@Service
public class PreamServiceImpl implements PreamService {
	@Autowired
	private PreamRepositery preamRepositery;

	public PreamServiceImpl() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<Preamdto>> validateAndSave(Preamdto pdto) {
		System.out.println("Running in  validateAndsave");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<Preamdto>> constraintViolations = validator.validate(pdto);
		if (constraintViolations != null && !constraintViolations.isEmpty()) {
			System.err.println("constraintViolations exists,return constraints");
			return constraintViolations;
		} else {
			System.out.println("constraintViolations does not exist,data is good");
			PreamEntity pEntity = new PreamEntity();
			pEntity.setName(pdto.getName());
			pEntity.setValentineName(pdto.getValentineName());
			pEntity.setPlace(pdto.getPlace());
			pEntity.setGift(pdto.getGift());
			boolean saved = this.preamRepositery.save(pEntity);
			System.out.println(saved);
			System.out.println("Saved " + pEntity);
			return Collections.emptySet();
		}
	}

}
