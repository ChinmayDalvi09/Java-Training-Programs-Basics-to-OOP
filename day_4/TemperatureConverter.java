import java.util.Scanner;

public class TemperatureConverter {

    // Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double c) {
        return (c * 9/5) + 32;
    }

    // Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5/9;
    }

    // Kelvin to Fahrenheit
    public static double kelvinToFahrenheit(double k) {
        return (k - 273.15) * 9/5 + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Temperature Converter ---");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Kelvin to Fahrenheit");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            double inputTemp, result;

            switch(choice) {
                case 1:
                    System.out.print("Enter temperature in Celsius: ");
                    inputTemp = sc.nextDouble();
                    result = celsiusToFahrenheit(inputTemp);
                    System.out.println("Fahrenheit = " + result);
                    break;

                case 2:
                    System.out.print("Enter temperature in Fahrenheit: ");
                    inputTemp = sc.nextDouble();
                    result = fahrenheitToCelsius(inputTemp);
                    System.out.println("Celsius = " + result);
                    break;

                case 3:
                    System.out.print("Enter temperature in Kelvin: ");
                    inputTemp = sc.nextDouble();
                    result = kelvinToFahrenheit(inputTemp);
                    System.out.println("Fahrenheit = " + result);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again!");
            }

        } while(choice != 4);

        sc.close();
    }
}
