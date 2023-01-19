package com.xworkz.crud.repositery;

import org.springframework.stereotype.Component;

import com.xworkz.crud.dto.MissileDto;
@Component
public class MissileRepositeryImpli  implements MissileRepositery{

	@Override
	public boolean save(MissileDto missileDto) {
		System.out.println("Missile repositery created "+ missileDto);
		return true;
	}

}
