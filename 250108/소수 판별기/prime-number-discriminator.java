import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;

        for (int i=2; i<n; i++) {
            if (n%i==0) {
                isPrime = false;
            }
        }
        System.out.println(isPrime? "P" : "C");
    }
}