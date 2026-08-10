import java.util.*;
import java.io.*;

class Student implements Comparable<Student> {
    int num;
    int height;
    int weight;

    Student(int num, int height, int weight) {
        this.num = num;
        this.height = height;
        this.weight = weight;
    }

    public int compareTo(Student s) {
        if (this.height!=s.height) {
            return s.height - this.height;
        } else if (this.weight!=s.weight) {
            return s.weight - this.weight;
        } else {
            return this.num - s.num;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i=0; i<n; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            Student student = new Student(i+1, h, w);
            students[i] = student;
        }

        Arrays.sort(students);
        for (int i=0; i<n; i++) {
            System.out.println(students[i].height + " " + students[i].weight + " " + students[i].num);
        }
    }
}