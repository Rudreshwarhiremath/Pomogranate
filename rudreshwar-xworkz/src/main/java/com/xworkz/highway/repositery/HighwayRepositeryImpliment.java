package com.xworkz.highway.repositery;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.highway.entity.HighwayEntity;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class HighwayRepositeryImpliment implements HighwayRepositery {
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public HighwayRepositeryImpliment() {
		log.info("created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(HighwayEntity highwayEntity) {
		EntityManager em = this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			em.persist(highwayEntity);
			transaction.commit();
			return true;
		} finally {
			em.close();
		}

	}

	@Override
	public HighwayEntity findById(int id) {
		log.info("running in findById in repositery");
		EntityManager em = this.entityManagerFactory.createEntityManager();
		try {
			HighwayEntity fromDB = em.find(HighwayEntity.class, id);
			return fromDB;
		} finally {
			em.close();
		}

	}

	@Override

	public List<HighwayEntity> findByName(String name) {

		EntityManager em = this.entityManagerFactory.createEntityManager();
		try {
			Query query = em.createNamedQuery("findByName");
			query.setParameter("nby", name);
			List<HighwayEntity> list = query.getResultList();
			log.info("Total list size found in repo" + list.size());
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
		log.info("running in deletById in repositery");
		EntityManager em = this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction et = em.getTransaction();
			et.begin();
			HighwayEntity hEntity = em.find(HighwayEntity.class, id);
			em.remove(hEntity);
			log.info("entirepositeryty in " + hEntity);
			et.commit();
			return true;
		} finally {
			em.close();
		}
	}

	@Override
	public List<HighwayEntity> findAll() {
		EntityManager em = this.entityManagerFactory.createEntityManager();
		try {
			Query query = em.createNamedQuery("find");
			List<HighwayEntity> list = query.getResultList();
			log.info("Total list size found in repo" + list.size());
			return list;
		} finally {
			em.close();
		}
	}

}
