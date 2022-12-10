package com.xworkz.crud.boot;

import com.xworkz.crud.implimentres.SweetRepositoryImpl;
import com.xworkz.crud.repository.SweetRepository;

public class SweetRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SweetRepository sweetRepository = new SweetRepositoryImpl();
		sweetRepository.listOfSweets("Kala Jamun");
		sweetRepository.listOfSweets(" Jamun");
		sweetRepository.listOfSweets("duda Jamun");
		sweetRepository.listOfSweets("Burfee");
		sweetRepository.listOfSweets("Kalakan ");
		sweetRepository.listOfSweets("Laddu");
		sweetRepository.listOfSweets("motichura laddu");
		sweetRepository.listOfSweets("kesari bath");
		sweetRepository.listOfSweets("Sonapapad");
		sweetRepository.listOfSweets("karad antu");
		sweetRepository.listOfSweets("khava");
		sweetRepository.listOfSweets("besan ladu");
		sweetRepository.listOfSweets("chakli");
		sweetRepository.listOfSweets("chuda");
		sweetRepository.listOfSweets("avalakki chuda");
		//sweetRepository.listOfSweets("karad antu");
		//sweetRepository.listOfSweets("khava");
		//sweetRepository.listOfSweets("besan ladu");

		System.out.println(sweetRepository.list());

	}

}
