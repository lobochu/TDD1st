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
        Fraction sum= new Fraction(3).plus(new Fraction(0));
        assertEquals(3, sum.intValue());

    }

    @Test
    public void zeroPlauNonZero() throws Exception {
        Fraction sum = new Fraction(0).plus(new Fraction(5));
        assertEquals(5, sum.intValue());
    }

    @Test
    public void zeroPlusZero() throws Exception {
        Fraction sum = new Fraction(0).plus(new Fraction(0));
        assertEquals(0, sum.intValue());
    }
}
