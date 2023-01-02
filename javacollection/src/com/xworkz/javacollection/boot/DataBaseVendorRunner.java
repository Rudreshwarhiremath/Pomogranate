package com.xworkz.javacollection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.javacollection.constant.Type;
import com.xworkz.javacollection.dto.DataBaseVendorDTO;

public class DataBaseVendorRunner {

	public static void main(String[] args) {
		DataBaseVendorDTO database1 = new DataBaseVendorDTO("System software", "MicroSoft", 1200D, 150000,
				Type.MICROSOFT_ACCESS);
		DataBaseVendorDTO database2 = new DataBaseVendorDTO("SQL", "MicroSoft", 100D, 120000, Type.MICROSOFT_SQL);
		DataBaseVendorDTO database3 = new DataBaseVendorDTO("RDBMS", "Oracle", 00D, 150000, Type.ORACLE);
		DataBaseVendorDTO database4 = new DataBaseVendorDTO("DB2 UDB", "IBM", 1200D, 150000, Type.IBM);
		DataBaseVendorDTO database5 = new DataBaseVendorDTO("SQL server", "MicroSoft", 100D, 120000,
				Type.MICROSOFT_SQL);

		Collection<DataBaseVendorDTO> data = new ArrayList<DataBaseVendorDTO>();
		data.add(database5);
		data.add(database4);
		data.add(database3);
		data.add(database2);
		data.add(database1);

		data.stream().map(dto -> dto.getDevelopedBy()).collect(Collectors.toList())
				.forEach(dto -> System.out.println(dto.toUpperCase()));
		System.out.println(System.lineSeparator());
		data.stream().filter((dto) -> dto.getLicenseCost() >= 100D && dto.getName().contains("SQL"))
				.collect(Collectors.toSet()).forEach(value -> System.out.println(value));
		System.out.println(System.lineSeparator());
		data.stream().map(dto -> dto.getType()).collect(Collectors.toSet())
				.forEach(variable -> System.err.println(variable));
	}

}
