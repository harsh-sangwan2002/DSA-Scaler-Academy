import java.util.ArrayList;
import java.util.List;

public class directed_graph_path {

    private void dfs(List<Integer>[] graph, boolean[] vis, int src) {

        vis[src] = true;
        List<Integer> list = graph[src];

        for (int v : list) {

            if (!vis[v])
                dfs(graph, vis, v);
        }
    }

    public int solve(int A, int[][] B) {

        @SuppressWarnings("unchecked")
        List<Integer>[] graph = new ArrayList[A + 1];

        for (int i = 0; i < graph.length; i++)
            graph[i] = new ArrayList<>();

        for (int i = 0; i < B.length; i++) {

            int u = B[i][0], v = B[i][1];
            graph[u].add(v);
        }

        boolean[] vis = new boolean[A + 1];
        dfs(graph, vis, 1);

        return vis[A] ? 1 : 0;
    }
}
