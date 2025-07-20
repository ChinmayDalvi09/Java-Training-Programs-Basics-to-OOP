package day6;

import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n to get nth leap year: ");
        int n = sc.nextInt();

        int year = 1, count = 0;

        while (count < n) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                count++;
            year++;
        }

        System.out.println("The " + n + "th leap year is: " + (year - 1));
    }
}

