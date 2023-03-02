package com.xworkz.bigBasket.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.bigBasket.dto.BigbasketDTO;
import com.xworkz.bigBasket.entity.BibBasketEntity;
import com.xworkz.bigBasket.repositery.BigBasketRepositery;

@Service
public class BigServiceImpli implements BigService {
	@Autowired
	private BigBasketRepositery bigBasketRepositery;

	public BigServiceImpli() {
		System.out.println("Created  " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<BigbasketDTO>> validateAndsave(BigbasketDTO bdto) {
		System.out.println("Running in validateAndsave");
		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorFactory.getValidator();
		Set<ConstraintViolation<BigbasketDTO>> constraintViolations = validator.validate(bdto);
		if (constraintViolations != null && !constraintViolations.isEmpty()) {
			System.err.println("constraintViolations exists,return constraints");
			return constraintViolations;
		} else {
			System.out.println("No constraintViolations running smooth");
			System.out.println(bdto);
			BibBasketEntity bentity = new BibBasketEntity();
			bentity.setCustomerName(bdto.getCustomerName());
			bentity.setCustomerMobileNo(bdto.getCustomerMobileNo());
			bentity.setAmount(bdto.getAmount());
			bentity.setArea(bdto.getArea());
			bentity.setCustomerStreet(bdto.getCustomerStreet());
			bentity.setEmail(bdto.getEmail());
			bentity.setItem(bdto.getItem());
			bentity.setLocation(bdto.getLocation());
			bentity.setUserId(bdto.getUserId());
			// bentity.setPword(bdto.getPword());
			String pwd = bdto.getPword();
			if (pwd.length() == 8) {
				bentity.setPword(bdto.getPword());
			} else {
				System.err.println("Password length should be 8 character");
			}
			System.out.println(bentity);
			boolean saved = this.bigBasketRepositery.save(bentity);
			System.out.println(saved);
			return Collections.emptySet();
		}

	}

	public static void main(String[] args) {
		String pswd = "Rud@1230";
		boolean number = false;
		char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

		for (int i = 0; i < num.length; i++) {
			if (pswd.charAt(7) == num[i]) {

				System.out.println("number is there");
				
			} else {
				System.err.println("password  number is not valide");
			}
		}

//		boolean length = false;
//		boolean caps = false;
//		boolean special = false;
//		boolean number = false;
//		
//		if (pswd.length() == 8) {
//			length = true;
//		} else {
//			System.err.println("password  length is not valide");
//		}
//
//		if (pswd.charAt(0) >= 'A' && pswd.charAt(0) <= 'Z') {
//			caps = true;
//		} else {
//			System.err.println("password caps is not valide");
//		}
//		char[] spcl = { '@', '#', '$', '%', '&' };
//		for (int i=0;i<spcl.length;i++) {
//			if (pswd.charAt(3) ==spcl[i]) {
//				special = true;
//			} else {
//				System.err.println("password  special is not valide");
//			}
//		}
//		char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
//		for (int i=0;i<num.length;i++) {
//			if (pswd.charAt(7)==num[i]) {
//				number = true;
//			} else {
//				System.err.println("password  number is not valide");
//			}
//		}
//
//		if (length == true && caps == true  && special == true  &&number == true) {
//			System.out.println("Password is valide");
//
//		}

	}
}
