import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int[] day = new int[] {0,31,28,31,30,31,30,31,31,30,31,30,31};
        int day1 = 0;
        int day2 = 0;
        for (int i=1; i<=12; i++) {
            if (i < m1) {
                day1 += day[i];
            }
            if (i < m2) {
                day2 += day[i];
            }
        }
        day1 += d1;
        day2 += d2;

        int diff = day2-day1;
        diff %= 7;
        if (diff < 0) {
            diff += 7;
        }

        String[] d = new String[] {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        System.out.println(d[diff]);
    }
}