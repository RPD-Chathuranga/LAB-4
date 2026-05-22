package Q2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double inputFahrenheit = scanner.nextDouble();

        Temperature temp = new Temperature();
        temp.setFahrenheit(inputFahrenheit);

        System.out.printf("Equivalent temperature in Celsius: %.2f\n", temp.toCelsius());

        scanner.close();
    }
}

class Temperature {
    private double celsius;

    public Temperature() {
        this.celsius = 0.0;
    }

    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    public double toCelsius() {
        return this.celsius;
    }

    public double toFahrenheit() {
        return (this.celsius * 9.0 / 5.0) + 32.0;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public void setFahrenheit(double fahrenheit) {
        this.celsius = (fahrenheit - 32.0) * 5.0 / 9.0;
    }
}