import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class generate_subsets {

    private void generate(int[] arr, int idx, List<Integer> list, List<List<Integer>> res) {

        res.add(new ArrayList<>(list));

        for (int i = idx; i < arr.length; i++) {

            list.add(arr[i]);
            generate(arr, i + 1, list, res);
            list.remove(list.size() - 1);
        }
    }

    public int[][] subsets(int[] A) {

        Arrays.sort(A);
        List<List<Integer>> res = new ArrayList<>();

        generate(A, 0, new ArrayList<>(), res);

        int[][] arr = new int[res.size()][];
        int idx = 0;

        for (List<Integer> list : res) {

            int[] temp = new int[list.size()];
            int curr = 0;

            for (int val : list)
                temp[curr++] = val;

            arr[idx++] = temp;
        }

        return arr;
    }
}
