import java.util.Scanner;

class Bomb {
    String uCode;
    char lColor;
    int time;

    public Bomb(String uCode, char lColor, int time) {
        this.uCode=uCode;
        this.lColor=lColor;
        this.time=time;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String uCode = sc.next();
        char lColor = sc.next().charAt(0);
        int time = sc.nextInt();
        
        Bomb b = new Bomb(uCode, lColor, time);
        System.out.println("code : "+b.uCode);
        System.out.println("color : "+b.lColor);
        System.out.println("second : "+b.time);
    }
}