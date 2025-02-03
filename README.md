# Java Temperature Converter

A simple Java-based temperature converter that converts between Celsius, Fahrenheit, and Kelvin. The program includes error handling and a user-friendly command-line interface.

## Features
- Convert temperatures between Celsius, Fahrenheit, and Kelvin.
- Error handling for invalid inputs.
- Simple CLI-based interaction.
- Lightweight and easy to use.

## Installation
1. Clone the repository:
   ```sh
   git clone https://github.com/nurulashraf/java-temperature-converter.git
   ```
2. Navigate to the project directory:
   ```sh
   cd java-temperature-converter
   ```
3. Compile the Java program:
   ```sh
   javac -d bin src/temperature_converter/TemperatureConverter.java
   ```
4. Run the program:
   ```sh
   java -cp bin temperatureconverter.TemperatureConverter
   ```

## Usage
1. Enter a temperature value.
2. Select the input unit: (C)elsius, (F)ahrenheit, or (K)elvin.
3. Select the output unit: (C)elsius, (F)ahrenheit, or (K)elvin.
4. The program will display the converted temperature.

## Example
```
Enter temperature value:
100
Select the input unit: (C)elsius, (F)ahrenheit, (K)elvin
C
Select the output unit: (C)elsius, (F)ahrenheit, (K)elvin
F
Converted temperature: 212.00 F
```

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

