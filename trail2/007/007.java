import java.util.*;

class Mission {
    String code;
    char point;
    int time;

    public Mission(String code, char point, int time) {
        this.code = code;
        this.point = point;
        this.time = time;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        char point = sc.next().charAt(0);
        int time = sc.nextInt();

        Mission m = new Mission(code, point, time);
        System.out.println("secret code : " + m.code);
        System.out.println("meeting point : " + m.point);
        System.out.println("time : " + m.time);
    }
}