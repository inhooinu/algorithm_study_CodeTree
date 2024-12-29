import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(a/b);
        System.out.print(".");

        int remainder = a%b;
        for (int i=0; i<20; i++) {
            System.out.print((remainder*10)/b);
            remainder = (remainder*10)%b;
        }
    }
}