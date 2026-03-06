import java.util.HashMap;
import java.util.Scanner;
public class Main {

    static HashMap<Integer, Integer> numCnt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] queries = new int[m];
        for (int i = 0; i < m; i++) {
            queries[i] = sc.nextInt();
        }
        numCnt = new HashMap<>();

        for (int i=0; i<n; i++) {
            if (numCnt.containsKey(arr[i])) {
                numCnt.put(arr[i], numCnt.get(arr[i])+1);
            } else {
                numCnt.put(arr[i], 1);
            }
        }

        for (int i=0; i < m; i++) {
            System.out.print(numCnt.getOrDefault(queries[i], 0)+" ");
        }
    }
}