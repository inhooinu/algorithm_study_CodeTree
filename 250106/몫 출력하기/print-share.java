import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int num;
        int cnt=0;

        while(true) {
            num = sc.nextInt();
            if (num%2==0) {
                System.out.println(num/2);
                cnt++;
            }

            if (cnt>=3) {
                break;
            }
        }
    }
}