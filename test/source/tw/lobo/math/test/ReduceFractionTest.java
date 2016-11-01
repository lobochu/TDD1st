package tw.lobo.math.test;

import org.junit.Ignore;
import org.junit.Test;
import tw.lobo.math.Fraction;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by twlcbo on 2016/9/30.
 */
public class ReduceFractionTest {
    @Test
    public void reduceToNotWholeNumber() throws Exception {
        assertEquals(new Fraction(3, 4), new Fraction(6, 8));
    }

    @Test
    public void reduceTwoWholeNumber() throws Exception {
        assertEquals(new Fraction(6), new Fraction(24, 4));

    }

    @Test
    public void reduceZero() throws Exception {
        assertEquals(new Fraction(0), new Fraction(0, 123435));

    }

    @Test
    public void alreadyInLowestTerms() throws Exception {
        assertEquals(new Fraction(3, 4), new Fraction(3, 4));
    }
}
