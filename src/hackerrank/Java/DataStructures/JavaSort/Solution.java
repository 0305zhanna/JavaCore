package hackerrank.Java.DataStructures.JavaSort;

import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in).useLocale(Locale.ENGLISH);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Collections.sort(studentList);

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }

}
class Student implements Comparable{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(Object o) {
        Student s1 = (Student) o;
        if(s1.getCgpa() == this.cgpa){
            if(this.fname.equals(s1.getFname())){
                if(this.id == s1.getId())
                    return 0;
                else
                    return this.id > s1.id ? -1 : 1;
            }else {
                return this.fname.compareTo(s1.getFname());
            }
        }else {
            return this.cgpa > s1.getCgpa() ? -1:1;
        }
    }
}
