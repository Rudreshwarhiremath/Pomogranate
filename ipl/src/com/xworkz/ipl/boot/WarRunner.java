package com.xworkz.ipl.boot;

import java.time.LocalDateTime;

import com.xworkz.ipl.dto.WarDto;
import com.xworkz.ipl.repository.WarRepository;
import com.xworkz.ipl.repository.WarRepositoryImpl;

public class WarRunner {

	public static void main(String[] args) {
		WarRepository warRepository=new WarRepositoryImpl();
		WarDto wardto=new WarDto();
		wardto.setName("Kargil war");
		wardto.setStartedBy("Pakistan");
		wardto.setStartedWith("Bharath");
		wardto.setEnddate(null);
		wardto.setStartdate(null);
		wardto.setWonBy("Bharath");
		warRepository.create(wardto);
		
		WarDto wardto1=new WarDto();
		wardto1.setName("Ukrine v/s Russia");
		wardto1.setStartedBy("Russia");
		wardto1.setStartedWith("ukrine");
		wardto1.setStartdate(null);
		wardto1.setEnddate(null);
		wardto1.setWonBy("Bharath");
		warRepository.create(wardto1);
		
		WarDto wardto2=new WarDto();
		wardto2.setName("Seoul War");
		wardto2.setStartedBy("south koria");
		wardto2.setStartedWith("North koria");
		wardto2.setStartdate(null);
		wardto2.setEnddate(null);
		wardto2.setWonBy("Koria");
		warRepository.create(wardto2);
		
		WarDto wardto3=new WarDto();
		wardto3.setName("IndoChina War");
		wardto3.setStartedBy("India");
		wardto3.setStartedWith("China");
		wardto3.setStartdate(null);
		wardto3.setEnddate(null);
		wardto3.setWonBy("Bharath");
		warRepository.create(wardto3);
		
		WarDto wardto4=new WarDto();
		wardto4.setName("Iran Iraq");
		wardto4.setStartedBy("Iran");
		wardto4.setStartedWith("Irak");
		wardto4.setStartdate(null);
		wardto4.setEnddate(null);
		wardto4.setWonBy("Iran");
		warRepository.create(wardto4);
		
		
		System.out.println(warRepository.findByDateGreaterThanOREqualTo(null));
		System.out.println(warRepository.findByDateLesserThanOREqualTo(null));
		System.out.println(warRepository.findByStratDateAndEndDate(null, null));
		System.out.println(warRepository.findByStratedBy("russia"));
		System.out.println(warRepository.findByStratedByAndStratedWith("Iran", "Irak"));

	}

}
