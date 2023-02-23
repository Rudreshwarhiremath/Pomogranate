package xworkz.forests.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindStateByNameAndArea {

	public static void main(String[] args) {
		System.out.println("Runnind in FindByNameRunner ");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.forest");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findStateByNameAndArea");
		Object obj = query.getSingleResult();
		String name=(String)obj;
		System.out.println(name);
		manager.close();
	}

}
