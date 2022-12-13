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
		wardto.setStartdate(12/05/1999);
		wardto.setEnddate(26/06/1999);
		wardto.setWonBy("Bharath");
		warRepository.create(wardto);
		
		WarDto wardto1=new WarDto();
		wardto1.setName("Ukrine v/s Russia");
		wardto1.setStartedBy("Russia");
		wardto1.setStartedWith("ukrine");
		wardto1.setStartdate(20/02/2022);
		wardto1.setEnddate(22/12/2022);
		wardto1.setWonBy("Bharath");
		warRepository.create(wardto1);
		
		WarDto wardto2=new WarDto();
		wardto2.setName("Seoul War");
		wardto2.setStartedBy("south koria");
		wardto2.setStartedWith("North koria");
		wardto2.setStartdate(15/10/1965);
		wardto2.setEnddate(15/11/1965);
		wardto2.setWonBy("Koria");
		warRepository.create(wardto2);
		
		WarDto wardto3=new WarDto();
		wardto3.setName("IndoChina War");
		wardto3.setStartedBy("India");
		wardto3.setStartedWith("China");
		wardto3.setStartdate(14/04/1962);
		wardto3.setEnddate(15/05/1962);
		wardto3.setWonBy("Bharath");
		warRepository.create(wardto3);
		
		WarDto wardto4=new WarDto();
		wardto4.setName("Iran Iraq");
		wardto4.setStartedBy("Iran");
		wardto4.setStartedWith("Irak");
		wardto4.setStartdate(8/8/1970);
		wardto4.setEnddate(8/9/1970);
		wardto4.setWonBy("Iran");
		warRepository.create(wardto4);
		
		
		System.out.println(warRepository.findByDateGreaterThanOREqualTo(null));
		System.out.println(warRepository.findByDateLesserThanOREqualTo(null));
		System.out.println(warRepository.findByStratDateAndEndDate(null, null));
		System.out.println(warRepository.findByStratedBy("russia"));
		System.out.println(warRepository.findByStratedByAndStratedWith("Iran", "Irak"));

	}

}
