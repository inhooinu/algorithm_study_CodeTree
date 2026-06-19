import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // System.out.println(n);
        
        String[] words = new String[n];
        for (int i=0; i<n; i++) {
            words[i] = br.readLine();
        }
        // System.out.println(Arrays.toString(words));
        Arrays.sort(words);
        for (int i=0; i<n; i++) {
            System.out.println(words[i]);
        }
    }
}