import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int sub1;
    int sub2;
    int sub3;

    public Student(String name, int sub1, int sub2, int sub3) {
        this.name=name;
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;
    }

    public int compareTo(Student s) {
        return Integer.compare(this.sub1+this.sub2+this.sub3, s.sub1+s.sub2+s.sub3);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        
        for (int i=0; i<n; i++) {
            String name = sc.next();
            int sub1 = sc.nextInt();
            int sub2 = sc.nextInt();
            int sub3 = sc.nextInt();

            students[i] = new Student(name, sub1, sub2, sub3);
        }

        Arrays.sort(students);
        for (int i=0; i<n; i++) {
            System.out.println(students[i].name+" "+students[i].sub1+" "+students[i].sub2+" "+students[i].sub3);
        }
    }
}