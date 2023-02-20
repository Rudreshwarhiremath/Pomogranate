package com.xworkz.prema.repositery;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.prema.entity.PreamEntity;

@Repository
public class PreamRepositeryImpli implements PreamRepositery {
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public PreamRepositeryImpli() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(PreamEntity preamEntity) {
		System.out.println("running in save method");
		EntityManager em = this.entityManagerFactory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(preamEntity);
		et.commit();
		em.close();
		return true;
	}

	@Override
	public PreamEntity findById(int id) {
		System.out.println("find by id in repo.." + id);
		EntityManager entitymanager = this.entityManagerFactory.createEntityManager();
		PreamEntity fromDb=entitymanager.find(PreamEntity.class,id);
		entitymanager.close();
		return fromDb;
	}

}
