import java.util.*;

public class Main {

    static int n;  // 정점의 수
    static int m;  // 간선의 수
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int cnt;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList[n+1];
        visited = new boolean[n+1];

        for (int i=1; i<=n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i=0; i<m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            graph[x].add(y);
            graph[y].add(x);
        }

        // for (int i=1; i<=n; i++) {
        //     System.out.println(graph[i]);
        // }

        dfs(1);
        System.out.println(cnt);
    }

    public static void dfs(int cur) {
        visited[cur] = true;

        for (int next: graph[cur]) {
            if (!visited[next]) {
                cnt++;
                dfs(next);
            }
        }
    }     
}