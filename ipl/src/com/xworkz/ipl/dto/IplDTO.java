package com.xworkz.ipl.dto;

public class IplDTO extends AbstractAuditDto {
	
	private String teamName;
	private String capitinName;
	private boolean ownerAlive;
	private double purse;
	private int wins;
	private int defeats;
	
	
	public IplDTO() {
		super();
	}


	@Override
	public String toString() {
		return "IplDTO [teamName=" + teamName + ", capitinName=" + capitinName + ", ownerAlive=" + ownerAlive
				+ ", purse=" + purse + ", wins=" + wins + ", defeats=" + defeats + "]";
	}


	public String getTeamName() {
		return teamName;
	}


	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	public String getCapitinName() {
		return capitinName;
	}


	public void setCapitinName(String capitinName) {
		this.capitinName = capitinName;
	}


	public boolean isOwnerAlive() {
		return ownerAlive;
	}


	public void setOwnerAlive(boolean ownerAlive) {
		this.ownerAlive = ownerAlive;
	}


	public double getPurse() {
		return purse;
	}


	public void setPurse(double purse) {
		this.purse = purse;
	}


	public int getWins() {
		return wins;
	}


	public void setWins(int wins) {
		this.wins = wins;
	}


	public int getDefeats() {
		return defeats;
	}


	public void setDefeats(int defeats) {
		this.defeats = defeats;
	}
	
	

}
