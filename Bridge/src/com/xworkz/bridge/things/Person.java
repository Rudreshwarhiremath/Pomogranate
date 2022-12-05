package com.xworkz.bridge.things;

public abstract class Person {
	private String name;
	private int age;
	private long mobileNo;
	private String dateofbirth;
	private int passout;

	abstract boolean eat();

	abstract boolean sleep();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public int getPassout() {
		return passout;
	}

	public void setPassout(int passout) {
		this.passout = passout;
	}

}
