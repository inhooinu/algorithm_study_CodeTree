import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        char o = st.nextToken().charAt(0);
        int c = Integer.parseInt(st.nextToken());

        if (o=='+') {
            System.out.print(a+" "+o+" "+c+" = ");
            System.out.println(sum(a,c));
        } else if (o=='-') {
            System.out.print(a+" "+o+" "+c+" = ");
            System.out.println(sub(a,c));
        } else if (o=='/') {
            System.out.print(a+" "+o+" "+c+" = ");
            System.out.println(div(a,c));
        } else if (o=='*') {
            System.out.print(a+" "+o+" "+c+" = ");
            System.out.println(mul(a,c));
        } else {
            System.out.println("False");
        }
    }

    public static int sum(int a, int c) {
        return a+c;
    }
    public static int sub(int a, int c) {
        return a-c;
    }
    public static int div(int a, int c) {
        return a/c;
    }
    public static int mul(int a, int c) {
        return a*c;
    }
}