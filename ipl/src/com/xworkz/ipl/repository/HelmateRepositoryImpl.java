package com.xworkz.ipl.repository;

import com.xworkz.ipl.dto.HelmateDto;


public class HelmateRepositoryImpl implements HelmateRepository {
	private HelmateDto[] dto=new HelmateDto[4];
	private int currentIndex=0;

	@Override
	public boolean save(HelmateDto helmatedto) {
		System.out.println("Running helmate dto");
		if(this.currentIndex > this.dto.length) {
			System.out.println("Dto is full and no more addings");
			
		}

		this.dto[this.currentIndex]=helmatedto;
		this.currentIndex++;
		
		return true;
	}

}
