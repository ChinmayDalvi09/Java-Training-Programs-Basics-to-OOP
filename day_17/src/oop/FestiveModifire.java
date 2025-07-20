package oop;

public class FestiveModifire {
	public static double applyFestiveSurge(double fare) {
		return fare*1.3;
	}

}

class MembershipModifire{
	public static double applymembershipDiscount(double fare) {
		return fare*0.9;
	}
}

class WeatherModifire{
	public static double applyWeatherAdjustment(double fare) {
		return fare*1.1;
	}
}
