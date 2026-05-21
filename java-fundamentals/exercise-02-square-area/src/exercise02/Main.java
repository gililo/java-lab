package exercise02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type the side length of the square: ");
        double sideLength = scanner.nextDouble();

        SquareAreaCalculator calculator = new SquareAreaCalculator();
        double area = calculator.calculateArea(sideLength);

        System.out.println("The area of the square is: " + area);

        scanner.close();
    }
}