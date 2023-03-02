package com.xworkz.crud.repositery;

import org.springframework.stereotype.Component;

import com.xworkz.crud.dto.FirstAidDto;

@Component
public class FirstAidRepositeryImplimentation implements FirstAidRepositery {

	@Override
	public boolean save(FirstAidDto firstAidDto) throws  {
		System.out.println("data starting to save   ");
		return true;
	}

}
