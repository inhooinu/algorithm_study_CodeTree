import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cnt = 0;
        while (true) {
            if (n==1) {
                System.out.println(cnt);
                break;
            }

            if (n%2==0) {
                n = n/2;
            } else {
                n = n*3 + 1;
            }
            cnt++;
        }
    }
}