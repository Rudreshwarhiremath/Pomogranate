package com.xworkz.bigBasket.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import com.xworkz.bigBasket.dto.BigbasketDTO;

public interface BigService {
	
	Set<ConstraintViolation<BigbasketDTO>> validateAndsave(BigbasketDTO bdto);

}
