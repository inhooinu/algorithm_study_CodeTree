import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        swap(n,m);
    }

    public static void swap(int n, int m) {
        int temp = n;
        n = m;
        m = temp;

        System.out.println(n+" "+m);
    }
}