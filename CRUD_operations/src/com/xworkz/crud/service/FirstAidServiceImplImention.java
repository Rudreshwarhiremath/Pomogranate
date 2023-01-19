package com.xworkz.crud.service;

import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.xworkz.crud.dto.FirstAidDto;
import com.xworkz.crud.repositery.FirstAidRepositery;

@Component
public class FirstAidServiceImplImention implements FirstAidService {
	@Autowired
	private FirstAidRepositery firstAidRepositery;
	private Validator validator;

	@Autowired
	public FirstAidServiceImplImention(Validator validator) {
		super();
		this.validator = validator;
	}

	public void setFirstAidRepositery(FirstAidRepositery firstAidRepositery) {
		this.firstAidRepositery = firstAidRepositery;
	}

	@Override
	public boolean validateAndSave(FirstAidDto dto) {
		System.out.println("data started to validate in FirstAid");
		System.out.println("dto---" + dto);
		Set<ConstraintViolation<FirstAidDto>> violense = validator.validate(dto);
		if (!violense.isEmpty()) {
			System.err.println("there is error");
			violense.forEach(ele -> System.err.println(ele.getMessage()));
			return false;
		} else {
			System.out.println("there is no error ");
			boolean saved = firstAidRepositery.save(dto);
			System.out.println("data saved" + saved);
			return saved;
		}

	}

}
