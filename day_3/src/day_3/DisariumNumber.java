package day_3;

import java.util.Scanner;

public class DisariumNumber {
	public static int CountDigits(int num) //static method
	{
		int count=0;
		while(num>0) {
		count++;
		num=num/10;
		}
		return count;
	}
	
	public static boolean isDisarium(int num)
	{
		int totalDigits= CountDigits(num);  //called static method
		int sum=0;
		int temp=num;
			while(temp>0) {
				int last=temp%10;
				sum=(int)(sum+Math.pow(last, totalDigits));
				totalDigits--;
				temp=temp/10;
			}
			return sum==num;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number here");
		int num = sc.nextInt();
		if(isDisarium(num)) {
			System.out.println(num +" is disarium number");
		}
		else {
			System.out.println(num+" not disarium number");
		}
	}
}
