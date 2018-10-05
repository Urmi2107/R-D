package com.capgemini.parking_lot;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingMap {
	List<List<Map<Parking, Customer>>> parkingBuilding=new ArrayList<>(4);
	private int floor=0;
	private int section=0;
	private int compartment=0;
	
	public ParkingMap() {
		for(int floorIndex=0;floorIndex<4;floorIndex++)
			parkingBuilding.add(new ArrayList<Map<Parking,Customer>>(4));
		
		for(int floorIndex=0;floorIndex<4;floorIndex++)
		{
			for(int sectionIndex=0;sectionIndex<4;sectionIndex++)
			{
				parkingBuilding.get(floorIndex).add(new HashMap<Parking,Customer>(10));
			}
		}
			
		
	}

	public Parking addCarParking(Customer cust)
	{
		if(parkingBuilding.get(floor).get(section).size()==10)
		{
			section++;
			compartment=0;
		}
		if(section==4)
		{
			floor++;
			section=0;
			compartment=0;
		}
		if(floor==4)
			throw new RuntimeException("No more Floor available");
		Parking parkingId=new Parking(floor,section,compartment++);
		parkingBuilding.get(floor).get(section).put(parkingId,cust);
			
		
		return parkingId;
		
	}
	
	public Customer getDetailsByKey(Parking parkingId)
	{
		parkingId.setFloor(parkingId.getFloor()-1);
		parkingId.setSection(parkingId.getSection()-1);
		parkingId.setCompartment(parkingId.getCompartment()-1);
		Customer cust=parkingBuilding.get(parkingId.getFloor()).get(parkingId.getSection()).get(parkingId);
		return cust;
		
	}
	
	public static void main(String[] args)
	{
		ParkingMap parkingMap=new ParkingMap();
		LocalTime time = LocalTime.now();
		Customer customer =new Customer("Urmi", "8943250990",time.toString());
		Parking park=parkingMap.addCarParking(customer);
		System.out.println(park+" "+customer);
		
		 time = LocalTime.now();
		 customer =new Customer("Juin", "8943250988",time.toString());
		 park=parkingMap.addCarParking(customer);
		System.out.println(park+" "+customer);
		
		customer =new Customer("Kuheli", "8943330990",time.toString());
		park=parkingMap.addCarParking(customer);
		System.out.println(park+" "+customer);
		
		 customer =new Customer("Dhruba", "8911094444",time.toString());
		 park=parkingMap.addCarParking(customer);
		System.out.println(park+" "+customer);
		
		 customer =new Customer("Supriti", "9095808355",time.toString());
		 park=parkingMap.addCarParking(customer);
		System.out.println(park+" "+customer);
		
		 customer =new Customer("Swagata", "9095808351",time.toString());
		 park=parkingMap.addCarParking(customer);
		System.out.println(park+" "+customer);
		
		 customer =new Customer("Ashwini", "8995808355",time.toString());
		 park=parkingMap.addCarParking(customer);
		System.out.println(park+" "+customer);
		
		 customer =new Customer("Sayani", "9195808355",time.toString());
		 park=parkingMap.addCarParking(customer);
		System.out.println(park+" "+customer);
		
		 customer =new Customer("Sanu", "9999652999",time.toString());
		 park=parkingMap.addCarParking(customer);
		System.out.println(park+" "+customer);
		
		 customer =new Customer("Rajdeep", "9810101010",time.toString());
		 park=parkingMap.addCarParking(customer);
		System.out.println(park+" "+customer);
		
		 customer =new Customer("Ram", "9810101066",time.toString());
		 park=parkingMap.addCarParking(customer);
		System.out.println(park+" "+customer);
		
		System.out.println("\nGet customer details by Id:");
		Parking park1=new Parking(1, 1, 5);
		System.out.println(parkingMap.getDetailsByKey(park1));
	}
	

}
