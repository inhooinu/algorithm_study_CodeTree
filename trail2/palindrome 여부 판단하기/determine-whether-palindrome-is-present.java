import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        if (a.equals(reverse(a))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static String reverse(String s) {
        String r = "";
        for (int i=s.length()-1; i>=0; i--) {
            r += s.charAt(i);
        }
        return r;
    }
}