import java.util.Scanner;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();  // 식빵의 개수
        int m = sc.nextInt();  // 암호문의 개수
        String s = sc.next();

        LinkedList<Character> list = new LinkedList<>();
        for (int i=0; i<s.length(); i++) {
            list.add(s.charAt(i));
        }
        // System.out.println(list);

        ListIterator<Character> iterator = list.listIterator(list.size());

        for (int i = 0; i < m; i++) {
            String command = sc.next();

            switch (command) {
                case "L":
                    if (iterator.hasPrevious()) {
                        iterator.previous();
                    }
                    break;
                case "R":
                    if (iterator.hasNext()) {
                        iterator.next();
                    }
                    break;
                case "D":
                    if (iterator.hasNext()) {
                        iterator.next();
                        iterator.remove();
                    }
                    break;
                case "P":
                    char newBread = sc.next().charAt(0);
                    iterator.add(newBread);
                    break;
            }
        }
        // System.out.println(list);
        
        for (char bread: list) {
            System.out.print(bread);
        }
    }
}