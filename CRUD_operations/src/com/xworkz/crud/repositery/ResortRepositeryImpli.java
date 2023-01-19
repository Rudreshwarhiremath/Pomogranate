package com.xworkz.crud.repositery;

import org.springframework.stereotype.Component;

import com.xworkz.crud.dto.ResortDto;

@Component
public class ResortRepositeryImpli implements ResortRepositery {

	@Override
	public boolean save(ResortDto dto) {
		System.out.println("created Resort repo and invoked save");
		System.out.println("saved data" + dto);
		return true;
	}

}
