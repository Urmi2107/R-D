package com.capgemini.parking_lot;

import java.time.LocalTime;

import org.junit.Assert;
import org.junit.Test;

public class ParkingMapTest {
	@Test
	public void addCarParking()
	{
		ParkingMap parkingMap=new ParkingMap();
		LocalTime time = LocalTime.now();
		Customer customer =new Customer("Urmi", "8943250990",time.toString());
		Assert.assertEquals(new Parking(0, 0, 0),parkingMap.addCarParking(customer));
	}
	

}
