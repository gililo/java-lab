package controlstructures.exercise03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type the first number: ");
        int firstNumber = input.nextInt();

        int secondNumber;
        do {
            System.out.print("Type a number greater than the first number: ");
            secondNumber = input.nextInt();
        } while (secondNumber <= firstNumber);

        int type;
        do {
            System.out.print("Type 1 to choose Even numbers or 2 to choose Odd numbers: ");
            type = input.nextInt();
        } while (type != 1 && type != 2);

        EvenOddRange range = new EvenOddRange();

        int lastNumber = range.findLastNumber(secondNumber, type);

        range.createList(lastNumber, firstNumber, type);

        input.close();
    }
}