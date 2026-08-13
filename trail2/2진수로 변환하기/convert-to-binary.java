import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> digits = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n==0) {
            System.out.print(0);
        } else {
            while (n>=1) {
                digits.add(n%2);
                n = n/2;
            }

            for (int i=digits.size()-1; i>=0; i--) {
                System.out.print(digits.get(i));
            }
        }
    }
}