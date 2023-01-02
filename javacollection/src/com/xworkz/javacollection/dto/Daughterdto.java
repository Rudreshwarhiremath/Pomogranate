package com.xworkz.javacollection.dto;

public class Daughterdto {
	private String name;
	private long mobile;
	private int age;
	private boolean committed;
	private boolean alive;

	public Daughterdto() {
		// TODO Auto-generated constructor stub
	}

	public Daughterdto(String name, long mobile, int age, boolean committed, boolean alive) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.age = age;
		this.committed = committed;
		this.alive = alive;
	}

	@Override
	public String toString() {
		return "Daughterdto [name=" + name + ", mobile=" + mobile + ", age=" + age + ", committed=" + committed
				+ ", alive=" + alive + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isCommitted() {
		return committed;
	}

	public void setCommitted(boolean committed) {
		this.committed = committed;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

}
