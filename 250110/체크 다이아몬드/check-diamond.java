import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int blanks = n-1;
        int stars = 1;

        for (int i=0; i<2*n-1; i++) {
            for (int j=0; j<blanks; j++) {
                System.out.print(" ");
            }
            for (int j=0; j<stars; j++) {
                if (j%2==0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            if (i<n-1) {
                blanks--;
                stars+=2;
            } else {
                blanks++;
                stars-=2;
            }

            System.out.println();
        }
    }
}