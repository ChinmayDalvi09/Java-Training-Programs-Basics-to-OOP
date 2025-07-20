package day_14;

import java.util.Scanner;

public class Harshad_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		main(10, 40);
		System.out.println("enter number here:");
		int num= sc.nextInt();
		int sum = 0;
		int org=num;
		while(num>0) {
			int last=num%10;
			sum=sum+last;
			num=num/10;
		}
		if(org%sum==0) {
			System.out.println(org+" is Harshad number");
		}
		else {
			System.out.println(org+ " is not harshad number");
		}
	}
	
	public static void main(int a , int b)  // this only checking for main() method allows overloading or not
	{
		System.out.println(a+b);
	}

}
