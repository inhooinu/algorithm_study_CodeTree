import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[11];

        nums[0] = 0;
        nums[1] = sc.nextInt();
        nums[2] = sc.nextInt();

        for (int i=3; i<=10; i++) {
            nums[i] = (nums[i-2] + nums[i-1])%10;
        }

        for (int i=1; i<=10; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}