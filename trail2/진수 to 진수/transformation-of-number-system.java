import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        // A진수로 주어진 수 N을 B진수로 변환하기
        // A진수를 10진수로 바꾸기
        int num10 = 0;

        String strN = String.valueOf(n);
        for (int i=0; i<strN.length(); i++) {
            num10 = num10*a + (strN.charAt(i) - '0');
        }
        // System.out.println(num10);

        // 10진수 num10을 b진수로 변환
        ArrayList<Integer> list = new ArrayList<>();
        while (num10 > 0) {
            list.add(num10%b);
            num10 = num10/b;
        }
        // System.out.println(list);
        for (int i=list.size()-1; i>=0; i--) {
            System.out.print(list.get(i));
        }
    }
}