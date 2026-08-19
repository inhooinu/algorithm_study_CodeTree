import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[201];  // 0~200
        for (int i=0; i<n; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            for (int j=x1+100; j<x2+100; j++) {
                arr[j]++;
            }
        }

        int result = 0;
        for (int i=0; i<=200; i++) {
            result = Math.max(result, arr[i]);
        }
        System.out.println(result);
    }
}