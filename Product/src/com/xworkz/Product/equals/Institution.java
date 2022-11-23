package com.xworkz.Product.equals;

public class Institution {
	private String name;
	private String type;
	private String location;
	private String dist;
	private String state;
	private String trustName;
	private String owner;
	private String age;
	private String earning;
	private String strength;
	
	public Institution() {
		System.out.println("default constructor of institution");	}

	public Institution(String name, String type, String location, String dist, String state, String trustName,
			String owner, String age, String earning, String strength) {
		super();
		this.name = name;
		this.type = type;
		this.location = location;
		this.dist = dist;
		this.state = state;
		this.trustName = trustName;
		this.owner = owner;
		this.age = age;
		this.earning = earning;
		this.strength = strength;
	}

	@Override
	public String toString() {
		return "Institution [name=" + name + ", type=" + type + ", location=" + location + ", dist=" + dist + ", state="
				+ state + ", trustName=" + trustName + ", owner=" + owner + ", age=" + age + ", earning=" + earning
				+ ", strength=" + strength + "]";
	}

	@Override
	public boolean equals(Object others) {
		if (others instanceof Institution) {
			Institution casted = (Institution) others;
			if (this.age.equals(casted.age) && (this.dist.equals(casted.dist)
					&& (this.earning.equals(casted.earning) && (this.type.equals(casted.type)
							&& (this.location.equals(casted.location) && (this.name.equals(casted.name))))))) {
				return true;
			} else {
				System.err.println("Not all ok plz check");
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

	public String getTrustName() {
		return trustName;
	}

	public void setTrustName(String trustName) {
		this.trustName = trustName;
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

	public String getStrength() {
		return strength;
	}

	public void setStrength(String strength) {
		this.strength = strength;
	}

	
}
