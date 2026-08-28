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

        int gcd = gcd(numerator, denominator); // GCD

        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    public RationalNumber(RationalNumber r) { // copy
        this.numerator = r.numerator;
        this.denominator = r.denominator;
    }

    private int gcd(int a, int b) { //METHOD TO CALCULATE GCD

        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {

            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

}