import java.util.Scanner;

public class TemperatureConverter {

    public static double convertTemperature(double temperature, String unit) {

        if (unit.equalsIgnoreCase("C")) {
            return (temperature * 9.0 / 5.0) + 32;
        } else {
            return (temperature - 32) * 5.0 / 9.0;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean running = true;

        while (running) {

            System.out.print("Enter a temperature value or type stop to quit: ");
            String tempInput = input.nextLine();

            if (tempInput.equalsIgnoreCase("stop")) {
                running = false;
            }
            else {

                boolean validNumber = true;

                for (int i = 0; i < tempInput.length(); i++) {

                    char ch = tempInput.charAt(i);

                    if (!Character.isDigit(ch)
                            && ch != '.'
                            && ch != '-') {
                        validNumber = false;
                    }
                }

                if (!validNumber || tempInput.length() == 0) {
                    System.out.println("Error: Invalid temperature value.");
                }
                else {

                    double temperature = Double.parseDouble(tempInput);

                    System.out.print("Enter unit (C or F): ");
                    String unit = input.nextLine();

                    if (!unit.equalsIgnoreCase("C")
                            && !unit.equalsIgnoreCase("F")) {

                        System.out.println("Error: Invalid unit.");
                    }
                    else {

                        double converted =
                                convertTemperature(temperature, unit);

                        if (unit.equalsIgnoreCase("C")) {

                            System.out.printf(
                                    "%.2f°C is equal to %.2f°F%n",
                                    temperature,
                                    converted);

                        } else {

                            System.out.printf(
                                    "%.2f°F is equal to %.2f°C%n",
                                    temperature,
                                    converted);
                        }
                    }
                }
            }
        }

        input.close();
    }
}
