import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] strArr = str.toCharArray();
        
        Arrays.sort(strArr);
        for (int i=0; i<strArr.length; i++) {
            System.out.print(strArr[i]);
        }
    }
}