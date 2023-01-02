package com.xworkz.javacollection.dto;

import java.io.Serializable;

public class GameDto implements Serializable {
	private String name;
	private String type;
	private Integer totalPlayers;

	public GameDto() {
		// TODO Auto-generated constructor stub
	}

	public GameDto(String name, String type, Integer totalPlayers) {
		super();
		this.name = name;
		this.type = type;
		this.totalPlayers = totalPlayers;
	}

	@Override
	public String toString() {
		return "GameDto [name=" + name + ", type=" + type + ", totalPlayers=" + totalPlayers + "]";
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

	public Integer getTotalPlayers() {
		return totalPlayers;
	}

	public void setTotalPlayers(Integer totalPlayers) {
		this.totalPlayers = totalPlayers;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof GameDto) {
				GameDto dto = (GameDto) obj;
				if (dto.type.equals(this.type)) {
					System.out.println("type is matching  :" + dto);
					return true;
				} else {
					System.out.println("type is notMatching");
				}
			}
		}

		return false;
	}

}
