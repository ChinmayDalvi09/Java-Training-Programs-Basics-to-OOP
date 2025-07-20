package oop;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter vehicle  (bike/auto/sedan/suv)");
		String VehicleType=sc.nextLine();
		
		System.out.println("enter distance in km");
		double distance=sc.nextDouble();
	    
		System.out.println("enter time of day (day/night)");
		String timeofDay=sc.next();
		
		System.out.println("is is festive period? (true/false)");
		boolean isFestive=sc.nextBoolean();
		
		System.out.println("is a member? (true/false)");
		boolean isMember=sc.nextBoolean();
		
		System.out.println("is bad weather? (true/false)");
		boolean isBadWeather=sc.nextBoolean();
		
		Ride ride=RideFactory.GetRide(VehicleType, distance);
		
		double baseFare=ride.CalculateBaseFare();
		
		TimeBasedFare timeFareStrategy;
		if(timeofDay.equalsIgnoreCase("Night")) {
			timeFareStrategy=new NightFareStrategy();
		}
		else {
			timeFareStrategy= new DayFareStrategy();
		}
		double timeAdjustedFare=timeFareStrategy.applyTimeFare(baseFare);
		
		double finalFare=FareCalculator.calculateFinalFare(timeAdjustedFare, isFestive, isMember, isBadWeather);
		
		System.out.printf("Base fare: rs%,2f\n",baseFare);
		System.out.printf("After time modifire: rs%,2f\n",timeAdjustedFare);
		System.out.printf("Final fare: rs%,2f\n",finalFare);
	}

}
