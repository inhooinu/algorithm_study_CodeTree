import java.util.Scanner;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i=0; i<n; i++) {
            String command = sc.next();
            switch (command) {
                case "push":
                    int num = sc.nextInt();
                    queue.offer(num);
                    break;
                case "pop":
                    System.out.println(queue.poll());
                    break;
                case "size":
                    System.out.println(queue.size());
                    break;
                case "empty":
                    System.out.println(queue.isEmpty() ? 1 : 0);
                    break;
                case "front":
                    System.out.println(queue.peek());
                    break;
            }
        }
    }
}