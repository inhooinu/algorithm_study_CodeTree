import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int kor;
    int eng;
    int math;

    public Student(String name, int kor, int eng, int math) {
        this.name=name;
        this.kor=kor;
        this.eng=eng;
        this.math=math;
    }

    public int compareTo(Student s) {
        if (this.kor != s.kor) {
            return Integer.compare(s.kor, this.kor);
        } else if (this.eng != s.eng) {
            return Integer.compare(s.eng, this.eng);
        } else {
            return Integer.compare(s.math, this.math);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i=0; i<n; i++) {
            String name = sc.next();
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();

            students[i] = new Student(name, kor, eng, math);
        }

        Arrays.sort(students);

        for (int i=0; i<n; i++) {
            System.out.println(students[i].name+" "+students[i].kor+" "+students[i].eng+" "+students[i].math);
        }
    }
}