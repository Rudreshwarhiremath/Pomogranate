package com.xworkz.sam.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.sam.dto.SamDto;
import com.xworkz.sam.entity.SamEntity;
import com.xworkz.sam.repo.SamRepo;

@Service
public class SamServiceImpli implements SamService {
	@Autowired
	private SamRepo samRepo;

	public SamServiceImpli() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(SamDto samDto) {

		SamEntity entity = new SamEntity();
		BeanUtils.copyProperties(samDto, entity);
		this.samRepo.sendMail(entity);
		return false;
	}
}
