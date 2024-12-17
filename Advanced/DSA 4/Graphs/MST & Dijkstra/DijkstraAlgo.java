import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstraAlgo {

    private class Edge {
        int dest;
        int wt;

        Edge(int dest, int wt) {
            this.dest = dest;
            this.wt = wt;
        }
    }

    private class Node implements Comparable<Node> {
        int vertex;
        int dist;

        Node(int vertex, int dist) {
            this.vertex = vertex;
            this.dist = dist;
        }

        @Override
        public int compareTo(Node other) {
            return Integer.compare(this.dist, other.dist);
        }
    }

    public int[] solve(int A, int[][] B, int C) {
        if (A == 0)
            return new int[] { -1 };

        int[] res = new int[A];
        Arrays.fill(res, Integer.MAX_VALUE);
        res[C] = 0;

        @SuppressWarnings("unchecked")
        List<Edge>[] graph = new ArrayList[A];
        for (int i = 0; i < A; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : B) {
            int u = edge[0], v = edge[1], wt = edge[2];
            graph[u].add(new Edge(v, wt));
            graph[v].add(new Edge(u, wt));
        }

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(C, 0));

        while (!pq.isEmpty()) {
            Node node = pq.poll();
            int u = node.vertex;
            int dist = node.dist;

            if (dist > res[u])
                continue;

            for (Edge edge : graph[u]) {
                int v = edge.dest;
                int newDist = res[u] + edge.wt;

                if (newDist < res[v]) {
                    res[v] = newDist;
                    pq.add(new Node(v, newDist));
                }
            }
        }

        for (int i = 0; i < A; i++) {
            if (res[i] == Integer.MAX_VALUE) {
                res[i] = -1;
            }
        }

        return res;
    }
}
