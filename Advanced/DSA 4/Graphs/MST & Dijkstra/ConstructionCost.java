import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class ConstructionCost {

    private class Edge {

        int dest;
        int wt;

        Edge(int dest, int wt) {
            this.dest = dest;
            this.wt = wt;
        }
    }

    public int solve(int A, int[][] B) {

        if (B.length == 0 || B[0].length == 0)
            return 0;

        int ans = 0;
        List<Edge>[] graph = new ArrayList[A + 1];
        boolean[] vis = new boolean[A + 1];

        for (int i = 0; i < graph.length; i++)
            graph[i] = new ArrayList<Edge>();

        for (int i = 0; i < B.length; i++) {

            int u = B[i][0], v = B[i][1], wt = B[i][2];
            graph[u].add(new Edge(v, wt));
            graph[v].add(new Edge(u, wt));
        }

        int src = B[0][0];
        vis[src] = true;

        PriorityQueue<Edge> pq = new PriorityQueue<>((e1, e2) -> e1.wt - e2.wt);

        for (Edge neigh : graph[src])
            pq.add(neigh);

        while (pq.size() != 0) {

            Edge edge = pq.remove();
            int u = edge.dest;
            int wt = edge.wt;

            if (vis[u])
                continue;

            ans += wt;
            vis[u] = true;

            for (Edge neigh : graph[u]) {

                if (!vis[neigh.dest])
                    pq.add(neigh);
            }
        }

        return ans;
    }
}
