package oop;

public class FareCalculator {
	public static double calculateFinalFare(double fare,boolean isFestive,boolean isMember, boolean isBadWeather) {
		if(isFestive) {
			fare=FestiveModifire.applyFestiveSurge(fare);
		}
		if(isMember) {
			fare=MembershipModifire.applymembershipDiscount(fare);
		}
		if(isBadWeather) {
			fare=WeatherModifire.applyWeatherAdjustment(fare);
		}
		return fare;
	}
}
