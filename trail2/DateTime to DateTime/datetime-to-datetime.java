import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int m1 = 11*24*60 + 11*60 + 11;
        int m2 = a*24*60 + b*60 + c;

        if (m2 < m1) {
            System.out.println(-1);
        } else {
            System.out.println(m2-m1);
        }
    }
}