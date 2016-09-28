package tw.lobo.math.test;

import org.junit.Test;
import tw.lobo.math.Fraction;

import static org.junit.Assert.assertEquals;

/**
 * Created by Lobo on 2016/9/28.
 */
public class FractionEqualsTest {
    @Test
    public void sameNumeratorAndDenominator() throws Exception {
        assertEquals(new Fraction(3, 5), new Fraction(3, 5));
    }
}
