public class count_sort {

    private int[] findMinMax(int[] arr) {

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int val : arr) {

            min = Math.min(val, min);
            max = Math.max(val, max);
        }

        return new int[] { min, max };
    }

    public int[] solve(int[] A) {

        int[] min_max = findMinMax(A);
        int min = min_max[0], max = min_max[1];
        int[] freq = new int[max - min + 1];

        for (int val : A)
            freq[val - min]++;

        int[] res = new int[A.length];
        int idx = 0;

        for (int i = 0; i < freq.length; i++) {
            for (int j = 1; j <= freq[i]; j++)
                res[idx++] = i + min;
        }

        return res;
    }
}
