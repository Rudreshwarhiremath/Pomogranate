package com.xworkz.ipl.service;

import com.xworkz.ipl.constant.Color;
import com.xworkz.ipl.constant.HelmateSize;
import com.xworkz.ipl.dto.HelmateDto;
import com.xworkz.ipl.repository.HelmateRepository;

public class HelmateServiceImpl implements HelmateService {
	
	private HelmateRepository helmateRepository;
	public HelmateServiceImpl(HelmateRepository  helmateRepository) {
		this.helmateRepository=helmateRepository;
	}

	@Override
	public boolean validateAndSave(HelmateDto helmateDto) {
		String brand = helmateDto.getBrand();
		Color color = helmateDto.getColor();
		HelmateSize helmateSize = helmateDto.getSize();
		Double price = helmateDto.getPrice();

		boolean valideBrand = false;
		boolean valideColor = false;
		boolean valideSize = false;
		boolean validePrice = false;

		if (brand != null && brand.length() >= 4 && brand.length() <= 10) {
			System.out.println("Brand is valide-" + brand);
			valideBrand = true;
		} else {
			System.err.println("Brand is not  valide-" + brand);
		}
		if (color != null) {
			System.out.println("color is valide-" + color);
			valideColor = true;
		} else {
			System.err.println("color is not  valide-" + color);
		}
		if (helmateSize != null) {
			System.out.println("helmateSize is valide-" + helmateSize);
			valideSize = true;
		} else {
			System.err.println("helmateSize is not  valide-" + helmateSize);
		}
		if (price != null && price > 100 && price < 12000) {
			System.out.println("price is valide" + price);
			validePrice = true;
		} else {
			System.err.println("price is not  valide-" + price);
		}
		if(valideBrand&&valideColor&&validePrice&&valideSize) {
			System.out.println("Helmate dto is valide can save using repository "+helmateDto);
			boolean saved=this.helmateRepository.save(helmateDto);
			System.out.println("Helmate dto is Saved-"+saved);
			return saved;
			
		}
		System.err.println("Helmate dto is not valide"+helmateDto);
		return false;
	}

}
