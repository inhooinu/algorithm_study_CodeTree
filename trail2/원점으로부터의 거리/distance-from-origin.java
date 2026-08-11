import java.util.*;
import java.io.*;

class Point implements Comparable<Point> {
    int num;
    int x;
    int y;
    int dist;

    Point(int num, int x, int y) {
        this.num = num;
        this.x = x;
        this.y = y;
        dist = Math.abs(x) + Math.abs(y);
    }

    public int compareTo(Point p) {
        if (this.dist != p.dist) {
            return Integer.compare(this.dist, p.dist);
        }
        return Integer.compare(this.num, p.num);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Point[] points = new Point[n];
        for (int i=0; i<n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            points[i] = new Point(i+1, x, y);
        }
        Arrays.sort(points);

        for (int i=0; i<n; i++) {
            System.out.println(points[i].num);
        }
    }
}