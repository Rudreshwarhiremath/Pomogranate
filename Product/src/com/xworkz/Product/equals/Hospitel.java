package com.xworkz.Product.equals;

public class Hospitel {
	private String name;
	private String type;
	private String location;
	private String dist;
	private String state;
	private String specility;
	private String owner;
	private String age;
	private String earning;
	private String noOfDoctors;

	public Hospitel(String name, String type, String location, String dist, String state, String specility,
			String owner, String age, String earning, String noOfDoctors) {
		super();
		this.name = name;
		this.type = type;
		this.location = location;
		this.dist = dist;
		this.state = state;
		this.specility = specility;
		this.owner = owner;
		this.age = age;
		this.earning = earning;
		this.noOfDoctors = noOfDoctors;
	}

	@Override
	public String toString() {
		return "Hospitel [name=" + name + ", type=" + type + ", location=" + location + ", dist=" + dist + ", state="
				+ state + ", specility=" + specility + ", owner=" + owner + ", age=" + age + ", earning=" + earning
				+ ", noOfDoctors=" + noOfDoctors + "]";
	}

	@Override
	public boolean equals(Object others) {
		if (others instanceof Hospitel) {
			Hospitel casted = (Hospitel) others;
			if (this.age.equals(casted.age) && (this.dist.equals(casted.dist) && (this.earning.equals(casted.earning)
					&& (this.type.equals(casted.type) && (this.location.equals(casted.location)
							&& (this.name.equals(casted.name) && (this.noOfDoctors.equals(casted.noOfDoctors)))))))) {
				return true;
			} else {
				System.out.println("Plz check the values");
			}
			return false;
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDist() {
		return dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getSpecility() {
		return specility;
	}

	public void setSpecility(String specility) {
		this.specility = specility;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getEarning() {
		return earning;
	}

	public void setEarning(String earning) {
		this.earning = earning;
	}

	public String getNoOfDoctors() {
		return noOfDoctors;
	}

	public void setNoOfDoctors(String noOfDoctors) {
		this.noOfDoctors = noOfDoctors;
	}

}
