package tw.lobo.math.test;

import org.junit.Test;
import tw.lobo.math.Fraction;

import static org.junit.Assert.assertEquals;

/**
 * Created by twlcbo on 2016/9/23.
 */
public class AddFractionTest {
    @Test
    public void nonZeroPlusZero() throws Exception {
        assertEquals(3, new Fraction(3).plus(new Fraction(0)).intValue());

    }

    @Test
    public void negativeInputsAndNegativeOutput() throws Exception {
        assertEquals(-2, new Fraction(-3).plus(new Fraction(1)).intValue());
    }

    @Test
    public void zeroPlauNonZero() throws Exception {
        assertEquals(5, new Fraction(0).plus(new Fraction(5)).intValue());
    }

    @Test
    public void nonTrivialDenominator() throws Exception {
        Fraction sum = new Fraction(1, 5).plus(new Fraction(2, 5));
        assertEquals(3, sum.getNumerator());
        assertEquals(5, sum.getDenominator());
    }

    @Test
    public void zeroPlusZero() throws Exception {
        assertEquals(0, new Fraction(0).plus(new Fraction(0)).intValue());
    }
}
