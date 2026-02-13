import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] l = new int[n];
        int[] r = new int[n];
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            r[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }
        
        int cnt = t%(3*n);
        for (int c=0; c<cnt; c++) {  // cnt 만큼 회전
        	int temp = l[n-1];
            for (int i=n-1; i>0; i--) {
            	l[i] = l[i-1];
            }
            l[0] = d[n-1];
            for (int i=n-1; i>0; i--) {
            	d[i] = d[i-1];
            }
            d[0] = r[n-1];
            for (int i=n-1; i>0; i--) {
            	r[i] = r[i-1];
            }
            r[0] = temp;
        }
        
//        System.out.println(Arrays.toString(l));
//        System.out.println(Arrays.toString(r));
//        System.out.println(Arrays.toString(d));
        for (int i=0; i<n; i++) {
        	System.out.print(l[i]+" ");
        }
        System.out.println();
        for (int i=0; i<n; i++) {
        	System.out.print(r[i]+" ");
        }
        System.out.println();
        for (int i=0; i<n; i++) {
        	System.out.print(d[i]+" ");
        }
    }
}