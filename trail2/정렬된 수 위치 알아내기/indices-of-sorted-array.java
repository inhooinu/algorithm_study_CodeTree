import java.util.*;
import java.io.*;

class Num {
    int index;
    int n;

    Num (int index, int n) {
        this.index = index;
        this.n = n;
    }
}

class Rank {
    int index;
    int rank;

    Rank (int index, int rank) {
        this.index = index;
        this.rank = rank;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Num[] numbers = new Num[n];
        for (int i=0; i<n; i++) {
            int number = sc.nextInt();
            numbers[i] = new Num(i+1, number);
        }
        Arrays.sort(numbers, (a,b) -> {
            return Integer.compare(a.n, b.n);
        });

        Rank[] numRank = new Rank[n];
        for (int i=0; i<n; i++) {
            numRank[i] = new Rank(numbers[i].index, i+1);
        }
        Arrays.sort(numRank, (a,b) -> {
            return Integer.compare(a.index, b.index);
        });
        for (int i=0; i<n; i++) {
            System.out.print(numRank[i].rank + " ");
        }
    }
}