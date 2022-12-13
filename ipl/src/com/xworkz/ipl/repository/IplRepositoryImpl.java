package com.xworkz.ipl.repository;

import com.xworkz.ipl.dto.IplDTO;
import com.xworkz.ipl.exception.iplDtoSizeException;

public class IplRepositoryImpl implements IplRepository {

	private IplDTO[] ipldto = new IplDTO[10];
	private int currentIndex = 0;

	@Override
	public boolean create(IplDTO dto) {
		System.out.println("running create of IpllDTO" + dto);
		if (this.currentIndex >= this.ipldto.length) {
			System.err.println("Size exceeded cannot add more ipl....");
			throw new iplDtoSizeException();
		}

		this.ipldto[this.currentIndex] = dto;
		this.currentIndex++;
		System.out.println("Saved-" + dto + "-in index-" + this.currentIndex);

		return true;
	}

	@Override
	public IplDTO foundByTeamName(String name) {
		System.out.println("Running found by team name.....");
		for (IplDTO ipldto : ipldto) {
			if (ipldto != null && ipldto.getTeamName().equalsIgnoreCase(name)) {
				System.out.println("ipl dto is found by teamname-" + name);
				return ipldto;
			}
		}
		System.out.println("no ipl dto found for team name");
		return IplRepository.super.foundByTeamName(name);
	}

	@Override
	public IplDTO foundByCapitanName(String value) {
		System.out.println("Running found by capitan name.....");
		for (IplDTO ipldto2 : ipldto) {
			if (ipldto2 != null && ipldto2.getCapitinName().equalsIgnoreCase(value)) {
				System.out.println("Ipl dto found by capitan name-" + value);
				return ipldto2;
			}
		}
		System.out.println("no ipl dto found for capitan name");
		return IplRepository.super.foundByCapitanName(value);
	}

	@Override
	public int total() {
		System.out.println("Total..");
		return currentIndex;
	}

}
