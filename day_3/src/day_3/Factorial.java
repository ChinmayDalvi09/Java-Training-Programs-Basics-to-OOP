package day_3;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		
		//foactorial using For loop
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int num1 = sc.nextInt();
		int fact1=1;
		for(int i=2;i<=num1;i++) {
			fact1=fact1*i;
		}
		System.out.println(fact1);
		
		//factorial using while loop
		
		System.out.println("Enter 2nd number:");
		int num2 = sc.nextInt();
		int fact2=1;
		while(num2!=0) {
			
			fact2=fact2*num2;
			num2--;
			
		}
		System.out.println(fact2);
	}

}
