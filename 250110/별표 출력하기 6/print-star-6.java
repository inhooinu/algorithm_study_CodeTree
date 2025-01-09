import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int blanks = 0;
        int stars = 2*n-1;

        for (int i=0; i<(2*n-1); i++) {
            for (int j=0; j<blanks; j++) {
                System.out.print("  ");
            }
            for (int j=0; j<stars; j++) {
                System.out.print("* ");
            }
            System.out.println();

            if (i<(n-1)) blanks++;
            else blanks--;

            if (i<(n-1)) stars-=2;
            else stars+=2;
        }
    }
}