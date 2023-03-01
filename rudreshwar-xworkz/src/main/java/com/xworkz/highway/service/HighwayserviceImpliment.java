package com.xworkz.highway.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.highway.dto.HighwayDTO;
import com.xworkz.highway.entity.HighwayEntity;
import com.xworkz.highway.repositery.HighwayRepositery;

@Service
public class HighwayserviceImpliment implements Highwayservice {
	@Autowired
	private HighwayRepositery repositery;

	public HighwayserviceImpliment() {
		System.out.println("Running in highwayService");
	}

	@Override
	public Set<ConstraintViolation<HighwayDTO>> validateAndSave(HighwayDTO hdDto) {
		ValidatorFactory validationFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validationFactory.getValidator();
		Set<ConstraintViolation<HighwayDTO>> vailation = validator.validate(hdDto);
		if (vailation != null && !vailation.isEmpty()) {
			System.out.println("there is vailation in dto");
			return vailation;

		} else {
			System.out.println("constraintViolations does not exist,data is good");
			HighwayEntity hEntity = new HighwayEntity();
			hEntity.setDestination(hdDto.getDestination());
			hEntity.setId(hdDto.getId());
			hEntity.setKiloMiter(hdDto.getKiloMiter());
			hEntity.setName(hdDto.getName());
			hEntity.setSource(hdDto.getSource());
			hEntity.setType(hdDto.getType());
			boolean saved = this.repositery.save(hEntity);
			System.out.println(saved);
			System.out.println(hEntity);
			return Collections.emptySet();
		}

	}

	@Override
	public HighwayDTO findById(int id) {
		System.out.println("running in findById in service");
		if (id > 0) {
			HighwayEntity hEntity = this.repositery.findById(id);
			if (hEntity != null) {
				HighwayDTO hdDto = new HighwayDTO();
				hdDto.setDestination(hEntity.getDestination());
				hdDto.setId(hEntity.getId());
				hdDto.setKiloMiter(hEntity.getKiloMiter());
				hdDto.setName(hEntity.getName());
				hdDto.setSource(hEntity.getSource());
				hdDto.setType(hEntity.getType());
				return hdDto;
			}
		}
		return Highwayservice.super.findById(id);
	}

	@Override
	public List<HighwayDTO> findByName(String name) {
		if (name != null && !name.isEmpty()) {
			List<HighwayEntity> hentity = this.repositery.findByName(name);
			List<HighwayDTO> lists = new ArrayList<HighwayDTO>();
			for (HighwayEntity entity : hentity) {
				HighwayDTO dto = new HighwayDTO();
				dto.setDestination(entity.getDestination());
				dto.setId(entity.getId());
				dto.setKiloMiter(entity.getKiloMiter());
				dto.setName(entity.getName());
				dto.setSource(entity.getSource());
				dto.setType(entity.getType());
				lists.add(dto);

			}
			return lists;
		} else {
			System.err.println("data not fond in table");
		}
		return Highwayservice.super.findByName(name);
	}

	@Override
	public Set<ConstraintViolation<HighwayDTO>> updateAndSave(HighwayDTO hdDto) {
		ValidatorFactory validationFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validationFactory.getValidator();
		Set<ConstraintViolation<HighwayDTO>> vailations = validator.validate(hdDto);
		if (vailations != null && !vailations.isEmpty()) {
			System.out.println("there is vailation in dto");
			return vailations;

		} else {
			System.out.println("constraintViolations does not exist,data is good and started to update");
			HighwayEntity hEntity = new HighwayEntity();
			hEntity.setDestination(hdDto.getDestination());
			hEntity.setId(hdDto.getId());
			hEntity.setKiloMiter(hdDto.getKiloMiter());
			hEntity.setName(hdDto.getName());
			hEntity.setSource(hdDto.getSource());
			hEntity.setType(hdDto.getType());
			boolean saved = this.repositery.update(hEntity);
			System.out.println(saved);
			System.out.println(hEntity);
			return Collections.emptySet();
		}
	}
	
	@Override
	public HighwayDTO deletById(int id) {
		System.out.println("running in deletById in service");
		if (id > 0) {
			HighwayEntity hEntity = this.repositery.deletById(id);
			if (hEntity != null) {
				HighwayDTO hdDto = new HighwayDTO();
				hEntity.setDestination(hdDto.getDestination());
				hEntity.setId(hdDto.getId());
				hEntity.setKiloMiter(hdDto.getKiloMiter());
				hEntity.setName(hdDto.getName());
				hEntity.setSource(hdDto.getSource());
				hEntity.setType(hdDto.getType());
				System.out.println("dto in service"+hdDto);
				return hdDto;
			}
		}
		return Highwayservice.super.deletById(id);
	}
}
