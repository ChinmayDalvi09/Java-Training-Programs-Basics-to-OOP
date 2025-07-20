package day_1;
import java.util.Scanner;

public class StudForm {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("welcom to student form");
		System.out.println("Enter your name:");
		String name=sc.nextLine();
		
		System.out.println("Enter your roll no:");
		int rollno=sc.nextInt();
		
		System.out.println("Enter your Mobile number");
		String mobnum=sc.nextLine();
		sc.nextLine();
		System.out.println("enter your percentage:");
		double per= sc.nextDouble();
		System.out.print("enter your blood group:");
		String bg=sc.next();
		
		System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollno);
        System.out.println("Mobile Number: " + mobnum);
        System.out.println("Percentage: " + per);
        System.out.println("Blood Group: " +  bg);
	}

}