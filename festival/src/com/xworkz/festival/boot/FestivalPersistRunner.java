package com.xworkz.festival.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.festival.entity.FestivalEntity;

public class FestivalPersistRunner {

	public static void main(String[] args) {
		System.out.println("Running in persistence runner");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.fest");
		EntityManager entitymanager = factory.createEntityManager();
		EntityTransaction transaction = entitymanager.getTransaction();
		transaction.begin();
		FestivalEntity entity = new FestivalEntity("Udagi", "hindu", 1, "holige", "Nature");
		FestivalEntity entity1 = new FestivalEntity("AkshyaTrathiya", "hindu", 1, "Shikarni", "Basavanna");
		FestivalEntity entity2 = new FestivalEntity("RamaNavami", "hindu", 1, "panak", "Rama");
		FestivalEntity entity3 = new FestivalEntity("Hanumn Jayanthi", "hindu", 1, "doodhir", "Hanuman");
		FestivalEntity entity4 = new FestivalEntity("Gurupoornima", "hindu", 1, "huggi", "Gurugalu");
		FestivalEntity entity5 = new FestivalEntity("Moharam", "hindu", 21, "malodi", "Pir");
		FestivalEntity entity6 = new FestivalEntity("VaraMahalakshmi", "hindu", 1, "kesaribath", "Lakshami");
		FestivalEntity entity7 = new FestivalEntity("NagarPanchami", "hindu", 1, "hittu", "Nagappa");
		FestivalEntity entity8 = new FestivalEntity("RakshaBandhana", "hindu", 1, "raveundi", "Bro&Sis");
		FestivalEntity entity9 = new FestivalEntity("Srikrishna Janmastami", "benne", 1, "holige", "Krishna");
		FestivalEntity entity10 = new FestivalEntity("GouriPooje", "hindu", 1, "chakoli", "Gouri");
		FestivalEntity entity11 = new FestivalEntity("Ganesh chaturhi ", "hindu", 5, "modak", "Ganesh");
		FestivalEntity entity12 = new FestivalEntity("MahaNavami", "hindu", 9, "sabupayasa", "Bhavani");
		FestivalEntity entity13 = new FestivalEntity("VijayDashami", "hindu", 10, "shavagipayasa", "Chamundeshwari");
		FestivalEntity entity14 = new FestivalEntity("Dipavali", "hindu", 3, "chakli", "Lakshmi");
		FestivalEntity entity15 = new FestivalEntity("Ekadashi", "hindu", 1, "peda", "Vittala");
		FestivalEntity entity16 = new FestivalEntity("Dattajayanthi", "hindu", 1, "huggi", "Datta");
		FestivalEntity entity17 = new FestivalEntity("Sankrathi", "hindu", 1, "ellubella", "Nature");
		FestivalEntity entity18 = new FestivalEntity("MahaShivaratri", "hindu", 1, "fruits", "Shiva");
		FestivalEntity entity19 = new FestivalEntity("HoliHunnime", "hindu", 1, "huggi", "banna/Kamanna");
		FestivalEntity entity20 = new FestivalEntity("Ellamase", "hindu", 1, "bajji", "Hola");
		FestivalEntity entity21 = new FestivalEntity("HolaAmavase", "hindu", 1, "vabbotta", "Ettu/basav");
		FestivalEntity entity22 = new FestivalEntity("karaHunnime", "hindu", 1, "huggi", "Ettu/Basav");
		FestivalEntity entity23 = new FestivalEntity("Ramzan", "muslim", 1, "doodkhir", "allha");
		FestivalEntity entity24 = new FestivalEntity("Krisamas", "krisamas", 1, "cake", "esu");

		entitymanager.persist(entity);
		entitymanager.persist(entity2);
		entitymanager.persist(entity3);
		entitymanager.persist(entity4);
		entitymanager.persist(entity5);
		entitymanager.persist(entity6);
		entitymanager.persist(entity7);
		entitymanager.persist(entity8);
		entitymanager.persist(entity9);
		entitymanager.persist(entity10);
		entitymanager.persist(entity11);
		entitymanager.persist(entity12);
		entitymanager.persist(entity13);
		entitymanager.persist(entity14);
		entitymanager.persist(entity15);
		entitymanager.persist(entity16);
		entitymanager.persist(entity17);
		entitymanager.persist(entity18);
		entitymanager.persist(entity19);
		entitymanager.persist(entity20);
		entitymanager.persist(entity21);
		entitymanager.persist(entity22);
		entitymanager.persist(entity23);
		entitymanager.persist(entity24);

		transaction.commit();
		entitymanager.close();

	}

}
