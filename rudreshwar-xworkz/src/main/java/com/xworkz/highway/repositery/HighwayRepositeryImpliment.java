package com.xworkz.highway.repositery;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.highway.entity.HighwayEntity;

@Repository
public class HighwayRepositeryImpliment implements HighwayRepositery {
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public HighwayRepositeryImpliment() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(HighwayEntity highwayEntity) {
		EntityManager em = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(highwayEntity);
		transaction.commit();
		em.close();
		return true;
	}

	@Override
	public HighwayEntity findById(int id) {
		System.out.println("running in findById in repositery");
		EntityManager em = this.entityManagerFactory.createEntityManager();
		HighwayEntity fromDB = em.find(HighwayEntity.class, id);
		em.close();
		return fromDB;
	}

}
