package com.exam;

import java.util.*;

/*
 * Create the Student and Priorities classes here.
 */
class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }

    @Override
    public int compareTo(Student student) {
        if (this.getCGPA() < student.getCGPA()) {
            return 1;
        } else if (this.getCGPA() > student.getCGPA()) {
            return -1;
        }
        return 0;
    }
}

class Priorities {

    List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> queue = new PriorityQueue<>();
        for (String event : events) {
            String[] students = event.split(" ");

            if (students[0].equals("ENTER")) {
                queue.add(new Student(Integer.parseInt(students[3]), students[1], Double.parseDouble(students[2])));
            } else {
                if (!queue.isEmpty()) {
                    queue.remove();
                }
            }
        }
        return queue.stream().toList();
    }
}

public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
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
