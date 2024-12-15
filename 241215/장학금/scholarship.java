import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int f = sc.nextInt();

        if (m<90) System.out.print(0);
        else if (f<90) System.out.print(0);
        else if (f<95) System.out.print(50000);
        else System.out.print(100000);
    }
}