package com.xworkz.festival.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindRegionAndMainGodByNameAndId {

	public static void main(String[] args) {
		System.out.println("Runnind in FindByNameRunner ");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.fest");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findRegionAndMainGodByNameAndId");
		query.setParameter("iby", 5);
		query.setParameter("nby", "Gurupoornima");
		Object obj = query.getSingleResult();
		Object[] enti = (Object[]) obj;
		System.out.println(enti[0]);
		System.out.println(enti[1]);
		manager.close();
	}

}
