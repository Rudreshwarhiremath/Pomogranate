package com.xworkz.ipl.repository;

import com.xworkz.ipl.dto.IplDTO;

public interface IplRepository {

	boolean create(IplDTO dto);

	default int total() {
		return 0;
	}

	default IplDTO foundByTeamName(String name) {
		return null;
	}

	default IplDTO foundByCapitanName(String value) {
		return null;
	}
}
