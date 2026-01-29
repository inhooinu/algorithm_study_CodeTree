import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int nums[][] = new int[2][4];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        for (int i=0; i<2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0; j<4; j++) {
                nums[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // for (int i=0; i<2; i++) {
        //     for (int j=0; j<4; j++) {
        //         System.out.print(nums[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // 가로 평균
        for (int i=0; i<2; i++) {
            int sum = 0;
            for (int j=0; j<4; j++) {
                sum += nums[i][j];
            }
            System.out.print((double)sum/4 + " ");
        }
        System.out.println();
        
        // 세로 평균
        for (int i=0; i<4; i++) {
            int sum = 0;
            for (int j=0; j<2; j++) {
                sum += nums[j][i];
            }
            System.out.print((double)sum/2 + " ");
        }
        System.out.println();

        // 전체 평균
        int sum = 0;
        for (int i=0; i<2; i++) {
            for (int j=0; j<4; j++) {
                sum += nums[i][j];
            }
        }
        System.out.println((double)sum/8);
    }
}