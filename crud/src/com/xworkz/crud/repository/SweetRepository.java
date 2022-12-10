package com.xworkz.crud.repository;

public interface SweetRepository {
	boolean listOfSweets(String name);
	
	default int list() {
		return 0;
	}

}
