package com.xworkz.ipl.boot;

import java.time.LocalDateTime;

import com.xworkz.ipl.dto.IplDTO;
import com.xworkz.ipl.repository.IplRepository;
import com.xworkz.ipl.repository.IplRepositoryImpl;

public class IplRunner {

	public static void main(String[] args) {
		IplRepository iplRepository = new IplRepositoryImpl();
		IplDTO iplDTO = new IplDTO();
		iplDTO.setTeamName("RCB");
		iplDTO.setCapitinName("Virat Kohil");
		iplDTO.setOwnerAlive(true);
		iplDTO.setDefeats(124);
		iplDTO.setPurse(100);
		iplDTO.setWins(176);
		iplDTO.setCreatedBy("Rudra");
		iplDTO.setCreatedDate(LocalDateTime.now());
		System.out.println(iplDTO);
		System.out.println(iplRepository);
		iplDTO.display();
		System.out.println(System.lineSeparator());

		IplDTO iplDTO1 = new IplDTO();
		iplDTO1.setTeamName("GT");
		iplDTO1.setCapitinName("Hardik Pandya");
		iplDTO1.setOwnerAlive(true);
		iplDTO1.setDefeats(10);
		iplDTO1.setPurse(150);
		iplDTO1.setWins(25);
		iplDTO1.setCreatedBy("SYSTEM");
		iplDTO1.setCreatedDate(LocalDateTime.now());
		System.out.println(iplDTO1);
		System.out.println(iplRepository);
		iplDTO1.display();
		System.out.println(System.lineSeparator());

		IplDTO iplDTO2 = new IplDTO();
		iplDTO2.setTeamName("LSG");
		iplDTO2.setCapitinName("KL Rahul");
		iplDTO2.setOwnerAlive(true);
		iplDTO2.setDefeats(25);
		iplDTO2.setPurse(160);
		iplDTO2.setWins(20);
		iplDTO2.setCreatedBy("SYSTEM");
		iplDTO2.setCreatedDate(LocalDateTime.now());
		System.out.println(iplDTO2);
		System.out.println(iplRepository);
		iplDTO2.display();
		System.out.println(System.lineSeparator());

		IplDTO iplDTO3 = new IplDTO();
		iplDTO3.setTeamName("KKR");
		iplDTO3.setCapitinName("Shreyass Ayyer");
		iplDTO3.setOwnerAlive(true);
		iplDTO3.setDefeats(124);
		iplDTO3.setPurse(200);
		iplDTO3.setWins(130);
		iplDTO3.setCreatedBy("SYSTEM");
		iplDTO3.setCreatedDate(LocalDateTime.now());
		System.out.println(iplDTO3);
		System.out.println(iplRepository);
		iplDTO3.display();
		System.out.println(System.lineSeparator());

		IplDTO iplDTO4 = new IplDTO();
		iplDTO4.setTeamName("CSK");
		iplDTO4.setCapitinName("Dhoni");
		iplDTO4.setOwnerAlive(true);
		iplDTO4.setDefeats(242);
		iplDTO4.setPurse(200);
		iplDTO4.setWins(150);
		iplDTO4.setCreatedBy("Prashant");
		iplDTO4.setCreatedDate(LocalDateTime.now());
		System.out.println(iplDTO4);
		System.out.println(iplRepository);
		iplDTO4.display();
		System.out.println(System.lineSeparator());

		IplDTO iplDTO5 = new IplDTO();
		iplDTO5.setTeamName("MI");
		iplDTO5.setCapitinName("Rohit Sharm");
		iplDTO5.setOwnerAlive(true);
		iplDTO5.setDefeats(150);
		iplDTO5.setPurse(160);
		iplDTO5.setWins(120);
		iplDTO5.setCreatedBy("Jagadeesh");
		iplDTO5.setCreatedDate(LocalDateTime.now());
		System.out.println(iplDTO5);
		System.out.println(iplRepository);
		iplDTO5.display();
		System.out.println(System.lineSeparator());

		IplDTO iplDTO6 = new IplDTO();
		iplDTO6.setTeamName("SRH");
		iplDTO6.setCapitinName("Ken vilims");
		iplDTO6.setOwnerAlive(true);
		iplDTO6.setDefeats(140);
		iplDTO6.setPurse(160);
		iplDTO6.setWins(120);
		iplDTO6.setCreatedBy("SYSTEM");
		iplDTO6.setCreatedDate(LocalDateTime.now());
		System.out.println(iplDTO6);
		System.out.println(iplRepository);
		iplDTO6.display();
		System.out.println(System.lineSeparator());

		IplDTO iplDTO7 = new IplDTO();
		iplDTO7.setTeamName("DD");
		iplDTO7.setCapitinName("Rishab Pant");
		iplDTO7.setOwnerAlive(true);
		iplDTO7.setDefeats(120);
		iplDTO7.setPurse(140);
		iplDTO7.setWins(110);
		iplDTO7.setCreatedBy("SYSTEM");
		iplDTO7.setCreatedDate(LocalDateTime.now());
		System.out.println(iplDTO7);
		System.out.println(iplRepository);
		iplDTO7.display();
		System.out.println(System.lineSeparator());

		IplDTO iplDTO8 = new IplDTO();
		iplDTO8.setTeamName("K XII P");
		iplDTO8.setCapitinName("Manyank Agrval");
		iplDTO8.setOwnerAlive(true);
		iplDTO8.setDefeats(110);
		iplDTO8.setPurse(140);
		iplDTO8.setWins(100);
		iplDTO8.setCreatedBy("SYSTEM");
		iplDTO8.setCreatedDate(LocalDateTime.now());
		System.out.println(iplDTO8);
		System.out.println(iplRepository);
		iplDTO8.display();
		System.out.println(System.lineSeparator());

		IplDTO iplDTO9 = new IplDTO();
		iplDTO9.setTeamName("RR");
		iplDTO9.setCapitinName("Sanju Samsun");
		iplDTO9.setOwnerAlive(true);
		iplDTO9.setDefeats(150);
		iplDTO9.setPurse(160);
		iplDTO9.setWins(122);
		iplDTO9.setCreatedBy("SYSTEM");
		iplDTO9.setCreatedDate(LocalDateTime.now());
		System.out.println(iplDTO9);
		System.out.println(iplRepository);
		iplDTO9.display();
		System.out.println(System.lineSeparator());

		IplDTO iplDTO10 = new IplDTO();
		iplDTO10.setTeamName("RCB");
		iplDTO10.setCapitinName("Virat Kohil");
		iplDTO10.setOwnerAlive(true);
		iplDTO10.setDefeats(124);
		iplDTO10.setPurse(100);
		iplDTO10.setWins(176);
		iplDTO10.setCreatedBy("SYSTEM");
		iplDTO10.setCreatedDate(LocalDateTime.now());
		System.out.println(iplDTO10);
		System.out.println(iplRepository);
		iplDTO10.display();
		System.out.println(System.lineSeparator());
		System.out.println(iplRepository.total());
		
		iplRepository.create(iplDTO);
		iplRepository.create(iplDTO1);
		iplRepository.create(iplDTO2);
		iplRepository.create(iplDTO3);
		iplRepository.create(iplDTO4);
		iplRepository.create(iplDTO5);
		iplRepository.create(iplDTO6);
		iplRepository.create(iplDTO7);
		iplRepository.create(iplDTO8);
		iplRepository.create(iplDTO9);
		iplRepository.create(iplDTO10);
		
		System.out.println(System.lineSeparator());
		System.out.println("Total-"+iplRepository.total());

	}

}
