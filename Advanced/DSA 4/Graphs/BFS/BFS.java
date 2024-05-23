import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public int solve(int A, int[][] B, int C, int D) {
        int[] dist = new int[A];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[C] = 0;
        @SuppressWarnings("unchecked")
        ArrayList<int[]>[] adj = new ArrayList[A];
        for (int i = 0; i < adj.length; i++)
            adj[i] = new ArrayList<>();
        for (int i = 0; i < B.length; i++) {
            adj[B[i][0]].add(new int[] { B[i][1], B[i][2] });
            adj[B[i][1]].add(new int[] { B[i][0], B[i][2] });
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(C);
        while (!queue.isEmpty()) {
            int srcNode = queue.poll();
            ArrayList<int[]> destNodes = adj[srcNode];
            for (int[] i : destNodes) {
                if (dist[i[0]] > dist[srcNode] + i[1]) {
                    queue.add(i[0]);
                    dist[i[0]] = dist[srcNode] + i[1];
                }
            }
        }
        return (dist[D] == Integer.MAX_VALUE) ? -1 : dist[D];
    }
}