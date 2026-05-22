package controlstructures.exercise02;

public class BmiCalculator {
    public double calculateBmi(double weight, double height){
        return weight / (height * height);
    }

    public String classifyBmi (double bmi){

        String classification;

        if (bmi <= 18.5) {
            classification = "Underweight";
        }
        else if (bmi <= 24.9) {
            classification = "Ideal weight";
        }
        else if (bmi <= 29.9) {
            classification = "Slightly overweight";
        }
        else if (bmi <= 34.9) {
            classification = "Obesity Class I";
        }
        else if (bmi <= 39.9) {
            classification = "Obesity Class II (Severe)";
        }
        else {
            classification = "Obesity Class III (Morbid)";
        }

        return classification;
    }
}