package day_1;
import java.util.Scanner;
public class StudPerformance {
	public static void main(String[] args) {
		System.out.println("welcome to student report");
		Scanner sc= new Scanner(System.in);
		System.out.println("enter student percentages:");
		double per= sc.nextDouble();
		if(per>=60) {
			System.out.println("Distinction");
		}
		else if(per>=45 && per<60) {
			System.out.println("first class");
		}
		else if(per>28 && per<45) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
	}


}
