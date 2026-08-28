package Week_05.RATIONAL_NUMBERS;

public class RationalNumber {
    private double numerator, denominator;

    public RationalNumber() { // Null Constructor
        numerator = 1;
        denominator = 1;
    }

    public RationalNumber(int numerator, int denominator) { // parametrized
        this.numerator = numerator;
        this.denominator = denominator;
    }
}