package com.capgemini;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class FlightCollection {
	ArrayList<FlightPojo>flightList=new ArrayList<FlightPojo>();
	public  void addFlightDetails(FlightPojo flight)
	{
		
		flightList.add(flight);
		
	}
	public  ArrayList<FlightPojo> getFlightDetails()
	{
		return flightList;
	}
	public  FlightPojo getFlightDetailsByFlightNo(int flightNo)
	{
		for(FlightPojo flight:flightList)
		{
			if(flight.getFlightNo()==flightNo)
				return flight;
		}
		throw new RuntimeException("Flight No. does not exists");	
	}
	public  ArrayList<FlightPojo> removeFlightDetails(int flightNo)
	{
		for(FlightPojo flight:flightList)
		{
			if(flight.getFlightNo()==flightNo)
			{
				flightList.remove(flight);
				return flightList;
			}
		}
		throw new RuntimeException("Flight No. does not exists");	
	}
	public ArrayList<FlightPojo> updateFlightDetailsByArrivalDeparture(int flightNo,int arrivalTime,int deptaureTime)
	{
		for(FlightPojo flight:flightList)
		{
			if(flight.getFlightNo()==flightNo)
			{
				flight.setArrivalTime(arrivalTime);
				flight.setDeptaureTime(deptaureTime);
				return flightList;
			}
		}
		throw new RuntimeException("Flight No. does not exists");
}
	public ArrayList<FlightPojo> updateFlightDetailsByDestination(int flightNo,String destination)
	{
		for(FlightPojo flight:flightList)
		{
			if(flight.getFlightNo()==flightNo)
			{
				flight.setDestination(destination);
				return flightList;
			}
		}
		throw new RuntimeException("Flight No. does not exists");
}
	public  ArrayList<FlightPojo> sortByCost(String origin,String destination)
	{
		flightList.sort(Comparator.comparingDouble(FlightPojo::getCost));
		ArrayList<FlightPojo> flights=new ArrayList<FlightPojo>();
		for(FlightPojo flight:flightList)
		{
			if(flight.getOrigin().equals(origin) && flight.getDestination().equals(destination))
				flights.add(flight);
		}
		if(!flights.isEmpty())
			return flights;
		
			throw new RuntimeException("No such flights");
		
}
	public  ArrayList<FlightPojo> sortByRouteTime(String origin,String destination)
	{
		flightList.sort((flight1,flight2)->flight1.getRouteTime()-flight2.getRouteTime());
		ArrayList<FlightPojo> flights=new ArrayList<FlightPojo>();
		for(FlightPojo flight:flightList)
		{
			if(flight.getOrigin().equals(origin) && flight.getDestination().equals(destination))
				flights.add(flight);
		}
		if(!flights.isEmpty())
			return flights;
			
		throw new RuntimeException("No such flights");
		
}
	public  ArrayList<FlightPojo> sortByMorningFlights(String origin,String destination)
	{

		ArrayList<FlightPojo> flights=new ArrayList<FlightPojo>();
		for(FlightPojo flight:flightList)
		{
			if(flight.getOrigin().equals(origin) && flight.getDestination().equals(destination)
					&& flight.getDeptaureTime()>600 && flight.getDeptaureTime()<1200)
				flights.add(flight);
		}
		if(!flights.isEmpty())
			return flights;
			
				throw new RuntimeException("No such flights");
		
}
}
