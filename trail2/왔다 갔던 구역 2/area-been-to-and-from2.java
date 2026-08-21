import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[2001];
        int cur = 1000;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            String dir = sc.next();
            
            if (dir.equals("R")) {
                for (int j=cur; j<cur+x; j++) {
                    arr[j]++;
                }
                cur += x;
            } else if (dir.equals("L")) {
                for (int j=cur-1; j>=cur-x; j--) {
                    arr[j]++;
                }
                cur -= x;
            }
        }

        int cnt = 0;
        for (int i=0; i<2001; i++) {
            if (arr[i]>=2) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}