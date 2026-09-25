import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<n; i++) {
            String command = sc.next();
            int num = 0;
            if (command.equals("push_back") || command.equals("get")) {
                num = sc.nextInt();
            }

            switch (command) {
                case "push_back":
                    list.add(num);
                    break;

                case "pop_back":
                    list.remove(list.size()-1);
                    break;
                
                case "size":
                    System.out.println(list.size());
                    break;
                
                case "get":
                    System.out.println(list.get(num-1));
                    break;
            }
        }
    }
}