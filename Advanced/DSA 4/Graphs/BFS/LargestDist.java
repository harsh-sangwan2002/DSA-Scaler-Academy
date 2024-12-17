import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LargestDist {
    public int maxHeight = 0;

    public int solve(int[] A) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            adjList.add(new ArrayList<Integer>());
        }
        Queue<Integer> q = new LinkedList<>();
        int root = -1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == -1) {
                q.add(i);
                root = i;
                break;
            }
        }
        while (!q.isEmpty()) {
            int s = q.size();
            for (int i = 0; i < s; i++) {
                int c = q.remove();
                for (int j = 0; j < A.length; j++) {
                    if (A[j] == c) {
                        adjList.get(c).add(j);
                        q.add(j);
                    }
                }
            }
        }
        doBfs(adjList, root);
        return maxHeight;
    }

    public int doBfs(ArrayList<ArrayList<Integer>> adjList, int node) {
        ArrayList<Integer> lst = adjList.get(node);
        int firstMaxHeight = 0;
        int secondMaxHeight = 0;
        for (int i = 0; i < lst.size(); i++) {
            int h = doBfs(adjList, lst.get(i));
            if (h > firstMaxHeight) {
                secondMaxHeight = firstMaxHeight;
                firstMaxHeight = h;
            } else if (h > secondMaxHeight) {
                secondMaxHeight = h;
            }
        }
        if ((firstMaxHeight + secondMaxHeight) > maxHeight) {
            maxHeight = firstMaxHeight + secondMaxHeight;
        }
        return firstMaxHeight + 1;
    }
}