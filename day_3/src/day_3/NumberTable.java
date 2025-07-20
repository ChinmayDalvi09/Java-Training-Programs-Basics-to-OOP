package day_3;

import java.util.Scanner;

public class NumberTable {
	public static void main(String[] args) {
		System.out.println("---Multiplication table---");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number here");
		int number = sc.nextInt();
		table(number);
		sc.close();
	}
	public static void table(int number) {
		System.out.println("Table of number "+number);
		for(int i=1;i<=10;i++) {
			System.out.println(number+" * "+i+" = "+(number*i));
		}
	}

}
