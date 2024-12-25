import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int classroom = 0;
        int hallway = 0;
        int bathroom = 0;

        for (int i=1; i<=n; i++) {
            if (i%12==0) bathroom++;
            else if (i%3==0) hallway++;
            else if (i%2==0) classroom++;
        }

        System.out.print(classroom + " " + hallway + " " + bathroom);
    }
}