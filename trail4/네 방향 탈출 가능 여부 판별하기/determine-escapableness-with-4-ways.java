import java.util.*;
import java.io.*;

public class Main {

    static int[] dr = {-1,0,1,0};
    static int[] dc = {0,-1,0,1};
    static int n;
    static int m;
    static int[][] map;
    static boolean[][] visited;
    static boolean escape;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        visited = new boolean[n][m];

        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // for (int i=0; i<n; i++) {
        //     System.out.println(Arrays.toString(map[i]));
        // }

        Queue<int[]> q = new ArrayDeque<>();
        // (0,0)에서 시작
        visited[0][0] = true;
        q.offer(new int[] {0,0});

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int curR = cur[0];
            int curC = cur[1];
            if (curR==n-1 && curC==m-1) {
                escape = true;
                break;
            }

            for (int dir=0; dir<4; dir++) {
                int nr = curR + dr[dir];
                int nc = curC + dc[dir];

                if (!inRange(nr,nc)) continue;
                if (map[nr][nc]==0) continue;
                if (visited[nr][nc]) continue;

                visited[nr][nc] = true;
                q.offer(new int[] {nr,nc});
            }
        }

        System.out.println(escape ? 1 : 0);
    }

    public static boolean inRange(int r, int c) {
        return r>=0 && r<n && c>=0 && c<m;
    }
}