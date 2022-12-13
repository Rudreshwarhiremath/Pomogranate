package com.xworkz.ipl.repository;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.xworkz.ipl.dto.WarDto;

public class WarRepositoryImpl implements WarRepository {
	private WarDto[] wardto = new WarDto[5];
	private int currentIndex = 0;

	@Override
	public boolean create(WarDto dto) {
		System.out.println("Running War dto " + dto);
		if (this.currentIndex >= this.wardto.length) {
			System.err.println("current index is exceded..");
		}
		this.wardto[this.currentIndex] = dto;
		System.out.println("Saved-" + dto);
		this.currentIndex++;

		return true;
	}

	@Override
	public WarDto findByStratedBy(String stratedBy) {
		System.out.println("findByStratedBy is created");
		for (WarDto warDto2 : wardto) {
			if (warDto2 != null && warDto2.getStartedBy().equalsIgnoreCase(stratedBy)) {
				System.out.println("War dto is found by-" + stratedBy);
				return warDto2;
			}
		}
		System.out.println("No war dto were found");
		return WarRepository.super.findByStratedBy(stratedBy);
	}
	@Override
	public WarDto findByStratedByAndStratedWith(String stratedBy, String stratedwith) {
		System.out.println(" WarDto findByStratedByAndStratedWith is created...");
		for (WarDto warDto3 : wardto) {
			if(warDto3!=null && warDto3.getStartedBy().equalsIgnoreCase(stratedBy)&warDto3.getStartedWith().equalsIgnoreCase(stratedwith)) {
				System.out.println("war dto is found by-"+stratedBy+""+stratedwith);
				return warDto3;
			}
			
		}
		System.out.println("No war dto were found");
		return WarRepository.super.findByStratedByAndStratedWith(stratedBy, stratedwith);
	}
	@Override
	public WarDto findByStratDateAndEndDate(LocalDate strat, LocalDate end) {
		System.out.println("findByStratDateAndEndDate is created...");
		for (WarDto warDto4 : wardto) {
			if(warDto4!=null) {
				System.out.println("Date is found"+strat+"-"+end);
				
			}
			
		}
		System.out.println("No war dto were found");
		return WarRepository.super.findByStratDateAndEndDate(strat, end);
	}
	@Override
	public WarDto findByDateGreaterThanOREqualTo(LocalDate date) {
		System.out.println("findByDateGreaterThanOREqualTo is created...");
		return WarRepository.super.findByDateGreaterThanOREqualTo(date);
	}

	
	@Override
	public WarDto findByDateLesserThanOREqualTo(LocalDate date) {
		System.out.println("findByDateLesserThanOREqualTo is created...");
		return WarRepository.super.findByDateLesserThanOREqualTo(date);
	}

	@Override
	public int total() {
		System.out.println("total");
		return currentIndex;
	}

}
