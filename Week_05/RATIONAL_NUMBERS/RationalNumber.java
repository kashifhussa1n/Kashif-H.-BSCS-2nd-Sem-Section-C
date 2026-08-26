package Week_05.RATIONAL_NUMBERS;

import java.util.Objects;

final class RationalNumber {
    private final int numerator;
    private final int denominator;

    public RationalNumber(int numerator, int denominator) {
        if (denominator <= 0) {
            throw new IllegalArgumentException(
                "Denominator must be greater than zero.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }              // same reference — quick exit
        if (other == null) { return false; }              // null check
        if (!(other instanceof RationalNumber)) { return false; } // type check

        RationalNumber that = (RationalNumber) other;
        return this.numerator == that.numerator
                && this.denominator == that.denominator;   // field-by-field comparison
    } // end method equals

    @Override
    public int hashCode() {
        return Objects.hash(this.numerator, this.denominator);
    }
}