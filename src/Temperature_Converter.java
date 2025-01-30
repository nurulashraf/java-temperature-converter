package temperature_converter;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A simple Temperature Converter that converts between Celsius, Fahrenheit, and Kelvin.
 */
public class Temperature_Converter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("Enter temperature value:");
            double temperature = scanner.nextDouble();
            
            System.out.println("Select the input unit: (C)elsius, (F)ahrenheit, (K)elvin");
            char inputUnit = Character.toUpperCase(scanner.next().charAt(0));
            
            System.out.println("Select the output unit: (C)elsius, (F)ahrenheit, (K)elvin");
            char outputUnit = Character.toUpperCase(scanner.next().charAt(0));
            
            double convertedTemperature = convertTemperature(temperature, inputUnit, outputUnit);
            System.out.printf("Converted temperature: %.2f %c%n", convertedTemperature, outputUnit);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a numeric value for temperature.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
    
    /**
     * Converts a temperature from one unit to another.
     *
     * @param temp       The temperature value to convert.
     * @param fromUnit   The unit of the input temperature ('C', 'F', 'K').
     * @param toUnit     The desired output unit ('C', 'F', 'K').
     * @return           The converted temperature value.
     * @throws IllegalArgumentException if an invalid unit is provided.
     */
    public static double convertTemperature(double temp, char fromUnit, char toUnit) {
        if (fromUnit == toUnit) {
            return temp; // No conversion needed
        }
        
        // Convert input temperature to Celsius first
        double tempInCelsius;
        switch (fromUnit) {
            case 'C':
                tempInCelsius = temp;
                break;
            case 'F':
                tempInCelsius = (temp - 32) * 5 / 9;
                break;
            case 'K':
                tempInCelsius = temp - 273.15;
                break;
            default:
                throw new IllegalArgumentException("Invalid input unit. Use 'C', 'F', or 'K'.");
        }
        
        // Convert Celsius to target unit
        switch (toUnit) {
            case 'C':
                return tempInCelsius;
            case 'F':
                return (tempInCelsius * 9 / 5) + 32;
            case 'K':
                return tempInCelsius + 273.15;
            default:
                throw new IllegalArgumentException("Invalid output unit. Use 'C', 'F', or 'K'.");
        }
    }
}
