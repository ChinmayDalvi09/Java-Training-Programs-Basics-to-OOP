package day_3;

public class RangeLeap {
	public static void main(String[] args) {
		int year;
		System.out.println("All leap years between 2000 to 2050");
		for(year=2000;year<=2050;year++) {
			if(isLeapYear(year))
				System.out.print(year+", ");
		}
		
	}
	public static boolean isLeapYear(int year) {
		if((year%4==0 && year%100!=0) || (year%400==0)) 
			return true;
		else
			return false;
	}

}
