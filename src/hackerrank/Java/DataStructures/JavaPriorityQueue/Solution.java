package hackerrank.Java.DataStructures.JavaPriorityQueue;

import java.util.*;

public class Solution {
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
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
    public String getName() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(Object o) {
        Student s1 = (Student) o;
        if(s1.getCgpa() == this.cgpa){
            if(this.fname.equals(s1.getName())){
                if(this.id == s1.getId())
                    return 0;
                else
                    return this.id > s1.id ? -1 : 1;
            }else {
                return this.fname.compareTo(s1.getName());
            }
        }else {
            return this.cgpa > s1.getCgpa() ? -1:1;
        }
    }
}
class Priorities{
    public List<Student> getStudents(List<String> events){
        Queue<Student> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < events.size(); i++) {
            String[] strings = events.get(i).split(" ");
            if(strings.length > 1){
                priorityQueue.offer(new Student(Integer.parseInt(strings[3]), strings[1], Double.parseDouble(strings[2])));
            }else {
                priorityQueue.poll();
            }
        }
        List<Student> list = new ArrayList<>();
        while (priorityQueue.size() != 0){
            list.add(priorityQueue.poll());
        }
        return list;
    }
}