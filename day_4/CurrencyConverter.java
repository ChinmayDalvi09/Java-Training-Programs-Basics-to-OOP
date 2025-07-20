import java.util.Scanner;

public class CurrencyConverter {

    // Method to convert INR to other currencies
    public static void convertCurrency(double inr) {
        double usdRate = 0.012; // 1 INR = 0.012 USD
        double eurRate = 0.011; // 1 INR = 0.011 EUR
        double gbpRate = 0.0095; // 1 INR = 0.0095 GBP

        double usd = inr * usdRate;
        double eur = inr * eurRate;
        double gbp = inr * gbpRate;

        System.out.println("INR " + inr  +" = "+ usd+ " USD ");
        System.out.println("INR " + inr + " = "+eur + " EUR ");
        System.out.println("INR " + inr  + " = "+gbp+ " GBP ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount in INR: ");
        double inr = sc.nextDouble();

        convertCurrency(inr); // Call the conversion method

        sc.close();
    }
}
