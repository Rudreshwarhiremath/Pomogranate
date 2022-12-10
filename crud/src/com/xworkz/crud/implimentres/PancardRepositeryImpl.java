package com.xworkz.crud.implimentres;

import com.xworkz.crud.excepion.PancardSizeExceededException;
import com.xworkz.crud.repository.PancardRepositery;

public class PancardRepositeryImpl implements PancardRepositery {
	private String []pancard=new String[5];
	private int pancardIndex=0;

	@Override
	public boolean number(String num) {
		System.out.println("pancard is running...........");
		if(this.pancardIndex>=pancard.length) {
			throw new PancardSizeExceededException();
		}
		this.pancard[pancardIndex]=num;
		this.pancardIndex++;
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public int total() {
		System.out.println("Total pancard ----");
		return this.pancardIndex;
	}

}
