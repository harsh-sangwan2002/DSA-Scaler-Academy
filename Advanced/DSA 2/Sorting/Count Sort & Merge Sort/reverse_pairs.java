public class reverse_pairs {

    private int merge(int[] A, int s, int e) {
        if (s >= e) {
            return 0;
        }

        int mid = s + (e - s) / 2;
        int count = 0;

        count += merge(A, s, mid);
        count += merge(A, mid + 1, e);
        count += mergeArrays(A, s, mid, e);

        return count;
    }

    private int mergeArrays(int[] A, int s, int mid, int e) {
        int n1 = mid - s + 1;
        int n2 = e - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = A[s + i];
        }

        for (int j = 0; j < n2; j++) {
            right[j] = A[mid + 1 + j];
        }

        int i = 0, j = 0, k = s;
        int count = 0;

        while (i < n1 && j < n2) {
            if (1L * left[i] > 2L * right[j]) {
                count += (n1 - i); // Count all remaining elements in left array
                j++; // Move to the next element in the right array
            } else {
                i++; // Move to the next element in the left array
            }
        }

        i = 0; // Reset i for merging
        j = 0; // Reset j for merging

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                A[k++] = left[i++];
            } else {
                A[k++] = right[j++];
            }
        }

        while (i < n1) {
            A[k++] = left[i++];
        }

        while (j < n2) {
            A[k++] = right[j++];
        }

        return count;
    }

    public int solve(int[] A) {
        int s = 0, e = A.length - 1;
        return merge(A, s, e);
    }
}
