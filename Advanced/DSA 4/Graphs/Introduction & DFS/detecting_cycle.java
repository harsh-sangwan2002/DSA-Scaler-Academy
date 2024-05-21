import java.util.ArrayList;
import java.util.List;

public class detecting_cycle {

    private boolean isCycle(List<Integer>[] graph, boolean[] vis, boolean[] st, int src) {

        vis[src] = true;

        for (int i = 0; i < graph[src].size(); i++) {

            int v = graph[src].get(i);

            if (st[v])
                return true;

            if (!vis[v]) {

                st[v] = true;

                if (isCycle(graph, vis, st, v))
                    return true;

                st[v] = false;
            }
        }

        return false;
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

        boolean[] st = new boolean[A + 1];
        st[1] = true;

        for (int i = 1; i <= A; i++) {

            if (isCycle(graph, vis, st, i))
                return 1;
        }

        return 0;
    }
}
