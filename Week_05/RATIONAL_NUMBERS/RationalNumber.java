package Week_05.RATIONAL_NUMBERS;

public class RationalNumber {
    private double numerator, denominator;

    public RationalNumber() { // Null Constructor
        numerator = 1;
        denominator = 1;
    }

    public RationalNumber(int numerator, int denominator) { // parametrized
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator can't be zero");
        }

        this.numerator = numerator;
        this.denominator = denominator;
    }

}