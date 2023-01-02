package com.xworkz.javacollection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.javacollection.dto.PalaceDto;

public class PalaceRunner {

	public static void main(String[] args) {
		PalaceDto palacedto1=new PalaceDto("Mysore palace", "Mysore", "Jaya chamaRajendra ", false, 100D);
		PalaceDto palacedto2=new PalaceDto("Banglore palace", "Banglore", "KrishanaRajaodeyar", false, 500D);
		PalaceDto palacedto3=new PalaceDto("Lalita Mahal palace", "Hubballi", "Vijay anand", false, 00D);
		PalaceDto palacedto4=new PalaceDto("Petro palace", "Marenahalli road", "Prashant ", true, 00D);
		PalaceDto palacedto5=new PalaceDto("Kamal mahal", "Dehali", "Jagadeesh", true, 5000D);
		
		Collection<PalaceDto> palace=new ArrayList<PalaceDto>();
		palace.add(palacedto1);
		palace.add(palacedto2);
		palace.add(palacedto3);
		palace.add(palacedto4);
		palace.add(palacedto5);
		
		
		palace.stream().filter((dto)->!dto.isDestroyed()).collect(Collectors.toSet()).forEach(dto->System.out.println(dto));


	}

}
