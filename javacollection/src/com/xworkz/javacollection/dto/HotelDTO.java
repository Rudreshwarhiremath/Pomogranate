package com.xworkz.javacollection.dto;

public class HotelDTO  implements Comparable<HotelDTO> {
	private String name;
	private String location;
	private String spcailty;
	private long mobileno;
	private int code;

	public HotelDTO() {
		// TODO Auto-generated constructor stub
	}

	public HotelDTO(String name, String location, String spcailty, long mobileno, int code) {
		super();
		this.name = name;
		this.location = location;
		this.spcailty = spcailty;
		this.mobileno = mobileno;
		this.code = code;
	}

	@Override
	public String toString() {
		return "HotelDTO [name=" + name + ", location=" + location + ", spcailty=" + spcailty + ", mobileno=" + mobileno
				+ ", code=" + code + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof HotelDTO) {
				HotelDTO dto = (HotelDTO) obj;
				if (dto.name.contains(this.name)) {
					System.out.println("name is matching" + dto);
					return true;
				} else {
					System.out.println("name is not matching");
				}
			}
		}
		return false;

	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 44;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getSpcailty() {
		return spcailty;
	}

	public void setSpcailty(String spcailty) {
		this.spcailty = spcailty;
	}

	public long getMobileno() {
		return mobileno;
	}

	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	@Override
	public int compareTo(HotelDTO o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
