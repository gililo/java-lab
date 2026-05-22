package controlstructures.exercise03;

public class EvenOddRange {
    public int findLastNumber (int secondNumber, int type){
        int lastNumber;

        if ((type == 1 && secondNumber % 2 != 0) || (type == 2 && secondNumber % 2 == 0)) {
            lastNumber = secondNumber - 1;
        }
        else {
            lastNumber = secondNumber;
        }

        return lastNumber;
    }

    public void createList (int lastNumber, int firstNumber, int type){
        if (type == 1) {
            System.out.print("Even numbers in the selected range: ");
        }
        else if (type == 2) {
            System.out.print("Odd numbers in the selected range: ");
        }
        else {
            System.out.print("Invalid option. Please choose 1 for even numbers or 2 for odd numbers.");
            return;
        }

        for (int number = lastNumber; number >= firstNumber; number -= 2) {
            if (number - 2 < firstNumber) {
                System.out.print(number + ".");
            }
            else {
                System.out.print(number + ", ");
            }
        }
    }
}