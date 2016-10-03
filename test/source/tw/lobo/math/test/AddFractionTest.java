package tw.lobo.math.test;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.JUnitCore;
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
        assertEquals(new Fraction(-2), new Fraction(-3).plus(new Fraction(1)));
    }

    @Test
    public void nonNegativeNonZeroOperands() throws Exception {
        assertEquals(new Fraction(7), new Fraction(3).plus(new Fraction(4)));
    }

    @Test
    public void zeroPlauNonZero() throws Exception {
        assertEquals(new Fraction(5), new Fraction(0).plus(new Fraction(5)));
    }

    @Test
    public void nonTrivialButCommonDenominator() throws Exception {
        assertEquals(new Fraction(3, 5), new Fraction(1, 5).plus(new Fraction(2, 5)));
    }

    @Test
    public void zeroPlusZero() throws Exception {
        assertEquals(new Fraction(0), new Fraction(0).plus(new Fraction(0)));
    }

    @Test
    public void reduceResultToWholeNumber() throws Exception {
        assertEquals(new Fraction(1), new Fraction(1, 3).plus(new Fraction(2, 3)));

    }

    @Test
    public void differentDenominatorWithoutReducing() throws Exception {
        assertEquals(new Fraction(5, 6), new Fraction(1, 2).plus(new Fraction(1, 3)));
    }

    @Test
    public void oneDenominstorIsAMultipleOfTheOther() throws Exception {
        assertEquals(new Fraction(11, 8), new Fraction(3, 4).plus(new Fraction(5, 8)));
    }

    @Test
    public void reduceResultEvenWhenDonominatorAreTheSame() throws Exception {
        assertEquals(new Fraction(3, 2), new Fraction(3, 4).plus(new Fraction(3, 4)));

    }

    @Test
    public void commonFactorInDenominators() throws Exception {
        assertEquals(new Fraction(11, 18), new Fraction(1, 6).plus(new Fraction(4, 9)));
    }

    @Test
    public void negativeFractionAndReducing() throws Exception {
        assertEquals(new Fraction(1, 2), new Fraction(-1, 4).plus(new Fraction(3, 4)));
        assertEquals(new Fraction(-1, 8), new Fraction(3, 8).plus(new Fraction(-1, 2)));
    }

    @Test
//    @Ignore("Constructor doesn't yet avoid negative denominators")
    public void negativeSignsEverywhere() throws Exception {
        assertEquals(new Fraction(1, 2), new Fraction(1, -4).plus(new Fraction(-3, -4)));

    }
}
