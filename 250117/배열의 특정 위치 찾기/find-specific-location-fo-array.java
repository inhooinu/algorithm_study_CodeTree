import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int sum2 = 0;
        int sum3 = 0;
        for (int i=0; i<10; i++) {
            int num = sc.nextInt();

            if ((i+1)%2==0) {
                sum2+=num;
            }
            if ((i+1)%3==0) {
                sum3+=num;
            }
        }
        System.out.printf("%d %.1f", sum2, (double)sum3/3);
    }
}