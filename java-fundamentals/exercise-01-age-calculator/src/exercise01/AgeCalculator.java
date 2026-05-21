package exercise01;

import java.time.LocalDate;

public class AgeCalculator {
    public int calculateAge(int birthYear) {
        int currentYear = LocalDate.now().getYear();

        if (birthYear > currentYear) {
            throw new IllegalArgumentException("Birth year cannot be in the future.");
        }

        return currentYear - birthYear;
    }
}