package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.things.Sound;
import com.xworkz.encapsulation.things.Speakers;

public class SpeakersRunner {

	public static void main(String[] args) {
		Speakers song=new Speakers();
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
		Sound sing=new Sound();
 		sing.show();
	}

}
