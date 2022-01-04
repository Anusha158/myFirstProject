package com.level0.begineer.serialization;

public class Rooms {
	private String rmName;
	private int numberOfRooms;
	public Rooms(String string, int i) {
		// TODO Auto-generated constructor stub
	}
	public Rooms() {
		// TODO Auto-generated constructor stub
	}
	public String getRmName() {
		return rmName;
	}
	public void setRmName(String rmName) {
		this.rmName = rmName;
	}
	public int getNumberOfRooms() {
		return numberOfRooms;
	}
	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}
	@Override
	public String toString() {
		return "Rooms [rmName=" + rmName + ", numberOfRooms=" + numberOfRooms + "]";
	}
	
}
