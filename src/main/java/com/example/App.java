package com.example;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter details for Student " + i + ":");
            String name = "Student" + i; 
            students.add(new Student(name, 20, 15, 40));
        }
        System.out.println("Analysis Complete.");
    }
}

class Student {
    String name;
    double total;
    public Student(String name, double cat, double assign, double fat) {
        this.name = name;
        this.total = cat + assign + fat;
    }
    public double getTotal() { return total; }
    public double getGPA() { return total / 10.0; }
    public String getGrade() {
        if (total >= 90) return "S";
        if (total >= 80) return "A";
        return "B";
    }
}

