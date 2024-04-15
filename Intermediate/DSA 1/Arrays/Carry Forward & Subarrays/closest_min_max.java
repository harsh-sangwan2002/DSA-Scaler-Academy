public class closest_min_max {

    private int[] find(int[] arr) {

        int max = arr[0], min = arr[0];

        for (int val : arr) {

            max = Math.max(max, val);
            min = Math.min(min, val);
        }

        return new int[] { max, min };
    }

    public int solve(int[] A) {

        int[] maxMin = find(A);
        int max = maxMin[0], min = maxMin[1];

        if (max == min)
            return 1;

        int len = A.length, minIdx = -1, maxIdx = -1;

        for (int i = 0; i < A.length; i++) {

            if (A[i] == max) {

                if (minIdx != -1)
                    len = Math.min(len, i - minIdx + 1);

                maxIdx = i;
            }

            else if (A[i] == min) {

                if (maxIdx != -1)
                    len = Math.min(len, i - maxIdx + 1);

                minIdx = i;
            }
        }

        return len;
    }
}
