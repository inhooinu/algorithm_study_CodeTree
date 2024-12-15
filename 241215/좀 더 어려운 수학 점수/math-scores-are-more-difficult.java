import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int mathA = sc.nextInt();
        int englishA = sc.nextInt();
        int mathB = sc.nextInt();
        int englishB = sc.nextInt();

        if (mathA > mathB) System.out.print("A");
        else if (mathA < mathB) System.out.print("B");
        else System.out.print(englishA > englishB ? "A" : "B");
    }
}