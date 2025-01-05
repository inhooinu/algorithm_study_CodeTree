import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = n;
        int cnt = 0;
        while (temp > 1) {
            cnt++;
            temp /= cnt;
        }

        System.out.print(cnt);
    }
}