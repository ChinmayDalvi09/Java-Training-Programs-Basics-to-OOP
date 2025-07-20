package oop;

class BikeRide extends Ride {

	public BikeRide(double distance) {
		super(distance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double CalculateBaseFare() {
		// TODO Auto-generated method stub
		return distance*5.0;
	}

}

class AutoRide extends Ride{

	public AutoRide(double distance) {
		super(distance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double CalculateBaseFare() {
		// TODO Auto-generated method stub
		return distance*8.0;
	}
	
}

class SedanRide extends Ride{

	public SedanRide(double distance) {
		super(distance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double CalculateBaseFare() {
		// TODO Auto-generated method stub
		return distance*12.0;
	}
	
}

class SuvRide extends Ride{

	public SuvRide(double distance) {
		super(distance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double CalculateBaseFare() {
		// TODO Auto-generated method stub
		return distance*15.0;
	}
	
}
