package controlstructures.exercise02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type your height in meters: ");
        double height = input.nextDouble();

        System.out.print("Type your weight in kg: ");
        double weight = input.nextDouble();

        BmiCalculator calculator = new BmiCalculator();

        double bmi = calculator.calculateBmi(weight, height);
        String classification = calculator.classifyBmi(bmi);

        System.out.printf("Your BMI is: %.2f%n", bmi);
        System.out.println("Classification: " + classification);

        input.close();
    }
}
