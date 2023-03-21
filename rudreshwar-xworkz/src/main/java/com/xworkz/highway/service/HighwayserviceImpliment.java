package com.xworkz.highway.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.highway.dto.HighwayDTO;
import com.xworkz.highway.entity.HighwayEntity;
import com.xworkz.highway.repositery.HighwayRepositery;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class HighwayserviceImpliment implements Highwayservice {
	@Autowired
	private HighwayRepositery repositery;

	public HighwayserviceImpliment() {
		log.info("Running in highwayService");
	}

	@Override
	public Set<ConstraintViolation<HighwayDTO>> validateAndSave(HighwayDTO hdDto) {
		Set<ConstraintViolation<HighwayDTO>> vailation = validate(hdDto);
		if (vailation != null && !vailation.isEmpty()) {
			log.info("there is vailation in dto");
			return vailation;

		} else {
			log.info("constraintViolations does not exist,data is good");
			HighwayEntity hEntity = new HighwayEntity();
			BeanUtils.copyProperties(hdDto, hEntity);
			boolean saved = this.repositery.save(hEntity);
			log.info("" + saved);
			log.info("" + hEntity);
			return Collections.emptySet();
		}

	}

	private Set<ConstraintViolation<HighwayDTO>> validate(HighwayDTO hdDto) {
		ValidatorFactory validationFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validationFactory.getValidator();
		Set<ConstraintViolation<HighwayDTO>> vailation = validator.validate(hdDto);
		return vailation;
	}

	@Override
	public HighwayDTO findById(int id) {
		log.info("running in findById in service");
		if (id > 0) {
			HighwayEntity hEntity = this.repositery.findById(id);
			if (hEntity != null) {
				HighwayDTO hdDto = new HighwayDTO();
				BeanUtils.copyProperties(hEntity, hdDto);
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
				BeanUtils.copyProperties(entity, dto);
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
		Set<ConstraintViolation<HighwayDTO>> vailations = validate(hdDto);
		if (vailations != null && !vailations.isEmpty()) {
			log.info("there is vailation in dto");
			return vailations;

		} else {
			log.info("constraintViolations does not exist,data is good and started to update");
			HighwayEntity hEntity = new HighwayEntity();
			BeanUtils.copyProperties(hdDto, hEntity);
			boolean saved = this.repositery.update(hEntity);
			log.info("" + saved);
			log.info("" + hEntity);
			return Collections.emptySet();
		}
	}

	@Override
	public boolean deletById(int id) {
		log.info("running in deletById in service");
		if (id > 0) {
			this.repositery.deletById(id);
		}
		return true;

	}

	@Override
	public List<HighwayDTO> findAll() {
		List<HighwayEntity> hentity = this.repositery.findAll();
		List<HighwayDTO> lists = new ArrayList<HighwayDTO>();
		for (HighwayEntity entity : hentity) {
			HighwayDTO dto = new HighwayDTO();
			BeanUtils.copyProperties(entity, dto);
			lists.add(dto);

		}
		return lists;
	}
}
