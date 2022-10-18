package com.xworkz.Product.boultRunner;

import com.xworkz.Product.boult.FarmHouse;

public class FarmHouseRunner {

	public static void main(String[] args) {
		String[]crop= {"Pomogranate","Papya","DrumStick","SugureCane","Tomato"};
		String[] animal= {"Cow","Buffelow","Oxe","Dog","Cat"};
		String[] names= {"Sanju","Siddu","Jagappa","Vijaykumar"};
		String[] plants= {"Mango","Silveroka","Tick","Sandel","Lemon"};
		int[] duration={3,4,5,6,7};
		String[]equipmen= {"Tractor","miniTractor","Tiller","powerSpryer","GrassCutter","Etc.."};
		
		FarmHouse farming=new FarmHouse("BrandhaVana", "Bidar", 38, 785, 4, crop, animal, names, plants, duration, equipmen);
		farming.reading();

	}

}
