package com.xworkz.ragi.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.ragi.dto.CMdto;

public interface CMService {
	Set<ConstraintViolation<CMdto>> validateAndsave(CMdto dto);

}
