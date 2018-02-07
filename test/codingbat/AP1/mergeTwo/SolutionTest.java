package codingbat.AP1.mergeTwo;

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
        assertArrayEquals("test1",new String[]{"a", "b", "c"},s.mergeTwo(new String[]{"a", "c", "z"},
                new String[]{"b", "f", "z"},3));
    }

    @Test
    public void test2() {
        assertArrayEquals("test2",new String[]{"a", "c", "f"},s.mergeTwo(new String[]{"a", "c", "z"},
                new String[]{"c", "f", "z"},3));
    }

    @Test
    public void test3() {
        assertArrayEquals("test3",new String[]{"c", "f", "g"},s.mergeTwo(new String[]{"f", "g", "z"},
                new String[]{"c", "f", "g"},3));
    }
}