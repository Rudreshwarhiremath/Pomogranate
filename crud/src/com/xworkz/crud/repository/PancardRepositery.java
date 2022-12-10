package com.xworkz.crud.repository;

public interface PancardRepositery {
	boolean number(String num);

	default int total() {
		return 0;
	}

}
