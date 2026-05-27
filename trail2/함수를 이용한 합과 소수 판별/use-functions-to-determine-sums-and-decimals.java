import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = 0;
        for (int i=a; i<=b; i++) {
            if (isPrime(i) && isEvenSum(i)) cnt++;
        }
        System.out.println(cnt);
    }

    public static boolean isPrime(int n) {
        for (int i=2; i<n; i++) {
            if (n%i==0) return false;
        }
        return true;
    }

    public static boolean isEvenSum(int n) {
        int sum = 0;
        int num = n;
        while (num>0) {
            sum += num%10;
            num = num/10;
        }

        if (sum%2==0) return true;
        return false;
    }
}