import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();

        if (word1.length() != word2.length()) {
            System.out.println("No");
            return;
        }

        char[] word1Arr = word1.toCharArray();
        char[] word2Arr = word2.toCharArray();

        Arrays.sort(word1Arr);
        Arrays.sort(word2Arr);
        for (int i=0; i<word1Arr.length; i++) {
            if (word1Arr[i]!=word2Arr[i]) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}