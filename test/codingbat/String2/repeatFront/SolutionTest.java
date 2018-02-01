package codingbat.String2.repeatFront;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution s;

    @Before
    public void setUp() throws Exception {
        s = new Solution();
    }

    @Test
    public void test1() {
        assertEquals("ChocChoChC",s.repeatFront("Chocolate", 4));
    }

    @Test
    public void test2() {
        assertEquals("ChoChC",s.repeatFront("Chocolate", 3));
    }

    @Test
    public void test3() {
        assertEquals("IcI",s.repeatFront("Ice Cream", 2));
    }
}