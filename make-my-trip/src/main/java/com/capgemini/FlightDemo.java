package com.capgemini;

public class FlightDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlightCollection flight=new FlightCollection();
		flight.addFlightDetails(new FlightPojo(101,"Air India",700,1000,5000,"Bangalore","Kolkata"));
		flight.addFlightDetails(new FlightPojo(103,"Spice Jet",1300,1500,6500,"Mumbai","Kolkata"));
		flight.addFlightDetails(new FlightPojo(102,"Spice Jet",1400,1700,6000,"Mumbai","Kolkata"));
		flight.addFlightDetails(new FlightPojo(104,"Indigo",1100,1400,7000,"Chennai","Kolkata"));
		
		System.out.println("List of flights:");
		for(FlightPojo f:flight.getFlightDetails())
			System.out.println(f);
		
		System.out.println("\nUpdate destination:");
		for(FlightPojo f:flight.updateFlightDetailsByDestination(104, "Bangalore"))
			System.out.println(f);
		
		System.out.println("\nUpdate Time:");
		for(FlightPojo f:flight.updateFlightDetailsByArrivalDeparture(104, 1000, 700))
			System.out.println(f);
		
		System.out.println("\nDeletion:");
		for(FlightPojo f:flight.removeFlightDetails(104))
			System.out.println(f);
		
		System.out.println("\nSorting by Cost:");
		for(FlightPojo f:flight.sortByCost("Mumbai", "Kolkata"))
			System.out.println(f);
	
		System.out.println("\nSorting by Duration:");
		for(FlightPojo f:flight.sortByRouteTime("Mumbai", "Kolkata"))
			System.out.println(f);
		
		System.out.println("\nSorting by Morning flights:");
		for(FlightPojo f:flight.sortByMorningFlights("Mumbai", "Kolkata"))
			System.out.println(f);
		
		
		
		

	}

}
