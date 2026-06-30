import java.util.*;

class User {
    String id;
    int level;

    public User() {
        id="codetree";
        level=10;
    }

    public User(String id, int level) {
        this.id=id;
        this.level=level;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        User user1 = new User();
        System.out.println("user "+user1.id+" lv "+user1.level);

        String id = sc.next();
        int level = sc.nextInt();
        User user2 = new User(id, level);
        System.out.println("user "+user2.id+" lv "+user2.level);
    }
}