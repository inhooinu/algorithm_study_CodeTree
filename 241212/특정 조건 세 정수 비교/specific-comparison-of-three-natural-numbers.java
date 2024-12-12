import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print(a<=b && a<=c ? 1 : 0);
        System.out.print(" ");
        System.out.print(a==b && a==c ? 1 : 0);
    }
}