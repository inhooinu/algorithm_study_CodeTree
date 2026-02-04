import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] top = new int[n];
        int[] bottom = new int[n];
        for (int i = 0; i < n; i++) {
            top[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            bottom[i] = sc.nextInt();
        }

        int cnt = t%6;  // 밀어야하는 횟수
        for (int i=0; i<cnt; i++) {
            // top 밀기
            int tempTop = top[n-1];
            for (int j=n-1; j>=1; j--) {
                top[j] = top[j-1];
            }
            //bottom 밀기
            int tempBottom = bottom[n-1];
            for (int j=n-1; j>=1; j--) {
                bottom[j] = bottom[j-1];
            }
            top[0] = tempBottom;
            bottom[0] = tempTop;
        }

//        System.out.println(Arrays.toString(top));
//        System.out.println(Arrays.toString(bottom));

        for (int i=0; i<n; i++) {
            System.out.print(top[i]+" ");
        }
        System.out.println();
        for (int i=0; i<n; i++) {
            System.out.print(bottom[i]+" ");
        }
    }
}