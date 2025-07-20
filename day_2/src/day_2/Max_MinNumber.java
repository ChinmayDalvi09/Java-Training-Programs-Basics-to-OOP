package day_2;
import java.util.Scanner;

public class Max_MinNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first number");
	int a=sc.nextInt();
	System.out.println("enter second number");
	int b=sc.nextInt();
	System.out.println("enter third number");
	int c=sc.nextInt();
	int max=(a>b)?(a>c?a:c):(b>c?b:c);
	System.out.println(max);
}
}