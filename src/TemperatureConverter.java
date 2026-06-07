import java.util.Scanner;

public class TemperatureConverter {

    public static double convertTemperature(double temperature, String unit) {

        // If the unit is Celsius, convert to Fahrenheit
        if (unit.equals("C")) {
            double fahrenheit = (temperature * 9 / 5) + 32;
            return fahrenheit;
        }

        // If the unit is Fahrenheit, convert to Celsius
        else if (unit.equals("F")) {
            double celsius = (temperature - 32) * 5 / 9;
            return celsius;
        }

        // If the unit is Kelvin, convert to Celsius
        else if (unit.equals("K")) {
            double celsius = temperature - 273.15;
            return celsius;
        }

        // If we don't recognize the unit, just return 0
        else {
            System.out.println("Sorry, I don't recognize that unit.");
            return 0.0;
        }
    }

    public static void main(String[] args) {

        // Create a scanner so we can read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a temperature number
        System.out.print("Enter the temperature: ");
        double temperature = scanner.nextDouble();

        // Ask the user what unit the temperature is in
        System.out.print("Enter the unit (C, F, or K): ");
        String unit = scanner.next();

        // Call our convert method and save the result
        double result = convertTemperature(temperature, unit);

        // Print the result with a simple message
        if (unit.equals("C")) {
            System.out.println(temperature + " Celsius = " + result + " Fahrenheit");
        }
        else if (unit.equals("F")) {
            System.out.println(temperature + " Fahrenheit = " + result + " Celsius");
        }
        else if (unit.equals("K")) {
            System.out.println(temperature + " Kelvin = " + result + " Celsius");
        }

        // Close the scanner when we are done
        scanner.close();
    }
}
