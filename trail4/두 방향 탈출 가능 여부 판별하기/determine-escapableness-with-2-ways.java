import java.util.*;

public class Main {

    static int n;
    static int m;
    static int[][] map;
    static boolean[][] visited;
    static boolean escape;

    static int[] dr = {1, 0};
    static int[] dc = {0, 1};

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        map = new int[n][m];
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        visited =  new boolean[n][m];

        dfs(0,0);
        System.out.println(escape? 1 : 0);
    }

    public static void dfs(int r, int c) {
        if (r==n-1 && c==m-1 || escape) {
            escape = true;
            return;
        }
        visited[r][c] = true;

        for (int dir=0; dir<2; dir++) {
            int nr = r + dr[dir];
            int nc = c + dc[dir];

            if (!inRange(nr, nc)) continue;
            if (visited[nr][nc]) continue;
            if (map[nr][nc]==0) continue;
            dfs(nr, nc);
        }
    }

    static boolean inRange(int r, int c) {
        return r>=0 && r<n && c>=0 && c<m;
    }
}