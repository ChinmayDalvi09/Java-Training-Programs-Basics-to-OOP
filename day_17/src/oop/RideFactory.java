package oop;

public class RideFactory {
	public static Ride GetRide(String vehicleType, double distance) {
		switch(vehicleType.toLowerCase()) {
		case "bike":
			return new BikeRide(distance);
		case "Auto":
			return new AutoRide(distance);
		case "Sedan":
			return new SedanRide(distance);
		case "suv":
			return new SuvRide(distance);
		default:
			throw new IllegalArgumentException("invalid vehicle type");
			
		}
	 
	}

}
