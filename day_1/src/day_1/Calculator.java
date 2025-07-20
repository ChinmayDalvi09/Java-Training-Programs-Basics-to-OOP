package day_1;

import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args)
    {
        
        double num1, num2;

        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers:");

        
        num1 = sc.nextDouble();
      
        num2 = sc.nextDouble();

        System.out.println("Enter the operator (+,-,*,/):");

        char op=sc.next().charAt(0);
        double ans = 0;

        switch (op) {
        																
        case '+':
        	ans = num1 + num2;
            break;

       
        case '-':
        	ans = num1 - num2;
            break;

       
        case '*':
        	ans = num1 * num2;
            break;

       
        case '/':
        	ans = num1 / num2;
            break;

       
        }

        System.out.println("The answer is:");
       
        System.out.println(num1 + " " + op + " " + num2 + " = " + ans);
    }
}