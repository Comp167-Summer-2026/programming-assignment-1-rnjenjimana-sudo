public class TemperatureConverter {

    public static double convertTemperature(double temperature, String unit) {

        // If the temperature is in Celsius, convert to Fahrenheit
        if (unit.equals("C")) {
            double result = (temperature * 9.0 / 5.0) + 32.0;
            return result;
        }

        // If the temperature is in Fahrenheit, convert to Celsius
        else if (unit.equals("F")) {
            double result = (temperature - 32.0) * 5.0 / 9.0;
            return result;
        }

        // If the temperature is in Kelvin, convert to Celsius
        else if (unit.equals("K")) {
            double result = temperature - 273.15;
            return result;
        }

        // Unknown unit - return 0
        else {
            return 0.0;
        }
    }

    public static void main(String[] args) {

        // Test a few conversions and print them out
        System.out.println("100 C = " + convertTemperature(100, "C") + " F");
        System.out.println("212 F = " + convertTemperature(212, "F") + " C");
        System.out.println("373.15 K = " + convertTemperature(373.15, "K") + " C");

    }
}
