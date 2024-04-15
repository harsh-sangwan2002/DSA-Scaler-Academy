public class count_elements {

    public int solve(int[] A) {

        if (A.length == 1)
            return 0;

        int max = A[0];

        for (int val : A)
            max = Math.max(val, max);

        int count = 0;

        for (int val : A) {

            if (val != max)
                count++;
        }

        return count;
    }
}
