package com.xworkz.Product.equals;

public class God {
	private String name;
	private String gender;
	private String location;
	private String temple;
	private String weapen;
	private String purpose;
	private String dist;
	private String state;
	private String village;
	private String swaroop;

	public God(String name, String gender, String location, String temple, String weapen, String purpose, String dist,
			String state, String village, String swaroop) {
		super();
		this.name = name;
		this.gender = gender;
		this.location = location;
		this.temple = temple;
		this.weapen = weapen;
		this.purpose = purpose;
		this.dist = dist;
		this.state = state;
		this.village = village;
		this.swaroop = swaroop;
	}

	@Override
	public String toString() {
		return "God [name=" + name + ", gender=" + gender + ", location=" + location + ", temple=" + temple
				+ ", weapen=" + weapen + ", purpose=" + purpose + ", dist=" + dist + ", state=" + state + ", village="
				+ village + ", swaroop=" + swaroop + "]";
	}

	@Override
	public boolean equals(Object others) {
		if (others instanceof God) {
			System.out.println("check the properties");
			God casted = (God) others;
			if (this.name.equals(casted.name)
					&& (this.temple.equals(casted.temple) && (this.gender.equals(casted.gender)
							&& (this.location.equals(casted.location) && (this.weapen.equals(casted.weapen)))))) {
				System.out.println("all ok");
				return true;
			} else {
				System.err.println("not all ok");
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getTemple() {
		return temple;
	}

	public void setTemple(String temple) {
		this.temple = temple;
	}

	public String getWeapen() {
		return weapen;
	}

	public void setWeapen(String weapen) {
		this.weapen = weapen;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
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

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getSwaroop() {
		return swaroop;
	}

	public void setSwaroop(String swaroop) {
		this.swaroop = swaroop;
	}

}
