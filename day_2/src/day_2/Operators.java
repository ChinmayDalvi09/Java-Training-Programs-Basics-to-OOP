package day_2;
import java.util.Scanner;

public class Operators {
	static void op(int a,int b) {
		System.out.println("unary used:");
		System.out.println(++a);
		System.out.println(++b);
		System.out.println("binary used:");
		System.out.println(a+b);
		int max=(a>b)?a:b;
		System.out.println("ternary used");
		System.out.println(max);
		
	}
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter 1st number");
	int num1=sc.nextInt();
	System.out.println("enter 2nd number");
	int num2=sc.nextInt();
	op(num1, num2);
	sc.close();
}
}