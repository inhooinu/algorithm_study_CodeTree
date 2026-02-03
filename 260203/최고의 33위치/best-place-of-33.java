import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        
        // for (int i=0; i<n; i++) {
        //     System.out.println(Arrays.toString(grid[i]));
        // }

        int maxCoin = 0;
        for (int i=0; i<n-2; i++) {
            for (int j=0; j<n-2; j++) {
                
                int sum = 0;
                for (int k=0; k<3; k++) {
                    for (int l=0; l<3; l++) {
                        sum += grid[i+k][j+l];
                    }
                }
                maxCoin = Math.max(maxCoin, sum);
            }
        }
        System.out.println(maxCoin);
    }
}