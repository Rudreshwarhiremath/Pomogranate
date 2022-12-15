package com.xworkz.ipl.repository;

import com.xworkz.ipl.dto.PizzaDTO;

public class PizzaRepositeryImpli implements PizzaRepositery {
	private PizzaDTO[] pizzadto = new PizzaDTO[5];
	private int currentIndex = 0;

	@Override
	public boolean create(PizzaDTO dto) {
		System.out.println("Running create method..");
		if (this.currentIndex > this.pizzadto.length) {
			System.out.println("Size exceede canot add more pizza...");
		}
		this.pizzadto[currentIndex] = dto;
		this.currentIndex++;
		return true;
	}

	@Override
	public int total() {
		System.out.println("Total-");
		return currentIndex;
	}

}
