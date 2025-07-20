package day_1;
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		String rev="";
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string here");
		String str= sc.nextLine();
		int length = str.length();
		for(int i= length-1; i>=0; i--) 
		 rev=rev+str.charAt(i);
		 if(str.equals(rev)) {
			 System.out.println("string "+ str+ " is palindrome");
		 }
		 else {
			 System.out.println("string "+str+" is not palindrome");
		 }
	 

   }
}
