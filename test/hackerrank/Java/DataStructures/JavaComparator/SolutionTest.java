package hackerrank.Java.DataStructures.JavaComparator;

import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.Scanner;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution s;

    @Before
    public void setUp() throws Exception {
        s = new Solution();
    }

    @Test
    public void test1() throws Exception {
        System.setIn(new BufferedInputStream(new FileInputStream("test\\hackerrank\\Java\\DataStructures\\JavaComparator\\samples\\SampleInput1.txt")));
        System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream("test\\hackerrank\\Java\\DataStructures\\JavaComparator\\samples\\Output.txt")), true));


        s.main();
        File f1 = new File("test\\hackerrank\\Java\\DataStructures\\JavaComparator\\samples\\SampleOutput1.txt");
        File f2 = new File("test\\hackerrank\\Java\\DataStructures\\JavaComparator\\samples\\Output.txt");
        try(Scanner reader1 = new Scanner(f1);
            Scanner reader2 = new Scanner(f2))
        {
            while (reader1.hasNext()){
                String sampleString = reader1.nextLine();
                String outString = reader2.nextLine();
                assertEquals(sampleString, outString);
            }
        }

    }
}