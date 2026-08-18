import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        
        int result10 = 0;
        for (int i=0; i<binary.length(); i++) {
            // System.out.println(binary.charAt(i));
            int n = binary.charAt(i) - '0';
            result10 = result10*2 + n;
        }
        // System.out.println(result10);
        result10 = result10 * 17;

        // 10진수 -> 2진수 변환
        ArrayList<Integer> list = new ArrayList<>();
        while (result10 > 0) {
            list.add(result10%2);
            result10 = result10/2;
        }
        // System.out.println(list);
        for (int i=list.size()-1; i>=0; i--) {
            System.out.print(list.get(i));
        }
    }
}