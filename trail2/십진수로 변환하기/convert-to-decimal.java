import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        ArrayList<Integer> digits = new ArrayList<>();
        for (int i=0; i<s.length(); i++) {
            digits.add(s.charAt(i) - '0');
        }
        
        int result = 0;
        for (int i=0; i<digits.size(); i++) {
            result = result*2 + digits.get(i);
        }

        System.out.println(result);
    }
}