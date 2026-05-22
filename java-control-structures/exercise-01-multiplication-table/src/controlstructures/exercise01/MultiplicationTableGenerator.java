package controlstructures.exercise01;

public class MultiplicationTableGenerator {
    public void generateMultiplicationTable (int number){
        for (int i = 1; i <=10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }
}