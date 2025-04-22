package Expt_1;
import java.util.Scanner;

public class Points {
    double x, y;

    // Constructor to initialize the point
    public Points(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Method to calculate distance from another point
    public void calculateDistance(Points other) {
        double distance = Math.sqrt(
                Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2)
        );
        System.out.println("Distance between the points: " + distance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coordinates for Point 1:");
        System.out.print("x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("y1: ");
        double y1 = scanner.nextDouble();

        System.out.println("Enter coordinates for Point 2:");
        System.out.print("x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("y2: ");
        double y2 = scanner.nextDouble();

        // Create Points using constructor
        Points point1 = new Points(x1, y1);
        Points point2 = new Points(x2, y2);

        // Calculate and print the distance
        point1.calculateDistance(point2);

        scanner.close();
    }
}
