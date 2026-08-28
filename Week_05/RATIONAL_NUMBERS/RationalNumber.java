package Week_05.RATIONAL_NUMBERS;

public class RationalNumber {
    private int numerator, denominator;

    public RationalNumber() { // Null Constructor
        numerator = 1;
        denominator = 2;
    }

    public RationalNumber(int numerator, int denominator) { // parametrized
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator can't be zero");
        }

        this.numerator = numerator;
        this.denominator = denominator;
    }

    public RationalNumber(RationalNumber r) { // copy
        this.numerator = r.numerator;
        this.denominator = r.denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

}