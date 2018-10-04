package com.capgemini;

public class FlightPojo {
	private int flightNo;
	private String airlines;
	private int deptaureTime;
	private int arrivalTime;
	private double cost;
	private String origin;
	private String destination;
	private int routeTime;
	public FlightPojo() {
		super();
	}
	public FlightPojo(int flightNo, String airlines, int deptaureTime,
			int arrivalTime, double cost, String origin, String destination) {
		super();
		this.flightNo = flightNo;
		this.airlines = airlines;
		this.deptaureTime = deptaureTime;
		this.arrivalTime = arrivalTime;
		this.cost = cost;
		this.origin = origin;
		this.destination = destination;
		this.routeTime = arrivalTime-deptaureTime;
		if(routeTime<0) routeTime+=24;
	}
	public int getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(int flightNo) {
		this.flightNo = flightNo;
	}
	public String getAirlines() {
		return airlines;
	}
	public void setAirlines(String airlines) {
		this.airlines = airlines;
	}
	public int getDeptaureTime() {
		return deptaureTime;
	}
	public void setDeptaureTime(int deptaureTime) {
		this.deptaureTime = deptaureTime;
	}
	public int getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(int arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getRouteTime() {
		return routeTime;
	}
	public void setRouteTime(int routeTime) {
		this.routeTime = routeTime;
	}
	@Override
	public String toString() {
		return "FlightPojo [flightNo=" + flightNo + ", airlines=" + airlines
				+ ", deptaureTime=" + deptaureTime + ", arrivalTime="
				+ arrivalTime + ", cost=" + cost + ", origin=" + origin
				+ ", destination=" + destination + ", routeTime=" + routeTime
				+ "]";
	}
	
	
}
