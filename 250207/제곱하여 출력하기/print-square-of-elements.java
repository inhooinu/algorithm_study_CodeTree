import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];
        for (int i=0; i<n; i++) {
            int num = sc.nextInt();
            nums[i] = num*num;
        }

        for (int i=0; i<n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}