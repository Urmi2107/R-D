package com.capgemini.parking_lot;

public class Parking {
	private int floor;
	private int section;
	private int compartment;
	public Parking() {
		super();
	}
	public Parking(int floor, int section, int compartment) {
		super();
		this.floor = floor;
		this.section = section;
		this.compartment = compartment;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public int getSection() {
		return section;
	}
	public void setSection(int section) {
		this.section = section;
	}
	public int getCompartment() {
		return compartment;
	}
	public void setCompartment(int compartment) {
		this.compartment = compartment;
	}
	@Override
	public String toString() {
		return "Parking [floor=" + (floor+1) + ", section=" + (section+1)
				+ ", compartment=" + (compartment+1) + "]";
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (floor*100+section*10+compartment);
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.hashCode()==obj.hashCode();
	}
	
}
