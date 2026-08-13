import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        
        // 10진수인 정수 n을 b진수로 변경하여 출력하기
        ArrayList<Integer> digits = new ArrayList<>();
        while (n>0) {
            digits.add(n%b);
            n /= b;
        }
        // System.out.println(digits);

        for (int i=digits.size()-1; i>=0; i--) {
            System.out.print(digits.get(i));
        }
    }
}