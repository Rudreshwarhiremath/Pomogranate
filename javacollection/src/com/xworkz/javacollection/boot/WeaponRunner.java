package com.xworkz.javacollection.boot;

import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xworkz.javacollection.constant.WeaponType;
import com.xworkz.javacollection.dto.WeaponDTO;

public class WeaponRunner {

	public static void main(String[] args) {
		WeaponDTO weapon1 = new WeaponDTO("Khukri", "Nepal", 1950, 750D, WeaponType.KNIVES_BAYONETS);
		WeaponDTO weapon2 = new WeaponDTO("Glock knife", "Austria", 1990, 850D, WeaponType.KNIVES_BAYONETS);
		WeaponDTO weapon3 = new WeaponDTO("Glock", "Austria", 1994, 990D, WeaponType.KNIVES_BAYONETS);
		WeaponDTO weapon4 = new WeaponDTO("Pistol Auto 9mm", "India", 1975, 760D, WeaponType.SMALL_ARMS);
		WeaponDTO weapon5 = new WeaponDTO("Shot edge", "India", 1980, 880D, WeaponType.NONLINEAR_LINE_OF_SIGHT_WEAPONS);
		WeaponDTO weapon6 = new WeaponDTO("12 bore PAG", "India", 2000, 999D, WeaponType.SHOTGUNS);
		WeaponDTO weapon7 = new WeaponDTO("Micro Uzi", "Israle", 2005, 505D, WeaponType.SMG);
		WeaponDTO weapon8 = new WeaponDTO("Heckler", "West Germany", 2001, 6666D, WeaponType.SMG);
		WeaponDTO weapon9 = new WeaponDTO("Brugger", "Switzerland", 1990, 888D, WeaponType.SMG);
		WeaponDTO weapon10 = new WeaponDTO("SAF carbine", "India & UK", 2010, 1954D, WeaponType.SMG);
		WeaponDTO weapon11 = new WeaponDTO("1B1 INSAS", "India", 2005, 2000D, WeaponType.ASSAULT_RIFLES);
		WeaponDTO weapon12 = new WeaponDTO("AK 203", "India & Russia", 2006, 700D, WeaponType.ASSAULT_RIFLES);
		WeaponDTO weapon13 = new WeaponDTO("SIG 716i", "US", 2010, 300D, WeaponType.ASSAULT_RIFLES);
		WeaponDTO weapon14 = new WeaponDTO("M4 Carbine", "US", 1995, 500D, WeaponType.ASSAULT_RIFLES);
		WeaponDTO weapon15 = new WeaponDTO("T91 assault rifle", "Taiwan", 1999, 686D, WeaponType.ASSAULT_RIFLES);
		WeaponDTO weapon16 = new WeaponDTO("Shivalik", "India", 1940, 4047D, WeaponType.MINES);
		WeaponDTO weapon17 = new WeaponDTO("NSV machine gun", "India", 1999, 1000D, WeaponType.MACHINE_GUNSEXPLOSIVES);
		WeaponDTO weapon18 = new WeaponDTO("AKM", "Soviet Union", 2000, 2000D, WeaponType.SNIPER_RIFLES);
		WeaponDTO weapon19 = new WeaponDTO("Grenade", "India", 1976, 1547D, WeaponType.MINES);
		WeaponDTO weapon20 = new WeaponDTO("SIG Sauer SSG", "Germany", 2022, 200D, WeaponType.SNIPER_RIFLES);
		WeaponDTO weapon21 = new WeaponDTO("AK47", "Soviet Union", 2010, 14571D, WeaponType.SNIPER_RIFLES);

		Collection<WeaponDTO> value = Stream.of(weapon1, weapon2, weapon3, weapon4, weapon5, weapon6, weapon7, weapon8,
				weapon9, weapon10, weapon11, weapon12, weapon13, weapon14, weapon15, weapon16, weapon17, weapon18,
				weapon19, weapon20, weapon21).collect(Collectors.toList());

		value.stream().filter(ele -> ele.getPrice() > 500D).collect(Collectors.toList())
				.forEach(dto -> System.out.println(dto));
		System.out.println(System.lineSeparator());
		value.stream().forEach(ele -> System.err.println(ele.getMadeBy() + "---" + ele.getMadeOn()));
		System.out.println(System.lineSeparator());
		System.out.println("Printing all weapons dto sort by name in descind order");
		Comparator<WeaponDTO> dto = (a1, a2) -> a2.getName().compareToIgnoreCase(a1.getName());
		value.stream().sorted(dto).forEach(ele -> System.out.println(ele));
		System.out.println(System.lineSeparator());
		System.out.println("Printing all weapons dto sort by name in assending order");
		Comparator<WeaponDTO> dto1 = (a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName());
		value.stream().sorted(dto1).forEach(ele -> System.out.println(ele));
		System.out.println(System.lineSeparator());
		System.out.println("Printing all weapons dto sort by madeby in descind order");
		Comparator<WeaponDTO> dto2 = (a1, a2) -> a2.getMadeBy().compareToIgnoreCase(a1.getMadeBy());
		value.stream().sorted(dto2).forEach(ele -> System.out.println(ele));
		System.out.println(System.lineSeparator());
		System.out.println("Printing all weapons dto sort by madeby in assend order");
		Comparator<WeaponDTO> dto3 = (a1, a2) -> a1.getMadeBy().compareToIgnoreCase(a2.getMadeBy());
		value.stream().sorted(dto3).forEach(ele -> System.out.println(ele));
		System.out.println(System.lineSeparator());
		System.out.println("weapons dto sorting on madeon in assend order");
		Comparator<WeaponDTO> dto4 = (a1, a2) -> Double.compare(a1.getMadeOn(), a2.getMadeOn());
		value.stream().sorted(dto4).forEach(ele -> System.out.println(ele));
		System.out.println(System.lineSeparator());
		System.out.println("weapons dto sorting on madeon in dessend order");
		Comparator<WeaponDTO> dto5 = (a1, a2) -> Double.compare(a2.getMadeOn(), a1.getMadeOn());
		value.stream().sorted(dto5).forEach(ele -> System.out.println(ele));
		System.out.println(System.lineSeparator());
		System.out.println("weapons dto sorting on price in assend order");
		Comparator<WeaponDTO> dto6 = (a1, a2) -> Double.compare(a1.getPrice(), a2.getPrice());
		value.stream().sorted(dto6).forEach(ele -> System.out.println(ele));
		System.out.println(System.lineSeparator());
		System.out.println("weapons dto sorting on price in desend order");
		Comparator<WeaponDTO> dto7 = (a1, a2) -> Double.compare(a2.getPrice(), a1.getPrice());
		value.stream().sorted(dto7).forEach(ele -> System.out.println(ele));
		System.out.println(System.lineSeparator());
		System.out.println("weapons dto enum sort on assend order");
		Comparator<WeaponDTO> dto8 = (a1, a2) -> a1.getType().compareTo(a2.getType());
		value.stream().sorted(dto8).forEach(ele -> System.out.println(ele));
		System.out.println(System.lineSeparator());
		System.out.println("weapons dto enum sort on desend order");
		Comparator<WeaponDTO> dto9 = (a1, a2) -> a2.getType().compareTo(a1.getType());
		value.stream().sorted(dto9).forEach(ele -> System.out.println(ele));
		System.out.println(System.lineSeparator());
		System.out.println("print all weapons sort by name and madeon asending order");
		value.stream().sorted(dto1).forEachOrdered(ele -> System.out.println(ele.getName() + "--" + ele.getMadeOn()));
		System.out.println(System.lineSeparator());
		System.out.println("print all weapons sort by type and madeby, name in dsending order");
		value.stream().sorted(dto9).forEachOrdered(
				ele -> System.out.println(ele.getType() + "--" + ele.getMadeBy() + "--" + ele.getName()));

	}

}
