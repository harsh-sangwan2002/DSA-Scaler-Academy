public class water_container {

    public int maxArea(int[] A) {

        int max = 0;
        int i = 0, j = A.length - 1;

        while (i < j) {

            int min = Math.min(A[i], A[j]);
            int area = min * (j - i);
            max = Math.max(area, max);

            if (A[i] < A[j])
                i++;

            else
                j--;
        }

        return max;
    }
}
