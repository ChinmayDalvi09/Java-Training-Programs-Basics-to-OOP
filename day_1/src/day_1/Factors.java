package day_1;

import java.util.Scanner;

public class Factors {
	public static void main(String[] args) {
		System.out.println("--Program to find factors--");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number here:");
		int num = sc.nextInt();
		System.out.println("Factors are:");
		for(int i=1; i<=num;i++) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
	}

}
