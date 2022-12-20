package com.xworkz.lake.repositery;

import com.xworkz.lake.dto.BakeryDTO;
import com.xworkz.lake.exception.sizeExcedException;

public class BakeryRepositeryImpl implements BakeryRepositery {
	private BakeryDTO[] bakerydto = new BakeryDTO[4];
	private int dataIndex = 0;

	@Override
	public boolean save(BakeryDTO dto) {
		if (dataIndex > bakerydto.length) {
			System.out.println("showing more dto"+bakerydto.length);
			throw new sizeExcedException(null);
		}
		this.bakerydto[this.dataIndex] = dto;
		dataIndex++;
		return false;
	}

}
