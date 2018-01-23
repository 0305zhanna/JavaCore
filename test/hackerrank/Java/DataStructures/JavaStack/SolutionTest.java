package hackerrank.Java.DataStructures.JavaStack;

import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

public class SolutionTest {

    @Before
    public void setUp() throws Exception {
    }
    @Test
    public void testMain() throws Exception {
        System.setIn(new BufferedInputStream(new FileInputStream("test01.txt")));
        System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream("excpted.txt")), true));

    }
}