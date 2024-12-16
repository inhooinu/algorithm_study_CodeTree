import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int gender = sc.nextInt();
        int age = sc.nextInt();

        if (gender==0) {
            System.out.print(age>=19 ? "MAN" : "BOY");
        } else {
            System.out.print(age>=19 ? "WOMAN" : "GIRL");
        }
    }
}