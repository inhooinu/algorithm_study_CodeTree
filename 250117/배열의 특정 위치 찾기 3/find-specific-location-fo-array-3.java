import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];

        int i=0;
        while (true) {
            arr[i] = sc.nextInt();
            if (arr[i]==0) {
                int sum = arr[i-1] + arr[i-2] + arr[i-3];
                System.out.println(sum);
                break;
            }
            i++;
        }
    }
}