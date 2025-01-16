import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        double sum = 0;
        for (int i=0; i<n; i++) {
            double score = sc.nextDouble();
            sum += score;
        }

        double mean = sum/n;
        System.out.printf("%.1f", mean);
        System.out.println();

        if (mean>=4) {
            System.out.println("Perfect");
        } else if (mean>=3) {
            System.out.println("Good");
        } else {
            System.out.println("Poor");
        }
    }
}