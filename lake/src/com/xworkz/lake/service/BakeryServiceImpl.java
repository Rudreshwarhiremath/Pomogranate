package com.xworkz.lake.service;

import com.xworkz.lake.dto.BakeryDTO;
import com.xworkz.lake.exception.inValideData;
import com.xworkz.lake.repositery.BakeryRepositery;

public class BakeryServiceImpl implements BakeryService {
	private BakeryRepositery bakeryRepositery;

	public BakeryServiceImpl(BakeryRepositery bakeryRepositery) {
		this.bakeryRepositery = bakeryRepositery;

	}

	@Override
	public boolean savedValideData(BakeryDTO dto) throws inValideData {
		String name = dto.getName();
		String owner = dto.getOwner();
		long contact = dto.getContact();
		String location = dto.getLocation();
		String famousFor = dto.getFamousFor();
		boolean valideName = false;
		boolean valideOwner = false;
		boolean valideContact = false;
		boolean valideLocation = false;
		boolean valideFamousFor = false;
		if (name != null && name.length() > 3 && name.length() < 20) {
			System.out.println("Name is valide" + name);
			valideName = true;
		} else {
			System.err.println("Data is in valide-" + name);
		}
		if (owner != null && owner.length() > 3 && owner.length() < 20) {
			System.out.println("owner is valide" + owner);
			valideOwner = true;
		} else {
			System.err.println("Data is in valide-" + owner);
		}
		if (contact != 0) {
			System.out.println("contact is valide" + contact);
			valideContact = true;
		} else {
			System.err.println("Data is in valide-" + contact);
		}
		if (location != null && location.length() > 3 && location.length() < 20) {
			System.out.println("location is valide" + location);
			valideLocation = true;
		} else {
			System.err.println("Data is in valide-" + location);
		}
		if (famousFor != null && famousFor.length() > 3 && famousFor.length() < 20) {
			System.out.println("famousFor is valide" + famousFor);
			valideFamousFor = true;
		} else {
			System.err.println("Data is in valide-" + famousFor);
		}
		if (valideContact && valideFamousFor && valideLocation && valideName && valideOwner) {
			System.out.println("Data is valide can save");
			boolean saved = this.bakeryRepositery.save(dto);
			return saved;
		}
		throw new inValideData("Check the given data");
	}

}
