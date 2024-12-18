import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        for (int i=0; i<3; i++) {
            char symptom = sc.next().charAt(0);
            int temperature = sc.nextInt();

            if (symptom=='Y' && temperature>=37) cnt+=1;
        }

        System.out.print(cnt>=2 ? 'E' : 'N');
    }
}