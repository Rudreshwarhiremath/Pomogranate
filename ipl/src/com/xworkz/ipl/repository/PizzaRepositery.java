package com.xworkz.ipl.repository;

import com.xworkz.ipl.dto.PizzaDTO;

public interface PizzaRepositery {
	
	boolean create(PizzaDTO dto);
	
	default int total() {
		return 0;
	}

}
