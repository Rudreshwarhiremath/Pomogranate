package xworkz.forests.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import xworkz.forests.entity.ForestEntity;

public class FindByStateRunner {

	public static void main(String[] args) {
		System.out.println("Runnind in FindByStateRunner ");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.forest");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByState");
		Object obj = query.getSingleResult();
		ForestEntity name=(ForestEntity)obj;
		System.out.println(name);
		manager.close();
	}

}
