import java.util.Scanner;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String command = sc.next();
            
            switch (command) {
                case "push_front":
                    int A = sc.nextInt();
                    list.addFirst(A);
                    break;

                case "push_back":
                    int B = sc.nextInt();
                    list.addLast(B);
                    break;

                case "pop_front":
                    System.out.println(list.pollFirst());
                    break;

                case "pop_back":
                    System.out.println(list.pollLast());
                    break;

                case "size":
                    System.out.println(list.size());
                    break;

                case "empty":
                    System.out.println(list.isEmpty() ? 1 : 0);
                    break;

                case "front":
                    System.out.println(list.peekFirst());
                    break;

                case "back":
                    System.out.println(list.peekLast());
                    break;
            }
        }
    }
}