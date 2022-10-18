package com.xworkz.Product.boult;

public class FarmHouse {
	public String name;
	public String place;
	public double land;
	public int distance;
	public int workers;
	public String[] crops;
	public String[] animals;
	public String[] workersNames;
	public String[] plantsName;
	public int[] duration;
	public String[] equipments;

	public FarmHouse(String name, String place, double land, int distance, int workers, String[] crops,
			String[] animals, String[] workersNames, String[] plantsName, int[] duration, String[] equipments) {
		this.name = name;
		this.place = place;
		this.land = land;
		this.distance = distance;
		this.workers = workers;
		this.crops = crops;
		this.animals = animals;
		this.workersNames = workersNames;
		this.plantsName = plantsName;
		this.duration = duration;
		this.equipments = equipments;
	}

	public void reading() {
		System.out.println(name);
		System.out.println(place);
		System.out.println(land);
		System.out.println(distance);
		System.out.println(workers);
		for (int i = 0; i < crops.length; i++) {
			System.out.println("crops:" + crops[i]);
		}
		for (int i = 0; i < animals.length; i++) {
			System.out.println("animals:" + animals[i]);
		}
		for (int i = 0; i < workersNames.length; i++) {
			System.out.println("workersNames:" + workersNames[i]);
		}
		for (int i = 0; i < plantsName.length; i++) {
			System.out.println("plantsName:" + plantsName[i]);
		}
		for (int i = 0; i < duration.length; i++) {
			System.out.println("crops duration:" + duration[i]);
		}
		for (int i = 0; i < equipments.length; i++) {
			System.out.println("equipments:" + equipments[i]);
		}
	}

}
