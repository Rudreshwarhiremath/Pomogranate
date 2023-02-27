package com.xworkz.festival.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindMainGodAndTotalDaysByName {

	public static void main(String[] args) {
		System.out.println("Runnind in FindByNameRunner ");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.fest");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findMainGodAndTotalDaysByName");
		query.setParameter("nameby", "Srikrishna Janmastami");
		Object obj = query.getSingleResult();
		Object[] enti = (Object[]) obj;
		System.out.println(enti[0]);
		System.out.println(enti[1]);
		manager.close();
	}

}
