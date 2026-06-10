import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = squaredSum(n);
        System.out.println(result);
    }

    public static int squaredSum(int n) {
        if (n<10) {
            return n*n;
        }

        return (n%10)*(n%10) + squaredSum(n/10);
    }
}