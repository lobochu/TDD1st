package tw.lobo.math;

/**
 * Created by twlcbo on 2016/9/23.
 */
public class Fraction {
    private int intgerValue;
    private final int denominator;

    public Fraction(int intgerValue) {
        this.intgerValue = intgerValue;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.intgerValue = numerator;
        this.denominator = denominator;
    }

    public Fraction plus(Fraction that) {
        this.intgerValue += that.intValue();
//        return new Fraction(this.intgerValue + that.intValue());
        return this;
    }

    public int intValue() {
        return intgerValue;
    }

    public int getNumerator() {
        return 3;
    }

    public int getDenominator() {
        return this.denominator;
    }
}
