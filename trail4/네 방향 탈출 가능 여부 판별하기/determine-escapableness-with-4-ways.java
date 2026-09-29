import java.util.*;

public class Main {

    static int[] dr = {-1,0,1,0};
    static int[] dc = {0,-1,0,1};

    static int n;
    static int m;
    static int[][] grid;
    static boolean[][] visited;
    static Queue<int[]> q;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        grid = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                grid[i][j] = sc.nextInt();
        visited = new boolean[n][m];

        q = new ArrayDeque<>();
        visited[0][0] = true;
        q.offer(new int[]{0,0});
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int r = cur[0];
            int c = cur[1];
            if (r==n-1 && c==m-1) {  // 도착
                System.out.println(1);
                return;
            }
            
            for (int dir=0; dir<4; dir++) {
                int nr = r + dr[dir];
                int nc = c + dc[dir];

                if (!inRange(nr,nc)) continue;
                if (visited[nr][nc]) continue;
                if (grid[nr][nc]==0) continue;
                visited[nr][nc] = true;
                q.offer(new int[] {nr,nc});
            }
        }

        System.out.println(0);
    }

    public static boolean inRange(int r, int c) {
        return r>=0 && r<n && c>=0 && c<m;
    }
}