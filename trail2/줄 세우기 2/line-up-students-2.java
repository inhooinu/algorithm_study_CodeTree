import java.util.*;
import java.io.*;

class Student implements Comparable<Student> {
    int h;
    int w;
    int index;

    Student(int h, int w, int index) {
        this.h = h;
        this.w = w;
        this.index = index;
    }

    public int compareTo(Student s) {
        if (this.h != s.h) {
            return Integer.compare(this.h, s.h);
        }
        return Integer.compare(s.w, this.w);
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
            students[i] = new Student(h, w, i+1);
        }
        Arrays.sort(students);

        for (int i=0; i<n; i++) {
            System.out.println(students[i].h + " " + students[i].w + " " + students[i].index);
        }
    }
}