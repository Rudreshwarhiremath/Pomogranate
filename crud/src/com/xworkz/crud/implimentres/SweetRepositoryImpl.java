package com.xworkz.crud.implimentres;

import com.xworkz.crud.excepion.SweetSizeExceededException;
import com.xworkz.crud.repository.SweetRepository;

public class SweetRepositoryImpl implements SweetRepository {
	
	private String [] sweetNames=new String[15];
	private int sweetIndex=0;

	@Override
	public boolean listOfSweets(String name) {
		System.out.println("Running of creating sweet sets .........");
		if(this.sweetIndex>=this.sweetNames.length) {
			throw new SweetSizeExceededException();
		}
		this.sweetNames[sweetIndex]=name;
		this.sweetIndex++;
		return false;
	}
	@Override
	public int list() {
		System.out.println("running total list of sweets----");		
		return this.sweetIndex;
	}
	

}
