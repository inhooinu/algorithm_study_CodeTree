import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] blocks = new int[N+1];
        for (int i = 0; i < K; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            for (int j=A; j<=B; j++) {
                blocks[j]++;
            }
        }
        // System.out.println(Arrays.toString(blocks));
        int maxCnt = 0;
        for (int i=0; i<N+1; i++) {
            maxCnt = Math.max(maxCnt, blocks[i]);
        }
        System.out.println(maxCnt);
    }
}