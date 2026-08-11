import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] days = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int days1 = 0;
        int days2 = 0;
        for (int i=0; i<12; i++) {
            if (m1>i+1) {
                days1 += days[i];
            }
            if (m2>i+1) {
                days2 += days[i];
            }
        }
        days1 += d1;
        days2 += d2;

        System.out.println(days2-days1+1);
    }
}