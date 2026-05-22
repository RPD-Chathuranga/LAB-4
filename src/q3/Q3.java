package Q3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the inner circle (ri): ");
        double ri = scanner.nextDouble();

        System.out.print("Enter the radius of the outer circle (ro): ");
        double ro = scanner.nextDouble();

        Circle innerCircle = new Circle(ri);
        Circle outerCircle = new Circle(ro);

        double shadedArea = outerCircle.computeArea() - innerCircle.computeArea();

        System.out.printf("Area of the circular region (shaded area): %.2f\n", shadedArea);

        scanner.close();
    }
}

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double computeArea() {
        return Math.PI * radius * radius;
    }

    public double computeCircumference() {
        return 2 * Math.PI * radius;
    }
}