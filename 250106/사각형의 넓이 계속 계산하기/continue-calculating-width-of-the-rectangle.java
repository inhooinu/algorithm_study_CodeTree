import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int h;
        int v;
        char c;

        while (true) {
            h = sc.nextInt();
            v = sc.nextInt();
            c = sc.next().charAt(0);

            System.out.println(h*v);
            if (c=='C') {
                break;
            }
        }
    }
}