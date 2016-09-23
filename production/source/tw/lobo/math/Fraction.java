package tw.lobo.math;

/**
 * Created by twlcbo on 2016/9/23.
 */
public class Fraction {
    private final int intgerValue;

    public Fraction(int intgerValue) {
        this.intgerValue = intgerValue;
    }

    public Fraction plus(Fraction that) {
        return this;
    }

    public int intValue() {
        return intgerValue;
    }
}
