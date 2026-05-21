package exercise04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type the name of 1st person: ");
        String nameFirst = input.nextLine();

        System.out.print("Type the age of 1st person: ");
        int ageFirst = input.nextInt();

        input.nextLine();

        System.out.print("Type the name of 2nd person: ");
        String nameSecond = input.nextLine();

        System.out.print("Type the age of 2nd person: ");
        int ageSecond = input.nextInt();

        input.nextLine();

        AgeDifferenceCalculator calculator = new AgeDifferenceCalculator();

        int difference = calculator.calculateAgeDifference(ageFirst, ageSecond);

        System.out.print("The age difference between " + nameFirst + " and " + nameSecond + " is " + difference + " years.");

        input.close();
    }
}
