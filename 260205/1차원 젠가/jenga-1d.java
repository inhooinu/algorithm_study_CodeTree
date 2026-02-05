import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] blocks = new int[n];
        for (int i = 0; i < n; i++) {
            blocks[i] = sc.nextInt();
        }
        int s1 = sc.nextInt();
        int e1 = sc.nextInt();
        int s2 = sc.nextInt();
        int e2 = sc.nextInt();

        int[] temp = new int[n];
        int tempSize = 0;
        for (int i=0; i<n; i++) {
            if (i<s1-1 || i>=e1) temp[tempSize++] = blocks[i];
        }
        blocks = temp.clone();
        int blockSize = tempSize;
//        System.out.println(Arrays.toString(blocks));

        temp = new int[n];
        tempSize = 0;
        for (int i=0; i<blockSize; i++) {
            if (i<s2-1 || i>=e2) temp[tempSize++] = blocks[i];
        }
        blocks = temp.clone();
        blockSize = tempSize;
//        System.out.println(Arrays.toString(blocks));

        // 결과 출력
        System.out.println(blockSize);
        for (int i=0; i<blockSize; i++) {
            System.out.println(blocks[i]);
        }
    }
}