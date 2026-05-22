package controlstructures.exercise01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type a number: ");
        int number = input.nextInt();

        MultiplicationTableGenerator generator = new MultiplicationTableGenerator();
        generator.generateMultiplicationTable(number);

        input.close();
    }
}