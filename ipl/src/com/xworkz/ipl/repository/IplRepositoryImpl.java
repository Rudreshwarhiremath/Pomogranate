package com.xworkz.ipl.repository;

import com.xworkz.ipl.dto.IplDTO;
import com.xworkz.ipl.exception.iplDtoSizeException;

public class IplRepositoryImpl implements IplRepository {
	
	private IplDTO [] ipldto=new IplDTO[10];
	private int currentIndex=0;

	@Override
	public boolean create(IplDTO dto) {
		System.out.println("running create of IpllDTO"+dto);
		if(this.currentIndex>=this.ipldto.length) {
			System.err.println("Size exceeded cannot add more ipl....");
			throw new iplDtoSizeException();
		}
		
		this.ipldto[this.currentIndex]=dto;
		this.currentIndex++;
		System.out.println("Saved-"+dto+"-in index-"+this.currentIndex);
		

		return true;
	}
	@Override
	public int total() {
		  System.out.println("Total..");
		return currentIndex;
	}

}
