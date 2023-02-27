package com.xworkz.festival.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.festival.entity.FestivalEntity;

public class FindByIdAndName {

	public static void main(String[] args) {
		System.out.println("Runnind in FindByNameRunner ");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.fest");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByIdAndName");
		query.setParameter("iby", 4);
		query.setParameter("nby", "Hanumn Jayanthi");
		Object obj = query.getSingleResult();
		FestivalEntity enti = (FestivalEntity) obj;
		System.out.println(enti);
		manager.close();

	}

}
