import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        if (m<3) System.out.print("Winter");
        else if (m<6) System.out.print("Spring");
        else if (m<9) System.out.print("Summer");
        else if (m<12) System.out.print("Fall");
        else System.out.print("Winter");
    }
}