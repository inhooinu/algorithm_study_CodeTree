import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        int cnt = 0;
        int sum = 0;
        for (int i=0; i<10; i++) {
            int num = sc.nextInt();
            if (num>=0 && num<=200) {
                cnt++;
                sum+=num;
            }
        }
        System.out.printf("%d %.1f", sum, (double)sum/cnt);
    }
}