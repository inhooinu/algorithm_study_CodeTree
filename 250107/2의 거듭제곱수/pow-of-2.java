import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = 1;

        while (true) {
            if (Math.pow(2, x) == n) {
                System.out.println(x);
                break;
            }
            x++;
        }        
    }
}