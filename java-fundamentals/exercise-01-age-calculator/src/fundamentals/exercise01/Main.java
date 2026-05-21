package fundamentals.exercise01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a name: ");
        String name = scanner.nextLine();

        System.out.print("Type the birth year: ");
        int birthYear = scanner.nextInt();

        AgeCalculator calculator = new AgeCalculator();
        int age = calculator.calculateAge(birthYear);

        System.out.println("Hello " + name + ". You are " + age + " years old.");

        scanner.close();
    }
}