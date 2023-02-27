package com.xworkz.festival.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindMaxTotalDays {

	public static void main(String[] args) {
		System.out.println("Runnind in FindByNameRunner ");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.fest");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findMaxTotalDays");
		Object obj = query.getSingleResult();
		int enti = (int) obj;
		System.out.println(enti);
		manager.close();
	}

}
