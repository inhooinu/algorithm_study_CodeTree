import java.util.Scanner;

public class Main {

    public static String text;
    public static String pattern;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        text = sc.next();
        pattern = sc.next();
        
        int result = hasPattern();
        System.out.println(result);
    }

    public static int hasPattern() {
        for (int i=0; i<text.length()-pattern.length()+1; i++) {
            String subText = text.substring(i, i+pattern.length());
            if (subText.equals(pattern)) return i; 
        }
        return -1;
    }
}