import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;

public class MaximumDepth {

    public ArrayList<Integer> solve(int A, ArrayList<Integer> B, ArrayList<Integer> C, ArrayList<Integer> D,
            ArrayList<Integer> E, ArrayList<Integer> F) {
        // build the the adjacency list to store the treee
        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<ArrayList<Integer>>(A + 1);
        HashMap<Integer, TreeSet<Integer>> map = new HashMap<>();
        for (int i = 0; i <= A; i++) {
            adjacencyList.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < B.size(); i++) {
            adjacencyList.get(B.get(i)).add(C.get(i));
            adjacencyList.get(C.get(i)).add(B.get(i));
        }

        // Build the hashmap using the BFS algorithm
        BFS(adjacencyList, map, D);
        // after this function call the hashmap is build with levesl and the
        // corresponding values of nodes at that levesl

        int maxDepth = map.size() - 1;

        return processQueries(maxDepth, E, F, map);

    }

    @SuppressWarnings("unchecked")
    void BFS(ArrayList<ArrayList<Integer>> adjacencyList, HashMap<Integer, TreeSet<Integer>> map,
            ArrayList<Integer> D) {
        Queue<Integer> queue = new LinkedList<>(); // queue is implemented as a linked list.
        int depth = 0;
        ArrayList<Integer> visited = new ArrayList<Integer>(adjacencyList.size()); // to mark the vertices which are
                                                                                   // visited
        for (int i = 0; i < adjacencyList.size(); i++) {
            visited.add(0); // initializing the visited array
        }
        queue.add(1); // added the first node to the queue
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                int x = queue.poll(); // deleting from the head of the queue
                visited.set(x, 1); // marking the node to be visited

                if (map.containsKey(depth)) {
                    map.get(depth).add(D.get(x - 1));
                } else {
                    @SuppressWarnings("rawtypes")
                    TreeSet temp = new TreeSet();
                    temp.add(D.get(x - 1));
                    map.put(depth, temp);
                }
                if (adjacencyList.get(x) == null)
                    continue;
                for (int i = 0; i < adjacencyList.get(x).size(); i++) {
                    int v = adjacencyList.get(x).get(i);
                    if (visited.get(v) == 0) {
                        queue.add(v);
                    }
                }

            }

            depth++;

        }

    }

    ArrayList<Integer> processQueries(int maxDepth, ArrayList<Integer> E, ArrayList<Integer> F,
            HashMap<Integer, TreeSet<Integer>> map) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < E.size(); i++) {
            int level = E.get(i) % (maxDepth + 1);
            TreeSet<Integer> nodesAtLevel = map.get(level);
            Integer val = nodesAtLevel.ceiling(F.get(i));
            // int val = BinarySearch(nodesAtLevel, F.get(i));
            if (val == null)
                result.add(-1);
            else
                result.add(val);
        }

        return result;
    }

    /*
     * int BinarySearch( TreeSet<Integer> nodesAtLevel, int key) {
     * int n = nodesAtLevel.size();
     * int low=0, high= n-1 ,ans = -1,mid=0;
     * 
     * while( low <= high ) {
     * mid = (low+high) / 2;
     * if(nodesAtLevel.get(mid) == key)
     * return nodesAtLevel.get(mid);
     * else if( nodesAtLevel.get(mid) >key )
     * {
     * ans = nodesAtLevel.get(mid);
     * high = mid-1;
     * }
     * else {
     * low = mid+1;
     * }
     * }
     * return ans;
     * }
     */

}