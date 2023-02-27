package com.xworkz.festival.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.festival.entity.FestivalEntity;

public class FindByNameAndRegionAndMainGod {

	public static void main(String[] args) {
		System.out.println("Runnind in FindByNameRunner ");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.fest");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByNameAndRegionAndMainGod");
		query.setParameter("nby", "HoliHunnime");
		query.setParameter("rby", "hindu");
		query.setParameter("mby", "banna/Kamanna");
		Object obj = query.getSingleResult();
		FestivalEntity enti = (FestivalEntity) obj;
		System.out.println(enti);
		manager.close();
	}

}
