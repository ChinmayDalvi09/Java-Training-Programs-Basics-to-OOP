package oop;

abstract class Ride {
	protected double distance;
	
	public Ride(double distance) {
		this.distance=distance;
	}
	public abstract double CalculateBaseFare();
	
}



