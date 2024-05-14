import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsets2 {

    private void generate(int[] arr, int idx, List<List<Integer>> res, List<Integer> list) {

        if (!res.contains(list))
            res.add(new ArrayList<>(list));

        for (int i = idx; i < arr.length; i++) {

            list.add(arr[i]);
            generate(arr, i + 1, res, list);
            list.remove(list.size() - 1);
        }
    }

    public int[][] subsetsWithDup(int[] A) {

        Arrays.sort(A);

        List<List<Integer>> res = new ArrayList<>();

        generate(A, 0, res, new ArrayList<>());

        int[][] arr = new int[res.size()][];
        int idx1 = 0;

        for (List<Integer> list : res) {

            int[] temp = new int[list.size()];
            int idx2 = 0;

            for (int val : list)
                temp[idx2++] = val;

            arr[idx1++] = temp;
        }

        return arr;
    }
}
