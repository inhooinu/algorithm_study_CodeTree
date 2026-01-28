import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] lowercase = new String[5][3];
        String[][] uppercase = new String[5][3];

        for (int i=0; i<5; i++) {
            for (int j=0; j<3; j++) {
                String alpha = sc.next();
                uppercase[i][j] = alpha.toUpperCase();
            }
        }

        for (int i=0; i<5; i++) {
            for (int j=0; j<3; j++) {
                System.out.print(uppercase[i][j] + " ");
            }
            System.out.println();
        }
    }
}