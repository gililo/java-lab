package exercise03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type the base length of the rectangle: ");
        double baseLength = input.nextDouble();

        System.out.print("Type the height of the rectangle: ");
        double height = input.nextDouble();

        RectangleAreaCalculator calculator = new RectangleAreaCalculator();

        double area = calculator.calculateArea(baseLength, height);

        System.out.println("The area of the rectangle is: " + area);

        input.close();
    }
}