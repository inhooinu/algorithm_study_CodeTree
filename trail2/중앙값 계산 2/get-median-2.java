import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> nums = new ArrayList<>();
        for (int i=0; i<n; i++) {
            nums.add(sc.nextInt());

            if ((i+1)%2!=0) {
                Collections.sort(nums);
                System.out.print(nums.get(i/2)+" ");
            }
        }
    }
}