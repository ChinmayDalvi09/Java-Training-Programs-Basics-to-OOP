package oop;

public interface TimeBasedFare {
	double applyTimeFare(double baseFare);

}

class DayFareStrategy implements TimeBasedFare{
	
	public double applyTimeFare(double baseFare) {
		return baseFare;
	}
}

class NightFareStrategy implements TimeBasedFare{
	
	public double applyTimeFare(double baseFare) {
		return baseFare*1.2;
	}
}
