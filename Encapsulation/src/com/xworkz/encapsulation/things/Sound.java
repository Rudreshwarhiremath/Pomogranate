package com.xworkz.encapsulation.things;

public class Sound {
	Speakers song=new Speakers();
	public void show() {
		song.setSets(6);
		song.setInputs(15);
		song.setOutputs(5);
		song.setName("LG");
		song.setColour("White");
		song.setRate(9999);
		song.setCoverArea(20);
		song.setLocation("Office");
		song.setOwner("Siddu");
		song.setNice(true);
		song.setBrand(true);
		System.out.println(song.getSets());
		System.out.println(song.getInputs());
		System.out.println(song.getOutputs());
		System.out.println(song.getName());
		System.out.println(song.getColour());
		System.out.println(song.getRate());
		System.out.println(song.getCoverArea());
		System.out.println(song.getLocation());
		System.out.println(song.getOwner());
		System.out.println(song.isNice());
		System.out.println(song.isBrand());

	}

}
