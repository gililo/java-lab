package exercise04;

public class AgeDifferenceCalculator {
    public int calculateAgeDifference(int ageFirst, int ageSecond) {

        int ageDifference = ageFirst - ageSecond;

        if (ageDifference < 0) {
            ageDifference = ageDifference * -1;
        }

        return ageDifference;
    }
}