package com.xworkz.highway.repositery;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

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

	@Override

	public List<HighwayEntity> findByName(String name) {

		EntityManager em = this.entityManagerFactory.createEntityManager();
		try {
			Query query = em.createNamedQuery("findByName");
			query.setParameter("nby", name);
			List<HighwayEntity> list = query.getResultList();
			System.out.println("Total list size found in repo" + list.size());
			return list;
		} finally {
			em.close();
		}
	}

	@Override
	public boolean update(HighwayEntity highwayEntity) {
		EntityManager em = this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction et = em.getTransaction();
			et.begin();
			em.merge(highwayEntity);
			et.commit();
			return true;
		} finally {
			em.close();
		}

	}

	@Override
	public boolean deletById(int id) {
		System.out.println("running in deletById in repositery");
		EntityManager em = this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction et = em.getTransaction();
			et.begin();
			HighwayEntity hEntity = em.find(HighwayEntity.class, id);
			em.remove(hEntity);
			System.out.println("entirepositeryty in " + hEntity);
			et.commit();
			return true;
		} finally {
			em.close();
		}
	}

}
