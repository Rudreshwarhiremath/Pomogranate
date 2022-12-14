package com.xworkz.ipl.service;

import com.xworkz.ipl.constant.PizzaSize;
import com.xworkz.ipl.dto.PizzaDTO;

public class PizzaserviceImpli implements Pizzaservice {

	@Override
	public boolean validateAndSave(PizzaDTO dto) {
		System.out.println("validateAndSave is created..");
		String name = dto.getName();
		String compnay = dto.getCompnay();
		PizzaSize size = dto.getSize();
		// boolean cheese=dto.isCheese();
		double price = dto.getPrice();
		String flavour = dto.getFlavour();
		String type = dto.getType();
		boolean valideName = false;
		boolean valideCompnay = false;
		boolean valideSize = false;
		// boolean valideCheese=false;
		boolean validePrice = false;
		boolean valideFlavour = false;
		boolean valideType = false;
		if (name != null && name.length() > 4 && name.length() < 20) {
			System.out.println("Name is valide-" + name);
			valideName = true;
		} else {
			System.out.println("Name is not valide-" + name);
		}
		if (compnay != null && compnay.length() > 4 && compnay.length() < 20) {
			System.out.println("Compnay is valide-" + compnay);
			valideCompnay = true;
		} else {
			System.out.println("Compnay is not valide-" + compnay);
		}
		if (size != null) {
			System.out.println("Size is valide-" + size);
			valideSize = true;
		} else {
			System.out.println("Size is not valide" + size);
		}
		if (price != 00 && price > 50 && price < 2000) {
			System.out.println("Price is valide-" + price);
			validePrice = true;
		} else {
			System.out.println("Price is not valide-" + price);
		}
		if (flavour != null && flavour.length() > 3 && flavour.length() < 20) {
			System.out.println("Flavour is valide-" + flavour);
			valideFlavour = true;
		} else {
			System.out.println("Flavour is not valide" + flavour);
		}
		if (type != null && type == "VEG" || type == "NONVEG") {
			System.out.println("Type is valide-" + type);
			valideType = true;
		} else {
			System.out.println("Type is not valide..");
		}
		if (valideName && valideCompnay && validePrice && valideFlavour && valideSize && valideType) {
			System.out.println("Pizza DTO is Valide" + dto);
			return true;
		}
		System.out.println("Pizza DTO is not valide" + dto);
		return false;
	}

}
