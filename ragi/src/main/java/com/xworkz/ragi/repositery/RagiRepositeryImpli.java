package com.xworkz.ragi.repositery;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.ragi.dto.RagiDTO;

@Repository
public class RagiRepositeryImpli implements RagiRepositery {
	@Autowired
	private EntityManagerFactory managerFactory;

	public RagiRepositeryImpli() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(RagiDTO dto) {
		System.out.println("Running in Save");
		EntityManager entityManager = this.managerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(dto);
		transaction.commit();
		entityManager.close();
		return false;
	}

}
