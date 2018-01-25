package codingbat.Logic1.dateFashion;

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
        assertEquals(2, s.dateFashion(5,10));
    }

    @Test
    public void test2() {
        assertEquals(0, s.dateFashion(5,2));
    }

    @Test
    public void test3() {
        assertEquals(1, s.dateFashion(5,5));
    }

    @Test
    public void test4() {
        assertEquals(0, s.dateFashion(2,10));
    }

}