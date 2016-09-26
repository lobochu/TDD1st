package tw.lobo.math;

/**
 * Created by twlcbo on 2016/9/23.
 */
public class Fraction {
    private final int numerator;
    private int intgerValue;
    private final int denominator;

    public Fraction(int intgerValue) {
        this.intgerValue = intgerValue;
        this.numerator = intgerValue;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.intgerValue = numerator;
        this.denominator = denominator;
        this.numerator = numerator;
    }

    public Fraction plus(Fraction that) {
//        this.intgerValue += that.intValue();
        return new Fraction(this.numerator+ that.numerator, this.denominator);
    }

    public int intValue() {
        return this.numerator;
    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }
}
