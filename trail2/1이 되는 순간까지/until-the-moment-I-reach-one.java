import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = count(n);
        System.out.println(result);
    }

    public static int count(int n) {
        if (n==1) {
            return 0;
        }

        if (n%2==0) {
            n = n/2;
        } else {
            n = n/3;
        }
        return 1 + count(n);
    }
}