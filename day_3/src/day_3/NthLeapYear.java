package day_3;

import java.util.Scanner;

public class NthLeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the nth value");
		int n= sc.nextInt();
		int count=0;
		int year=1;
		while(true) {
			if(isLeapYear(year)) {
				count++;
				if(count==n) {
					System.out.println("The "+n+"th leap year is "+year);
					break;
				}
				
			}
			year++;
		}
		
	}
	public static boolean isLeapYear(int year) {
		if((year%4==0 && year%100!=0) ||(year%400==0))
			return true;
		else
			return false;
	}

}
