package day_7;

import java.util.Scanner;

public class EvenPrime {
	void is_even(int num) {
		if(num%2==0) {
			System.out.println(num+" even number");
		}
		else {
			System.out.println(num+" not even number");
		}
	}
	void is_prime(int num) {
		boolean is_prime=true;
		if(num<=1)
			is_prime=false;
		else {
		for(int i=2;i<=num-1;i++) {
			if(num%i==0) {
				is_prime=false;
				break;
			}
		}
		
		}
		if(is_prime) {
			System.out.println(num+" prime");
		}
		else {
			System.out.println(num+" not prime");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		EvenPrime ep = new EvenPrime();
		ep.is_even(num);
		ep.is_prime(num);
	}

}
