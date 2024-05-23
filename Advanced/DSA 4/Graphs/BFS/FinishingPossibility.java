import java.util.ArrayList;
import java.util.Arrays;

public class FinishingPossibility {
    public int solve(int A, int[] B, int[] C) {

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        int[] incEdges = new int[A + 1];
        for (int i = 0; i < A + 1; i++) {
            adjList.add(new ArrayList<Integer>());
        }
        Arrays.fill(incEdges, 0);
        for (int i = 0; i < B.length; i++) {
            adjList.get(B[i]).add(C[i]);
            incEdges[C[i]]++;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= A; i++) {
            if (incEdges[i] == 0) {
                ans.add(i);
            }
        }
        int cur = 0;
        while (cur < ans.size()) {
            @SuppressWarnings("rawtypes")
            ArrayList lst = adjList.get(ans.get(cur));
            for (int j = 0; j < lst.size(); j++) {
                int adjEle = (int) lst.get(j);
                if (incEdges[adjEle] > 0) {
                    incEdges[adjEle]--;
                }
                if (incEdges[adjEle] == 0) {
                    ans.add(adjEle);
                }
            }
            cur++;
        }
        if (ans.size() == A) {
            return 1;
        }
        return 0;
    }
}