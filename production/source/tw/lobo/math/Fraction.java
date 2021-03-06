package tw.lobo.math;

/**
 * Created by twlcbo on 2016/9/23.
 */
public class Fraction {
    private final int numerator;
    private final int denominator;

    public Fraction(int numerator) {
        this(numerator, 1);
    }

    public Fraction(int numerator, int denominator) {
        int signOfDenominator = denominator < 0 ? -1 : 1;
        //CONTRACT: gcd() never returns 0
        int gcd = NumberTheory.gcd(numerator, denominator) * signOfDenominator;
        this.denominator = denominator / gcd;
        this.numerator = numerator / gcd;
    }

    public Fraction plus(Fraction that) {
        return new Fraction(this.numerator * that.denominator + that.numerator * this.denominator,
                this.denominator * that.denominator);
    }

    public int intValue() {
        return this.numerator;
    }

    @Override
    public String toString() {
        return String.format("%d/%d", numerator, denominator);
    }

    @Override
    public int hashCode() {
        return numerator * 19 + denominator;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Fraction) {
            Fraction that = (Fraction) other;
            return this.numerator == that.numerator
                    && this.denominator == that.denominator;
        }
        return false;
    }

}
