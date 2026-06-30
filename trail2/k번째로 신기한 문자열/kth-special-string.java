import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();

        String[] words = new String[n];
        for (int i=0; i<n; i++) {
            words[i] = sc.next();
        }

        Arrays.sort(words);
        // System.out.println(Arrays.toString(words));

        int cnt = 0;
        for (int i=0; i<n; i++) {
            if (words[i].startsWith(t)) {
                cnt++;
            }
            if (cnt==k) {
                System.out.println(words[i]);
                break;
            }
        }
    }
}