package com.xworkz.javacollection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.javacollection.dto.GameDto;

public class GameRunnner {

	public static void main(String[] args) {
		GameDto gameDto1=new GameDto("KhoKho","OutDoor",12);
		GameDto gameDto2=new GameDto("Kabaddi","Indoor",8);
		GameDto gameDto3=new GameDto("Really","OutDoor",12);
		GameDto gameDto4=new GameDto("WallyBall","OutDoor",12);
		
		Collection<GameDto> collection=new ArrayList<GameDto>();
		collection.add(gameDto4);
		collection.add(gameDto3);
		collection.add(gameDto2);
		collection.add(gameDto1);
		
		boolean equal1=collection.contains(gameDto4);
		System.out.println("Contain  result:"+equal1);
		System.out.println(gameDto4);
		System.out.println(System.lineSeparator());
		boolean equal2=collection.contains(gameDto3);
		System.out.println("Contain  result:"+equal2);
		System.out.println(gameDto3);
		System.out.println(System.lineSeparator());
		boolean equal3=collection.contains(gameDto2);
		System.out.println("Contain  result:"+equal3);
		System.out.println(gameDto2);
		System.out.println(System.lineSeparator());
		boolean equal4=collection.contains(gameDto1);
		System.out.println("Contain  result:"+equal4);
		System.out.println(gameDto1);
	}

}
