import java.util.*;
public class Main {

    static int[] dr = {0, 1};
    static int[] dc = {1, 0};

    static int n;
    static int m;
    static int[][] grid;
    static boolean[][] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        grid = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                grid[i][j] = sc.nextInt();
        visited = new boolean[n][m];
        
        System.out.println(dfs(0,0)? 1 : 0);
    }

    public static boolean dfs(int r, int c) {
        visited[r][c] = true;
        if (r==n-1 && c==m-1) {
            return true;
        }

        for (int dir=0; dir<2; dir++) {
            int nr = r + dr[dir];
            int nc = c + dc[dir];

            if (!inRange(nr, nc)) continue;
            if (grid[nr][nc]==0) continue;  // 뱀이 있으면
            if (visited[nr][nc]) continue;  // 이미 방문했으면
            if (dfs(nr, nc)) {
                return true;
            }
        }

        return false;
    }

    public static boolean inRange(int r, int c) {
        return r>=0 && r<n && c>=0 && c<m;
    }
}