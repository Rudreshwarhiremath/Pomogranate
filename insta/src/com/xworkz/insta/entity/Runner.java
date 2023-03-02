package com.xworkz.insta.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Runner {
	public static void main(String[] args) {
		System.out.println("Running in PersistRunner");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.insta");
		EntityManager manager = factory.createEntityManager();
	}

}
