package com.xworkz.ragi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.ragi.dto.RagiDTO;
import com.xworkz.ragi.repositery.RagiRepositery;

@Service
public class RagiServiceImpli implements RagiService {
	@Autowired
	private RagiRepositery repositery;

	public RagiServiceImpli() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSave(RagiDTO dto) {
		System.out.println("Running in validateAndSave");
		boolean saved = this.repositery.save(dto);
		System.out.println(saved);
		return false;
	}

}
