package com.xworkz.lake.repositery;

import com.xworkz.lake.dto.TheaterDTO;
import com.xworkz.lake.exception.sizeExcedException;

public class TheaterRepositeryImpl implements TheaterRepositery {
	private TheaterDTO [] theaterDTO=new TheaterDTO[5];
	private int presentIndex=0;
	
	
	
	@Override
	public boolean bookMyTicket(TheaterDTO dto) {
		if(this.presentIndex> theaterDTO.length) {
			System.err.println("Size exced exception no more add..."+theaterDTO);
			throw new sizeExcedException("  ");
		}else {
			System.out.println("Can add some more data"+dto);
		}
		this.theaterDTO[presentIndex]=dto;
		this.presentIndex++;
		return false;
	}
	

}
