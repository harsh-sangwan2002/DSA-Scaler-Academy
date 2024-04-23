public class max_ones_count {

    public int[] maxone(int[] A, int B) {

        int left = 0, right = 0;
        int max = 0, zeroCount = 0;
        int st = 0;

        while (right < A.length) {

            if (A[right] == 0)
                zeroCount++;

            while (zeroCount > B) {

                if (A[left] == 0)
                    zeroCount--;

                left++;
            }

            int onesCount = right - left + 1;
            if (onesCount > max) {
                max = onesCount;
                st = left;
            }

            right++;
        }

        int[] res = new int[max];
        for (int i = 0; i < max; i++)
            res[i] = st + i;

        return res;
    }
}
