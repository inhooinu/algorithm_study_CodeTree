import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }

        abs(nums);
        for (int i=0; i<n; i++) {
            System.out.print(nums[i]+" ");
        }
    }

    public static void abs(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            if (arr[i]<0) {
                arr[i] = -arr[i];
            }
        }
    }
}