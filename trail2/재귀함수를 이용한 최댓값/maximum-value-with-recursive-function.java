import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(max(nums, n-1));
    }

    public static int max(int[] nums, int idx) {
        if (idx==0) {
            return nums[idx];
        }

        int value = max(nums, idx-1);
        return (nums[idx] > value) ? nums[idx] : value;
    }
}