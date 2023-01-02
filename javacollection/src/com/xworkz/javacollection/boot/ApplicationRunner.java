package com.xworkz.javacollection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.javacollection.dto.ApplicatioDto;

public class ApplicationRunner {

	public static void main(String[] args) {
		ApplicatioDto applicationdto1 = new ApplicatioDto("Spread Sheet", 2.1, true, "google", 100D);
		ApplicatioDto applicationdto2 = new ApplicatioDto("Zomato", 4.7, false, "microsoft", 500D);
		ApplicatioDto applicationdto3 = new ApplicatioDto("flipcart", 5.8, false, "google", 100D);
		ApplicatioDto applicationdto4 = new ApplicatioDto("Amazon", 8.4, true, "amazone", 100D);
		ApplicatioDto applicationdto5 = new ApplicatioDto("Zoom", 1.1, true, "google", 100D);

		Collection<ApplicatioDto> application = new ArrayList<ApplicatioDto>();
		application.add(applicationdto1);
		application.add(applicationdto2);
		application.add(applicationdto3);
		application.add(applicationdto4);
		application.add(applicationdto5);

		application.stream().filter((dto) -> dto.isFree() && dto.getDevelopedBy() == "google")
				.collect(Collectors.toSet()).forEach(dto -> System.out.println(dto));
		System.out.println(System.lineSeparator());
		application.stream().filter(dto -> dto.getVersion() > 5).collect(Collectors.toSet())
				.forEach(dto -> System.out.println(dto.getName()));
	}

}
