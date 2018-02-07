package codingbat.Logic2.makeChocolate;

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
        assertEquals(4, s.makeChocolate(4,1,9));
    }

    @Test
    public void test2() {
        assertEquals(2, s.makeChocolate(6, 2, 7));
    }

    @Test
    public void test3() {
        assertEquals(4, s.makeChocolate(4, 1, 4));
    }
}