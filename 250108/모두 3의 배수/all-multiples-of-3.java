import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        boolean satisfied = true;

        int num;
        for (int i=0; i<5; i++) {
            num = sc.nextInt();
            if (num%3!=0) {
                satisfied = false;
                break;
            }
        }

        System.out.println(satisfied? 1: 0);
    }
}