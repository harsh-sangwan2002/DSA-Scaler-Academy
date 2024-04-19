public class inversion_count {

    static long mod = (long) (1e9 + 7);

    private long merge(int[] A, int s, int e) {

        if (s >= e)
            return 0L;

        int mid = s + (e - s) / 2;
        long count = 0;

        count = (count + merge(A, s, mid)) % mod;
        count = (count + merge(A, mid + 1, e)) % mod;
        count = (count + mergeArrays(A, s, mid, e)) % mod;

        return count;
    }

    private long mergeArrays(int[] A, int s, int mid, int e) {

        int n1 = mid - s + 1, n2 = e - mid;
        long count = 0L;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++)
            left[i] = A[s + i];

        for (int j = 0; j < n2; j++)
            right[j] = A[mid + 1 + j];

        int i = 0, j = 0, k = s;

        while (i < n1 && j < n2) {

            if (left[i] <= right[j])
                A[k++] = left[i++];

            else {
                count = (count + n1 - i) % mod;
                A[k++] = right[j++];
            }
        }

        while (i < n1)
            A[k++] = left[i++];

        while (j < n2)
            A[k++] = right[j++];

        return count;
    }

    public int solve(int[] A) {

        int s = 0, e = A.length - 1;
        return (int) merge(A, s, e);
    }
}
