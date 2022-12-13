package com.xworkz.ipl.repository;

import java.time.LocalDate;


import com.xworkz.ipl.dto.WarDto;

public interface WarRepository {
	boolean create (WarDto wardto);
	
	default int total() {
		return 0;
	}
	default WarDto findByStratedBy(String stratedBy) {
		return null;
	}
	default WarDto findByStratedByAndStratedWith(String stratedBy ,String stratedwith) {
		return null;
	}
	default WarDto findByDateGreaterThanOREqualTo(LocalDate date) {
		return null;
	}
	default WarDto findByDateLesserThanOREqualTo(LocalDate date) {
		return null;
	}
	default WarDto findByStratDateAndEndDate(LocalDate strat,LocalDate end) {
		return null;
	}
	

}
