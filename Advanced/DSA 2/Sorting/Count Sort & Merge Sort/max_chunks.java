public class max_chunks {

    public int solve(int[] A) {

        int count = 0, max = 0;

        for (int i = 0; i < A.length; i++) {

            max = Math.max(max, A[i]);

            if (max == i)
                count++;
        }

        return count;
    }
}
