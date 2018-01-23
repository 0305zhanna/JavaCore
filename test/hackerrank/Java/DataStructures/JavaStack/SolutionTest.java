package hackerrank.Java.DataStructures.JavaStack;

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
        System.setIn(new BufferedInputStream(new FileInputStream("C:\\Users\\0305z\\IdeaProjects\\JavaCore\\test\\hackerrank\\Java\\DataStructures\\JavaStack\\samples\\SampleInput1.txt")));
        System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream("C:\\Users\\0305z\\IdeaProjects\\JavaCore\\test\\hackerrank\\Java\\DataStructures\\JavaStack\\samples\\Output.txt")), true));


        s.main();
        File f1 = new File("C:\\Users\\0305z\\IdeaProjects\\JavaCore\\test\\hackerrank\\Java\\DataStructures\\JavaStack\\samples\\SampleOutput1.txt");
        File f2 = new File("C:\\Users\\0305z\\IdeaProjects\\JavaCore\\test\\hackerrank\\Java\\DataStructures\\JavaStack\\samples\\Output.txt");
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

    @Test
    public void test2() throws Exception {
        System.setIn(new BufferedInputStream(new FileInputStream("C:\\Users\\0305z\\IdeaProjects\\JavaCore\\test\\hackerrank\\Java\\DataStructures\\JavaStack\\samples\\SampleInput2.txt")));
        System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream("C:\\Users\\0305z\\IdeaProjects\\JavaCore\\test\\hackerrank\\Java\\DataStructures\\JavaStack\\samples\\Output.txt")), true));


        s.main();
        File f1 = new File("C:\\Users\\0305z\\IdeaProjects\\JavaCore\\test\\hackerrank\\Java\\DataStructures\\JavaStack\\samples\\SampleOutput2.txt");
        File f2 = new File("C:\\Users\\0305z\\IdeaProjects\\JavaCore\\test\\hackerrank\\Java\\DataStructures\\JavaStack\\samples\\Output.txt");
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

    @Test
    public void test3() throws Exception {
        System.setIn(new BufferedInputStream(new FileInputStream("C:\\Users\\0305z\\IdeaProjects\\JavaCore\\test\\hackerrank\\Java\\DataStructures\\JavaStack\\samples\\SampleInput3.txt")));
        System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream("C:\\Users\\0305z\\IdeaProjects\\JavaCore\\test\\hackerrank\\Java\\DataStructures\\JavaStack\\samples\\Output.txt")), true));


        s.main();
        File f1 = new File("C:\\Users\\0305z\\IdeaProjects\\JavaCore\\test\\hackerrank\\Java\\DataStructures\\JavaStack\\samples\\SampleOutput3.txt");
        File f2 = new File("C:\\Users\\0305z\\IdeaProjects\\JavaCore\\test\\hackerrank\\Java\\DataStructures\\JavaStack\\samples\\Output.txt");
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