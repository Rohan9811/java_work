//package pkg1.pkg1.area;
import java.util.Scanner;

class Rectangle {
    double length;
    double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double calculateArea() {
        return length * width;
    }
}

class Triangle {
    double base;
    double height;
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length and width of the rectangle:");
        double rectLength = scanner.nextDouble();
        double rectWidth = scanner.nextDouble();
        Rectangle r = new Rectangle(rectLength, rectWidth);

        System.out.println("Enter base and height of the triangle:");
        double triBase = scanner.nextDouble();
        double triHeight = scanner.nextDouble();
        Triangle t = new Triangle(triBase, triHeight);

        double rectArea = r.calculateArea();
        System.out.println("Area of Rectangle: " + rectArea);

        double triArea = t.calculateArea();
        System.out.println("Area of Triangle: " + triArea);

        scanner.close();
    }
}
