import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printNumbers(n);
        System.out.println();
        printReverseNumbers(n);
    }

    public static void printNumbers(int n) {
        if (n==0) {
            return;
        }

        printNumbers(n-1);
        System.out.print(n+" ");
    }

    public static void printReverseNumbers(int n) {
        if (n==0) {
            return;
        }

        System.out.print(n+" ");
        printReverseNumbers(n-1);
    }
}