package hackerrank.Java.ObjectOrientedProgramming.JavaInstanceofkeyword;

import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.Scanner;

import static org.junit.Assert.*;

public class InstanceOFTutorialTest {
    InstanceOFTutorial s;

    @Before
    public void setUp() throws Exception {
        s = new InstanceOFTutorial();
    }

    @Test
    public void test1() throws Exception {
        System.setIn(new BufferedInputStream(new FileInputStream("test\\hackerrank\\Java\\ObjectOrientedProgramming\\JavaInstanceofkeyword\\samples\\SampleInput1.txt")));
        System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream("test\\hackerrank\\Java\\ObjectOrientedProgramming\\JavaInstanceofkeyword\\samples\\Output.txt")), true));


        s.main(new String[]{" "});

        File f1 = new File("test\\hackerrank\\Java\\ObjectOrientedProgramming\\JavaInstanceofkeyword\\samples\\SampleOutput1.txt");
        File f2 = new File("test\\hackerrank\\Java\\ObjectOrientedProgramming\\JavaInstanceofkeyword\\samples\\Output.txt");
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