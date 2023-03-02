package com.xworkz.bigBasket.repositery;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.bigBasket.entity.BibBasketEntity;

@Repository
public class BigBasketRepositeryImpli implements BigBasketRepositery {
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public BigBasketRepositeryImpli() {
		System.out.println("Created  " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(BibBasketEntity bentity) {
		System.out.println("running in save method");
		EntityManager em = this.entityManagerFactory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(bentity);
		et.commit();
		em.close();
		return false;
	}

}
