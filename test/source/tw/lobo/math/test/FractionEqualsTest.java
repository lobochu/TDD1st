package tw.lobo.math.test;

import org.junit.Test;
import tw.lobo.math.Fraction;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by Lobo on 2016/9/28.
 */
public class FractionEqualsTest {
    @Test
    public void differentNumerators() throws Exception {
        assertNotEquals(new Fraction(1, 5), new Fraction(2, 5));
    }


    @Test
    public void wholeNumberNotEqualToDifferentWholeNumber() throws Exception {
        assertNotEquals(new Fraction(6), new Fraction(5));

    }

    @Test
    public void wholeNumberEqualsSameFraction() throws Exception {
        assertEquals(new Fraction(5, 1), new Fraction(5));

    }

    @Test
    public void differentDenominators() throws Exception {
       assertNotEquals(new Fraction(3, 4), new Fraction(3, 7));
    }

    @Test
    public void sameNumeratorAndDenominator() throws Exception {
        assertEquals(new Fraction(3, 5), new Fraction(3, 5));
    }
}
