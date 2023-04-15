package com.xworkz.sam.repo;

import javax.persistence.EntityManagerFactory;

import org.springframework.stereotype.Repository;

import com.xworkz.sam.entity.SamEntity;

@Repository
public class SamRepoImpl implements SamRepo {

	private EntityManagerFactory entityManagerFactory;

	public SamRepoImpl() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean sendMail(SamEntity samEntity) {
		
		return false;
	}

}
