package tw.lobo.math.test;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by twlcbo on 2016/9/30.
 */
public class GreatestCommonDivisorTest {
    @Test
    public void oneAndOne() throws Exception {
        assertEquals(1, gcd(1, 1));

    }

    private int gcd(int a, int b) {
        while (b !=0){
            int t = b;
            b = a % t;
            a = t;
        }
        return a;
    }
}
